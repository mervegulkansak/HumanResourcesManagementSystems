package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.EmployerService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.dataAccess.abstracts.EmployerDao;
import campProject.hrms.entities.concretes.Employer;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;


@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), true, "Data Listelendi");
		
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Employer Registration Successful");
	}

	


}
