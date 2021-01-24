package hw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hw.dao.UniversityRepository;
import hw.domain.University;
import hw.university.dao.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

	@Autowired
	private UniversityRepository universityServiceImpl;
	
	@Override
	public University save(University university) {
		  
		 return universityServiceImpl.saveAndFlush(university);
	}

	@Override
	public University findById(Integer id) {
		
		return universityServiceImpl.getOne(id);
	}

	@Override
	public University update(University university) {
		return universityServiceImpl.save(university);
	}

	@Override
	public void deleteById(Integer id) {
		universityServiceImpl.deleteById(id);
	}

	@Override
	public List<University> findAll() {
		return universityServiceImpl.findAll();
	}

	@Override
	public List<University> findByName(String name) {
		return universityServiceImpl.findByName(name);
	}

	@Override
	public List<University> findByLevel(String level) {
		return universityServiceImpl.findByLevel(level);
	}

	
}
