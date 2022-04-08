package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateSkillsService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateSkillsDao;
import campProject.hrms.entities.concretes.CandidateSkills;

@Service
public class CandidateSkillsManager implements CandidateSkillsService {

	private CandidateSkillsDao candidateSkillsDao;
	@Autowired
	public CandidateSkillsManager(CandidateSkillsDao candidateSkillsDao) {
		super();
		this.candidateSkillsDao = candidateSkillsDao;
	}

	@Override
	public DataResult<List<CandidateSkills>> getAll() {
		return new SuccessDataResult<List<CandidateSkills>>(this.candidateSkillsDao.findAll(),true,"Data Listed,Skills");
	}

	@Override
	public Result add(CandidateSkills candidateSkills) {
		this.candidateSkillsDao.save(candidateSkills);
		return new SuccessResult("Skills added");
	}

	@Override
	public Result delete(CandidateSkills candidateSkills) {
		this.candidateSkillsDao.delete(candidateSkills);
		return new SuccessResult("Skills deleted");
	}

	@Override
	public Result update(CandidateSkills candidateSkills) {
		this.candidateSkillsDao.save(candidateSkills);
		return new SuccessResult("Skills updated");
	}

}
