package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.PostApiDtos.RequestDto;
import com.example.demo.PostApiDtos.ResponseDto;
import com.example.demo.Repository.PostRepository;
import com.fasterxml.jackson.core.JsonProcessingException;

@Service
public class PostServiceImpl implements PostServices{
	
	@Autowired
	public PostRepository postRepo;

	@Override
	public ResponseDto addData(RequestDto data) throws JsonProcessingException {
		
		return this.postRepo.PostData(data);
	}
	

}
