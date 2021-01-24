package hw.university.dao.service;

import java.util.List;

import hw.domain.University;

public interface UniversityService {

	University save(University university);

	University findById(Integer id);

	University update(University university);

	void deleteById(Integer id);

	List<University> findAll();

	List<University> findByName(String name);

	List<University> findByLevel(String level);
}
