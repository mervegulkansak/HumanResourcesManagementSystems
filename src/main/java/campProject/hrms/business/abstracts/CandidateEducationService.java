package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateEducation;

public interface CandidateEducationService {

	DataResult<List<CandidateEducation>> getAll();
	DataResult<List<CandidateEducation>> getBySortFinishedYear();
	Result add(CandidateEducation candidateEducation);
	Result delete(CandidateEducation candidateEducation);
	Result update(CandidateEducation candidateEducation);
}
