package com.example.demo.PostApiDtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestDto {
	
	@JsonProperty("inputParameters")
	public Object inputParameters;
	
	
	

}
