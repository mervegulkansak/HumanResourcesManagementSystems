package campProject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import campProject.hrms.business.abstracts.CandidateWebsiteService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessDataResult;
import campProject.hrms.core.utilities.results.SuccessResult;
import campProject.hrms.dataAccess.abstracts.CandidateWebsiteDao;
import campProject.hrms.entities.concretes.CandidateWebSite;

@Service
public class CandidateWebSiteManager implements CandidateWebsiteService {

	private CandidateWebsiteDao candidateWebSiteDao;
	
	@Autowired
	public CandidateWebSiteManager(CandidateWebsiteDao candidateWebSiteDao) {
		super();
		this.candidateWebSiteDao = candidateWebSiteDao;
	}
	
	@Override
	public DataResult<List<CandidateWebSite>> getAll() {
		return new SuccessDataResult<List<CandidateWebSite>>(this.candidateWebSiteDao.findAll(),true,"Data Listed,Candidate Web Site");
	}

	@Override
	public Result add(CandidateWebSite candidateWebSite) {
		this.candidateWebSiteDao.save(candidateWebSite);
		return new SuccessResult("Web site adding successful");
	}


	@Override
	public Result delete(CandidateWebSite candidateWebsiteSite) {
		this.candidateWebSiteDao.delete(candidateWebsiteSite);
		return new SuccessResult("Delete successful");
	}

	@Override
	public Result update(CandidateWebSite candidateWebSite) {
		this.candidateWebSiteDao.save(candidateWebSite);
		return new SuccessResult("Update Successful");
	}

}
