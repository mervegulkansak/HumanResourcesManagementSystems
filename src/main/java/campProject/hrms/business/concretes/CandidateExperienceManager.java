package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateExperienceService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateExperienceDao;
import campProject.hrms.entities.concretes.CandidateExperience;

@Service
public class CandidateExperienceManager implements CandidateExperienceService{

	private CandidateExperienceDao candidateExperienceDao;
	
	public CandidateExperienceManager(CandidateExperienceDao candidateExperienceDao) {
		super();
		this.candidateExperienceDao = candidateExperienceDao;
	}

	@Override
	public DataResult<List<CandidateExperience>> getAll() {
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.findAll(),true,"Experience data is listed");
	}

	@Override
	public DataResult<List<CandidateExperience>> getBySortFinishedDate() {
		Sort sort = Sort.by(Direction.DESC,"finished_year");
		return new SuccessDataResult<List<CandidateExperience>>(this.candidateExperienceDao.findAll(sort),true,"Data sorted");
	}

	@Override
	public Result add(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		return new SuccessResult("Experience is added");
	}

	@Override
	public Result delete(CandidateExperience cnadidateExperience) {
		this.candidateExperienceDao.delete(cnadidateExperience);
		return new SuccessResult("Experience is deleted");
	}

	@Override
	public Result update(CandidateExperience candidateExperience) {
		this.candidateExperienceDao.save(candidateExperience);
		return new SuccessResult("Experience is updated");
	}

}
