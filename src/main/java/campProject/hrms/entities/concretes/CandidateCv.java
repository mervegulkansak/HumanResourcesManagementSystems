package campProject.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidate_cv")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidateCv {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@OneToMany(mappedBy = "candidateCv")
	private List<CandidateEducation> candidateEducations;
	
	@OneToMany(mappedBy = "candidateCv")
	private List<CandidateExperience> candidateExperiences;
	
	@OneToMany(mappedBy = "candidateCv")
	private List<CandidateLanguage> candidateLanguages;
	
	@OneToMany(mappedBy = "candidateCv")
	private List<CandidateSkills> candidateSkills;
	
	@OneToMany(mappedBy = "candidateCv")
	private List<CandidateWebSite> candidateWebsites;
	
	@OneToMany(mappedBy = "candidateCv")
	private List<CandidateCoverLetter> candidateCoverLetters;
	
	
}
