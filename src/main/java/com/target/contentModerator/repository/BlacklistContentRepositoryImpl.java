package com.target.contentModerator.repository;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.target.contentModerator.model.BlacklistContent;


@Repository
public class BlacklistContentRepositoryImpl{
	
	//Method reads the objectionable content from a text file and return the list if words.
	//Text file is used instead of an active DB connection here
	
	public List<String> findDistinctLanguages() throws IOException {

		String fileName = "C:/Users/eo903e/Downloads/contentModerator-master/contentModerator-master/ContentModeratorAPI/src/main/resources/objectionable_content.txt";
		Path path = Paths.get(fileName);
		byte[] bytes = Files.readAllBytes(path);
		List<String> langList = Files.readAllLines(path, StandardCharsets.UTF_8);
		return langList;
	}

}
