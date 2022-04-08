package campProject.hrms.business.concretes;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.PositionService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.PositionDao;
import campProject.hrms.entities.concretes.JobPosition;


@Service
public class PositionManager implements PositionService {

	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.positionDao.findAll(),true,"Data Listed");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.positionDao.save(jobPosition);
		return new SuccessResult("Job Position registrion successful");
	}

	

	
	
}
