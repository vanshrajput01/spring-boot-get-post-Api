package com.example.demo.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.PostApiDtos.RequestDto;
import com.example.demo.PostApiDtos.ResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Repository
public class PostRepository {
	
	@Autowired
	public EntityManager entityManager;

	public ResponseDto PostData(RequestDto data) throws JsonProcessingException {
		
		StoredProcedureQuery q = entityManager.createStoredProcedureQuery("apps.XXCUST_EMP_POST_API");
		
		q.registerStoredProcedureParameter("Request",String.class,ParameterMode.IN);
		q.registerStoredProcedureParameter("response", String.class, ParameterMode.OUT);
		
		ObjectMapper objMapper = new ObjectMapper();
		String json = objMapper.writeValueAsString(data);
		
		q.setParameter("Request", json);
		q.execute();
		
		String responseData = (String) q.getOutputParameterValue("response");
		ResponseDto response;
		
		
		response = objMapper.readValue(responseData, ResponseDto.class);
	
		
		return response;
		

	}
	
	

}
