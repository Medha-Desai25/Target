package com.target.contentModerator.model;

import org.springframework.data.annotation.Id;

public class BlacklistContent {

	@Id //Primary Key
	String id;
	String word;
	String lang;


	/**
	 * @param id
	 * @param word
	 * @param lang
	 */
	public BlacklistContent(String id, String word, String lang) {

		this.id = id;
		this.word = word;
		this.lang = lang;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return "BlackListContent [+id = " + id + " word=" + word + ", lang=" + lang + "]";
	}

}
