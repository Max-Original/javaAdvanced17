package hw.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import hw.domain.University;

public interface UniversityRepository extends JpaRepository<University, Integer>, CrudRepository<University, Integer>{

	List<University> findByName(String name);
	
	List<University> findByLevel(String level);
	
	
}
