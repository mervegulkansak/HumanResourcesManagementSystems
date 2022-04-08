package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}
