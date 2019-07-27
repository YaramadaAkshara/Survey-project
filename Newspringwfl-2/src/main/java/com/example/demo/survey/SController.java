package com.example.demo.survey;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.validation.Valid;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
@RequestMapping("/")
public class SController {
	
	@Autowired
	UserService userobj;
	@Autowired
	Answerrepo ans;
	@Autowired
	Answerservice service;
	@PostMapping(value="/postdb",consumes=MediaType.TEXT_PLAIN_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String gettoken(@RequestBody String token) throws UnsupportedEncodingException,IOException
	{
		
	    
			 String payload=token.split("\\.")[1];
			  
			String varString=new String( Base64.decodeBase64(payload),"UTF-8");
			Userentity user = new ObjectMapper().readValue(varString, Userentity.class);

			userobj.save(user);
			return null;
			
	}
	
	@PostMapping(value="/answers",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String getanswer(@RequestBody Answers answer)
	{
		ans.save(answer);
		return null;
	}
	
	@GetMapping(value="/answersreturn/{email}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Answers> getAnswersByEmail(@PathVariable (value = "email", required = true) @Valid String email ) throws Exception
    {
        Answers datasent=service.getAnswerDetails(email);
        return new ResponseEntity<> (datasent,HttpStatus.OK);
    }
	  
	 @PutMapping(value = "/update/{email}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Answers> updateStudent(@PathVariable (value = "email") String email,@RequestBody Answers updateans) throws Exception
	    {
		   Answers dataget=service.getfilledDetails(email);
		   if(dataget==null)
		   {
			   return null;
		   }
		   else
		   {
	        return new ResponseEntity<>(ans.save(updateans),HttpStatus.OK);
		   }
	    }
	

}
