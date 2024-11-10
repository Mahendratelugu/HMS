package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.entity.Doctor;
import com.example.springbootdemo.service.DoctorService;
@RestController
@RequestMapping
public class DoctorController {
	@Autowired
	private DoctorService doctorservice;
	@PostMapping("/demo")
	public ResponseEntity<Doctor>saveDoctor(@RequestBody Doctor doctor)
	{
		return new ResponseEntity<Doctor>(doctorservice.saveDoctor(doctor),HttpStatus.CREATED);
	}
	@PostMapping("/adddoctor/{}")
	public ResponseEntity<String>assignPatienceToDoctor(@PathVariable("Pid")int Pid,@PathVariable("dname")String dname)
	{
		return new ResponseEntity<String>(doctorservice.assignPatienceToDoctor(Pid,dname),HttpStatus.CREATED);
	}

}
