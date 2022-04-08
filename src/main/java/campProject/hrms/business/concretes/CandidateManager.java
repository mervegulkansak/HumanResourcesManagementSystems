package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateDao;
import campProject.hrms.entities.concretes.Candidate;
@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
	
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>(this.candidateDao.findAll(),true,"Candidate is data listed");
	}

	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate is added");
	}

	@Override
	public Result delete(Candidate candidate) {
		this.candidateDao.delete(candidate);
		return new SuccessResult("Candidate is deleted");
	}

	@Override
	public Result update(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult("Candidate is updated");
	}

}
