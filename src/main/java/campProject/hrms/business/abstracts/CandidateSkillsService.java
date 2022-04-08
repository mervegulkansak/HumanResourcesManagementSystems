package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateSkills;

public interface CandidateSkillsService {

	DataResult<List<CandidateSkills>> getAll();
	Result add(CandidateSkills candidateSkills);
	Result delete(CandidateSkills candidateSkills);
	Result update(CandidateSkills candidateSkills);
}
