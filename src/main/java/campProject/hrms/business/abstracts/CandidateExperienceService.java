package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateExperience;

public interface CandidateExperienceService {

	DataResult<List<CandidateExperience>> getAll();
	DataResult<List<CandidateExperience>> getBySortFinishedDate();
	Result add(CandidateExperience candidateExperience);
	Result delete(CandidateExperience cnadidateExperience);
	Result update(CandidateExperience candidateExperience);
	
}
