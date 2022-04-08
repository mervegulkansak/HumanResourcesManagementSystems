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
@Table(name = "candidate_experiences")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidateExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "company_name")
	@NotBlank
	@NotNull
	private String companyName;
	
	@NotNull
	@NotBlank
	@Column(name = "started_year")
	private String startedYear;
	
	@Column(name = "finished_year")
	private String finishedYear;
	
	@ManyToOne()
	@JoinColumn(name = "job_position_id")
	private JobPosition jobPosition;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_cv_id")
	private CandidateCv candidateCv;
	
}
