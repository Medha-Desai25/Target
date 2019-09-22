package com.target.contentModerator.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.target.contentModerator.model.BlacklistContent;

@Service
public interface BlacklistContentRepository{
	
	public List<BlacklistContent> findByLang(String lang);

}
