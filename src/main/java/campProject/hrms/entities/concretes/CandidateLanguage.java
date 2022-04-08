package campProject.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "candidate_languages")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CandidateLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	@Column(name = "level")
	private int level;
	
	@ManyToOne()
	@JoinColumn(name = "candidate_cv_id")
	private CandidateCv candidateCv;
	
}
