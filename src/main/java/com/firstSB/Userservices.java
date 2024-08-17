package com.firstSB;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;import org.springframework.data.repository.query.Param;

public interface Userservices extends CrudRepository<UserEntity, Integer> {

	public  List<UserEntity> findById(int id);
	public  List<UserEntity> findByName(String name);
	public  List<UserEntity> findByRoll(int roll);
	public void deleteById(int id);
	
	//**JSQL(JAVA PARSISTANCE QUERY LANGEUGE** OR (HQL(HIBERNET QUERY LANGUAGE))   
@Query("select u FROM UserEntity u")
    public List<UserEntity> getAllUserEntities();
	//in this function the n of the (name) not write capital because when i declear  in the UserEntity class in small letter
@Query("select u from UserEntity u where u.name=:n")
  public List<UserEntity> getByName(@Param("n") String name);
//**JSQL(JAVA PARSISTANCE QUERY LANGEUGE** OR (HQL(HIBERNET QUERY LANGUAGE))
@Query("select u from UserEntity u where u.name=:n and u.fName=:f")
public List<UserEntity> getByNameAndFname(@Param("n") String name ,@Param("f") String fName);

@Query(value="select * from user_entity",nativeQuery = true)
public List<UserEntity> getAllByNativeQuery();


}
