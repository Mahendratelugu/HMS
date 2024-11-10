package com.example.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.entity.Patience;
import com.example.springbootdemo.service.PatienceService;
@RestController
@RequestMapping("/demo")
public class PatienceController {
	@Autowired
	private PatienceService patienceservice;
	@PostMapping("/addPatience")
	public ResponseEntity<Patience>saveEmp(@RequestBody Patience patience)
	{
		return new ResponseEntity<Patience>(patienceservice.savepatience(patience),HttpStatus.CREATED);
	}
	@GetMapping("/Patience")
	public List<Patience> getPatience()
	{
		List<Patience>pl=patienceservice.getAllpatience();
		return pl;
	}
	@GetMapping("/getPatienceById/{Pid}")
	public ResponseEntity<Patience>getEmpById(@PathVariable("Pid") int Pid)
	{
		return new ResponseEntity<Patience>(patienceservice.getPatienceById(Pid),HttpStatus.OK);
	}

	@PutMapping("/updPatienceById/{Pid}")
	public ResponseEntity<Patience> updEmpById(@PathVariable("Pid") Patience patience)
	{

		return new ResponseEntity<Patience>(patienceservice.savepatience(patience),HttpStatus.OK);
	}
	@DeleteMapping("/delPatience/{Pid}")
	public ResponseEntity<String> delPatience(@PathVariable("Pid")int Pid)
	{
		patienceservice.delPatience(Pid);
		return new ResponseEntity<>("deleted",HttpStatus.ACCEPTED);
	}
}



