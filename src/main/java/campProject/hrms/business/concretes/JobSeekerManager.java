package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.JobSeekerService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.JobSeekerDao;
import campProject.hrms.entities.concretes.JobSeeker;

@Service
public class JobSeekerManager implements JobSeekerService {

	public JobSeekerDao jobSeekerDao;

	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), true, "Data listed");
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Job Seeker registrion successful");
	}

	
	
	
	
}
