package campProject.hrms.business.abstracts;

import java.util.List;

import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateWebSite;

public interface CandidateWebsiteService {


	DataResult<List<CandidateWebSite>> getAll();
	Result add(CandidateWebSite candidateWebSite);
	Result delete(CandidateWebSite candidateWebsiteSite);
	Result update(CandidateWebSite candidateWebSite);
}
