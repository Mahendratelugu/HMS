package com.example.springbootdemo.service;

import java.util.List;

import com.example.springbootdemo.entity.Patience;

public interface PatienceService {
	Patience savepatience (Patience patience);
	List<Patience> getAllpatience();
	Patience getPatienceById(int Pid);
	Patience updPaitenceById (Patience patience,int Pid);
	void delPatience (int Pid);

}
