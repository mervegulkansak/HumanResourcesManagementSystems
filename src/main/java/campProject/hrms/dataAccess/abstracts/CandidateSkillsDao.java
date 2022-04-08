package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.CandidateSkills;

public interface CandidateSkillsDao extends JpaRepository<CandidateSkills, Integer>{

}
