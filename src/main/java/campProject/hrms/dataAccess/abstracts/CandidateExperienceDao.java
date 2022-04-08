package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.CandidateExperience;

public interface CandidateExperienceDao extends JpaRepository<CandidateExperience, Integer>{

}
