package campProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jobAdvertisements")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne()
	@JoinColumn(name ="employer_id")
	private Employer employer;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "city_id")
	private City city;
	
	@Column(name = "job_description")
	@NotNull
	@NotBlank
	private String jobDescription;
		
	@Column(name = "min_salary_scale")
	private double minSalaryScale;
	
	@Column(name = "max_salary_scale")
	private double maxSalaryScale;
	
	@Column(name = "available_position_count")
	@NotNull
	@NotBlank
	private int availablePositionCount;
	
	@Column(name = "release_date")
	@NotNull
	@NotBlank
	private String releaseDate;
	
	@Column(name = "application_deadline")
	@NotNull
	@NotBlank
	private String applicationDeadline;
}
