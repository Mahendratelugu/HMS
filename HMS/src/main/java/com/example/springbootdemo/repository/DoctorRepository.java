package com.example.springbootdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,String>{
	@Query("select d from Doctor d where d.dname=?1")	
	Doctor findBydname(String dname);
	

}
