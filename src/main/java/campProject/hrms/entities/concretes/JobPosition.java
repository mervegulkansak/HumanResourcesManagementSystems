package campProject.hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "JobPosition")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {
		 @Id
		 @Column(name = "id")
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 private int id;
		 
		 @Column(name = "position_name")
		 @NotNull
		 @NotBlank
		 private String positionName;
		 
		@OneToMany(mappedBy = "job_position")
		private JobAdvertisement jobAdvertisement;
		
		@OneToMany(mappedBy = "job_position")
		private CandidateExperience candidateExperience;
		
		
	
}
