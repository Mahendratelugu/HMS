package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.Doctor;

public interface DoctorService {
	Doctor saveDoctor(Doctor doctor);
	String assignPatienceToDoctor(int Pid, String dname);

}
