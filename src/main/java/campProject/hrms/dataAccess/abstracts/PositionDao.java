package campProject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import campProject.hrms.entities.concretes.JobPosition;

public interface PositionDao extends JpaRepository<JobPosition, Integer>{

}
