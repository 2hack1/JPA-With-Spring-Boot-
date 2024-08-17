package com.firstSB;

import java.util.List;

import javax.xml.transform.Source;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestJpaInBootApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(TestJpaInBootApplication.class, args);
	Userservices service=context.getBean(Userservices.class);

	//	**** this is predifind function ****
	
//  UserEntity user=new UserEntity();
//	user.setName("atu");
//	user.setRoll(3);
//	user.setfName("mam");
//	UserEntity user1=service.save(user);
//	System.out.println(user1);
	
	//*** delete **
//	UserEntity uu=new UserEntity();
//	uu.setId(102);
//	service.delete(uu);
	
	////**** costom functions  not  have a body 
	
	//****1***//
//	List<UserEntity>users=service.findById(302);	
//	users.forEach(e->System.out.println(users));
	
	//****2****//
//	List<UserEntity>kkk=service.findByName("aman");
//	kkk.forEach(e->System.out.println(e));
		
//	service.deleteById(552);
//	service.deleteById(502);
    	
	 /// ***MAKE BY @QUERY ANNOTATION GREAT***
	// 	NOT USE  CONDITIONS get all data form DB
	List<UserEntity> uu=service.getAllUserEntities();
	uu.forEach(e->System.out.println(e) );
	System.out.println("____________________________________");
	 
	// ***come data from DB by a name***
//	List<UserEntity> entities =service.getByName("aman goyal");
//	entities.forEach(e->System.out.println(e));
	
//	List<UserEntity> entities=service.getByNameAndFname("aman goyal","shuman goyal");
//	entities.forEach(e->System.out.println(e));
	
	List<UserEntity> entities=service.getAllByNativeQuery();
	entities.forEach(e->System.out.println(e));
	}

}
