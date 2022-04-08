package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.CandidateLanguage;

public interface CandidateLanguageDao extends JpaRepository<CandidateLanguage, Integer> {

}
