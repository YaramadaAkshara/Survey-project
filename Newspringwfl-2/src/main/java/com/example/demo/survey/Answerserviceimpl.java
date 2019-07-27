package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public  abstract class Answerserviceimpl implements Answerservice {
	
	@Autowired
	Answerrepo repo;
	
	
	
	public Answers getAnswerDetails(String email) throws Exception {
		// TODO Auto-generated method stub
		
	Answers me =repo.finduserbyemail(email);
		return me;
	}
	public Answers getfilledDetails(String email) throws Exception {
		// TODO Auto-generated method stub
		
	Answers me =repo.finduserdetailsemail(email);
		return me;
	}

}