package com.example.demo.survey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public   class Answerserviceimpl implements Answerservice {
	
	@Autowired
	private final Answerrepo repo;
	
	public Answerserviceimpl(Answerrepo repo)
	{
		this.repo=repo;
	}
	
	public Answers getAnswerDetails(String email1) throws Exception {
		// TODO Auto-generated method stub
		
	Answers me =repo.finduserbyemail(email1);
		return me;
	}
	public Answers getfilledDetails(String email1) throws Exception {
		// TODO Auto-generated method stub
		
	Answers me =repo.finduserdetailsemail(email1);
		return me;
	}

}