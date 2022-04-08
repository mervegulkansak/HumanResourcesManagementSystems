package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.CandidateWebSite;

public interface CandidateWebsiteDao extends JpaRepository<CandidateWebSite, Integer>{

}
