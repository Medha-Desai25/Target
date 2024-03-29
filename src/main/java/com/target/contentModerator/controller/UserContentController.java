/**
 * 
 */
package com.target.contentModerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.target.contentModerator.model.ReviewResult;
import com.target.contentModerator.model.UserContent;
import com.target.contentModerator.service.UserContentReviewService;

/**
 * @author MedhaD
 *
 */
@RestController
public class UserContentController {
	
	@Autowired
	private UserContentReviewService userContentReviewService;
	
	/**
	 * Reviews the usercontent and returns the list of objectionable words , if present
	 * @param userContent
	 * @return
	 */
	//Conversion of response to JSON happens internally as  Spring’s MappingJackson2HttpMessageConverter automatically converts review result to JSON respnse
	@RequestMapping("/reviewContent")
	public ReviewResult  reviewContent(@RequestBody UserContent userContent) {
		
		return userContentReviewService.reviewContent(userContent);
	}
}
