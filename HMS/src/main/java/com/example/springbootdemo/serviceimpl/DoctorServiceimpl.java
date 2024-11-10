package com.example.springbootdemo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.entity.Doctor;
import com.example.springbootdemo.entity.Patience;
import com.example.springbootdemo.repository.DoctorRepository;
import com.example.springbootdemo.repository.PatienceRepository;
import com.example.springbootdemo.service.DoctorService;
@Service
public class DoctorServiceimpl implements DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
	@Autowired
	private PatienceRepository patienceRepository;

	@Override
	public Doctor saveDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		return doctorRepository.save(doctor);
	}

	@Override
	public String assignPatienceToDoctor(int Pid, String dname) {
		// TODO Auto-generated method stub
		Patience patience=patienceRepository.findById(Pid).get();
		Doctor doctor=doctorRepository.findById(dname).get();
		List<Patience>Patiencelist=new ArrayList<>();
		Patiencelist.add(patience);
		doctorRepository.save(doctor);
		return "assignment has done";
	}

}
