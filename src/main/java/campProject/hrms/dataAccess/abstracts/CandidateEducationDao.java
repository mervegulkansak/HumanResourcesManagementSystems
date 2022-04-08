package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.CandidateEducation;

public interface CandidateEducationDao extends JpaRepository<CandidateEducation, Integer> {

}
