package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Candidate;

public interface CandidateService {
	DataResult<List<Candidate>> getAll();
	Result add(Candidate candidate);
	Result delete(Candidate candidate);
	Result update(Candidate candidate);

}
