package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateEducationService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateEducationDao;
import campProject.hrms.entities.concretes.CandidateEducation;

@Service
public class CandidateEducationManager implements CandidateEducationService {

	private CandidateEducationDao candidateEducationDao;
	@Autowired
	public CandidateEducationManager(CandidateEducationDao candidateEducationDao) {
		super();
		this.candidateEducationDao = candidateEducationDao;
	}

	@Override
	public DataResult<List<CandidateEducation>> getAll() {
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.findAll(),true,"Data Listed");
	}

	@Override
	public DataResult<List<CandidateEducation>> getBySortFinishedYear() {
		Sort sort = Sort.by(Direction.DESC,"finished_year");
		return new SuccessDataResult<List<CandidateEducation>>(this.candidateEducationDao.findAll(sort),true,"Data sorted");
	}

	@Override
	public Result add(CandidateEducation candidateEducation) {
		this.candidateEducationDao.save(candidateEducation);
		return new SuccessResult("Data added");
	}

	@Override
	public Result delete(CandidateEducation candidateEducation) {
		this.candidateEducationDao.delete(candidateEducation);
		return new SuccessResult("Data deleted");
	}

	@Override
	public Result update(CandidateEducation candidateEducation) {
		this.candidateEducationDao.save(candidateEducation);
		return new SuccessResult("Data updated");
	}

}
