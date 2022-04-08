package campProject.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateCoverLetterService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateCoverLetterDao;
import campProject.hrms.entities.concretes.CandidateCoverLetter;
@Service
public class CandidateCoverLetterManager implements CandidateCoverLetterService{

	private CandidateCoverLetterDao candidateCoverLetterDao;
	
	@Autowired
	public CandidateCoverLetterManager(CandidateCoverLetterDao candidateCoverLetterDao) {
		super();
		this.candidateCoverLetterDao = candidateCoverLetterDao;
	}

	@Override
	public DataResult<List<CandidateCoverLetter>> getAll() {
		return new SuccessDataResult<List<CandidateCoverLetter>>(this.candidateCoverLetterDao.findAll(),true,"Data listed");
	}

	@Override
	public Result add(CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.save(candidateCoverLetter);
		return new SuccessResult("Data saved");
	}

	@Override
	public Result delete(CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.delete(candidateCoverLetter);
		return new SuccessResult("Data deleted");
	}

	@Override
	public Result update( CandidateCoverLetter candidateCoverLetter) {
		this.candidateCoverLetterDao.save(candidateCoverLetter);
		return new SuccessResult("Data updated");
		
	
	}

}
