package com.example.demo.survey;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface Answerrepo extends JpaRepository<Answers, Integer>{

	
	@Query(value="select 'userqA1','userqA2','userqA3','userqA4','userqA5'"+"from Answers"+ " where email = ?1 ", nativeQuery = true)
	Answers finduserbyemail(String email1);
	
	@Query(value="select a.'userqA1',a.'userqA2',a.'userqA3',a.'userqA4',a.'userqA5'"+"from Answers a"+
	"natural join Userentity e on e.uemail=a.email"+"where a.email = ?1", nativeQuery = true)
	Answers finduserdetailsemail(String email1);
   }






