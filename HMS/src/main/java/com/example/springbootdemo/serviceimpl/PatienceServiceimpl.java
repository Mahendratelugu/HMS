package com.example.springbootdemo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.springbootdemo.entity.Patience;
import com.example.springbootdemo.repository.PatienceRepository;
import com.example.springbootdemo.service.PatienceService;
@Service
public class PatienceServiceimpl implements PatienceService {
	@Autowired
	private PatienceRepository patienceRepository;

	@Override
	public Patience savepatience(Patience patience) {
		// TODO Auto-generated method stub
		return patienceRepository.save(patience);
	}

	@Override
	public List<Patience> getAllpatience() {
		// TODO Auto-generated method stub
		return patienceRepository.findAll();
	}

	@Override
	public Patience getPatienceById(int Pid) {
		// TODO Auto-generated method stub
		return patienceRepository.findById(Pid).get();
	}

	@Override
	public Patience updPaitenceById(Patience patience, int Pid) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Patience existingpatience=patienceRepository.findById(Pid).get();
		return patienceRepository.save(patience);
	}

	@Override
	public void delPatience(int Pid) {
		// TODO Auto-generated method stub
		patienceRepository.deleteById(Pid);
		
	}

}
