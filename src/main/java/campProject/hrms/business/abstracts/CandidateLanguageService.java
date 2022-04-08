package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateLanguage;

public interface CandidateLanguageService {

	DataResult<List<CandidateLanguage>> getAll();
	Result add(CandidateLanguage candidateLanguage);
	Result delete(CandidateLanguage candidateLanguage);
	Result update(CandidateLanguage CandidateLanguage);
}
