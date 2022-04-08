package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	DataResult<List<JobAdvertisement>> getAll();
	Result add(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getByDate();
	Result deActiveJobAdvertisement(int id);
}
