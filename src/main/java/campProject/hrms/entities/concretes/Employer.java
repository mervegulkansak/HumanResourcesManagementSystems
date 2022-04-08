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
@Table(name = "Employer")
//@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer extends User{

	
	
	@Column(name = "company_name")
	@NotNull
	@NotBlank
	private String companyName;
	
	@Column(name = "web_site")
	@NotNull
	@NotBlank
	private String webSite;
		
	
	@Column(name = "phone_number")
	@NotNull
	@NotBlank
	private String phoneNumber;
	
	
}
