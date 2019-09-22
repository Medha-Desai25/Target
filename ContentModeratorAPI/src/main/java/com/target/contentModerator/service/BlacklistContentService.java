/**
 * 
 */
package com.target.contentModerator.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.contentModerator.model.BlacklistContent;
import com.target.contentModerator.repository.BlacklistContentRepository;
import com.target.contentModerator.repository.BlacklistContentRepositoryImpl;

/**
 * @author MedhaD
 *
 */

@Service
public class BlacklistContentService {
	
	
	@Autowired
	private BlacklistContentRepository blacklistContentRepository;
	
	@Autowired
	private BlacklistContentRepositoryImpl blacklistContentRepositoryImpl;
	
	
	public List<BlacklistContent> getAllBlackListContentByLang(String lang){
		
		return blacklistContentRepository.findByLang(lang);
		
		
	}

	
	
}
