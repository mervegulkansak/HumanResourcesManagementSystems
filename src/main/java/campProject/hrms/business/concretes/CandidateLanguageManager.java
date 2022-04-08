package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateLanguageService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateLanguageDao;
import campProject.hrms.entities.concretes.CandidateLanguage;

@Service
public class CandidateLanguageManager implements CandidateLanguageService {

	private CandidateLanguageDao candidateLanguageDao;
	
	public CandidateLanguageManager(CandidateLanguageDao candidateLanguageDao) {
		super();
		this.candidateLanguageDao = candidateLanguageDao;
	}

	@Override
	public DataResult<List<CandidateLanguage>> getAll() {
		return new SuccessDataResult<List<CandidateLanguage>>(this.candidateLanguageDao.findAll(),true,"Data Listed");
	}

	@Override
	public Result add(CandidateLanguage candidateLanguage) {
		this.candidateLanguageDao.save(candidateLanguage);
		return new SuccessResult("Language added");
	}

	@Override
	public Result delete(CandidateLanguage candidateLanguage) {
		this.candidateLanguageDao.delete(candidateLanguage);
		return new SuccessResult("Candidate is deleted");
	}

	@Override
	public Result update(CandidateLanguage candidateLanguage) {
		this.candidateLanguageDao.save(candidateLanguage);
		return new SuccessResult("Candidate is updated");
	}

}
