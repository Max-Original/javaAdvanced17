package hw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import hw.domain.University;
import hw.university.dao.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
	
	UniversityService bean = ctx.getBean(UniversityService.class);
	
	University university = new University();
	
	university.setAmountOfStudents(300);
	university.setName("Norm");
	
	//save to DB
	
	bean.save(university);
	
	//read from DB
	
	System.out.println(bean.findByName("Norm"));
	
	//update
	
	University update = bean.findById(1);
	update.setName("Normas");
	
	bean.update(update);
	
	
	System.out.println(bean.findById(1));
	
	// remove
	bean.deleteById(1);
	
	
	System.out.println(bean.findAll());
	}

}
