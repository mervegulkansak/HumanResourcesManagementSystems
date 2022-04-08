package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateCoverLetter;

public interface CandidateCoverLetterService {

	DataResult<List<CandidateCoverLetter>> getAll();
	Result add(CandidateCoverLetter candidateCoverLetter);
	Result delete(CandidateCoverLetter candidateCoverLetter);
	Result update(CandidateCoverLetter candidateCoverLetter);
}
