package hw.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column
	private String name;
	
	@Column
	private String level;
	
	@Column
	private Integer amountOfUniversity;
	
	@Column
	private Integer amountOfStudents;
	
	@Column
	private String addressOfUniversity;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Integer getAmountOfUniversity() {
		return amountOfUniversity;
	}
	public void setAmountOfUniversity(Integer amountOfUniversity) {
		this.amountOfUniversity = amountOfUniversity;
	}
	public Integer getAmountOfStudents() {
		return amountOfStudents;
	}
	public void setAmountOfStudents(Integer amountOfStudents) {
		this.amountOfStudents = amountOfStudents;
	}
	public String getAddressOfUniversity() {
		return addressOfUniversity;
	}
	public void setAddressOfUniversity(String addressOfUniversity) {
		this.addressOfUniversity = addressOfUniversity;
	}
	@Override
	public String toString() {
		return "University [name=" + name + ", level=" + level + ", amountOfUniversity=" + amountOfUniversity
				+ ", amountOfStudents=" + amountOfStudents + ", addressOfUniversity=" + addressOfUniversity + "]";
	}
	
	
	
	
}
