package com.example.demo.Services;

import com.example.demo.PostApiDtos.RequestDto;
import com.example.demo.PostApiDtos.ResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PostServices {

	ResponseDto addData(RequestDto data) throws JsonProcessingException;
	

}
