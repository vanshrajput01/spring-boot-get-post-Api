package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.PostApiDtos.RequestDto;
import com.example.demo.PostApiDtos.ResponseDto;
import com.example.demo.Services.PostServices;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class PostAPIController {
	
	@Autowired
	private PostServices postServices;
	
	@PostMapping(value = "/postapi/AddData",consumes = MediaType.APPLICATION_JSON_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseDto addData(@RequestBody RequestDto data) throws JsonProcessingException {
		
		return this.postServices.addData(data);
		
	}

}
