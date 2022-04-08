package campProject.hrms.business.abstracts;

import java.util.List;


import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobPosition;


public interface PositionService {

	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
	
}
