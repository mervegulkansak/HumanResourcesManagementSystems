package campProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import campProject.hrms.core.entities.User;
import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JobSeeker")
//@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{

	
	
	@Column(name = "FirstName")
	@NotNull
	@NotBlank
	private String firstName;
	
	@Column(name = "LastName")
	@NotNull
	@NotBlank
	private String lastName;
	
	@Column(name ="identificationNumber")
	@NotNull
	@NotBlank
	private String identificationNumber;
	
	@Column(name = "birthYear")
	@NotNull
	@NotBlank
	private String birthYear;
	
	
	
	
	
	
}
