package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.JobAdvertisementService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.JobAdvertisementDao;
import campProject.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(), true, "Data Listed");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job Advertisement registrion successful");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByDate() {
		Sort sort = Sort.by(Direction.ASC,"releaseDate");
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort),true,"Data Yayın Tarihine Göre Listelendi");
	}


	@Override
	public Result deActiveJobAdvertisement(int id) {
		this.jobAdvertisementDao.deActiveJobAdvertisement(id);
		return new SuccessResult("Job Advertisement is deactive");
	}


	



	
}
