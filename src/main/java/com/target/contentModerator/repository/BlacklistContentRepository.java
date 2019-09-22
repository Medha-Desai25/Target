package com.target.contentModerator.repository;

import java.util.List;

import org.springframework.stereotype.Service;

import com.target.contentModerator.model.BlacklistContent;

@Service
public interface BlacklistContentRepository{
	
	public List<BlacklistContent> findByLang(String lang);

	public void deleteAll();

	public void deleteById(String id);

	public List<BlacklistContent> findAll();

	public BlacklistContent save(BlacklistContent blackListContent);
	
	
}
