package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.CandidateCoverLetter;

public interface CandidateCoverLetterDao extends JpaRepository<CandidateCoverLetter, Integer> {

}
