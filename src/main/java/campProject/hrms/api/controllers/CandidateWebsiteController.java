package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateWebsiteService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateWebSite;
@RestController
@RequestMapping("/api/websites")
public class CandidateWebsiteController {

	private CandidateWebsiteService candidateWebSiteService;
	@Autowired
	public CandidateWebsiteController(CandidateWebsiteService candidateWebSiteService) {
		super();
		this.candidateWebSiteService = candidateWebSiteService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateWebSite>> getAll(){
		return this.candidateWebSiteService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CandidateWebSite candidateWebsite) {
		return this.candidateWebSiteService.add(candidateWebsite);
	}
	
	@DeleteMapping("/delete")
	public Result delete(@RequestBody CandidateWebSite candidateWebSite) {
		return this.candidateWebSiteService.delete(candidateWebSite);
	}
	
	@PutMapping("/update")
	public Result update(@RequestBody CandidateWebSite candidateWebSite) {
		return this.candidateWebSiteService.update(candidateWebSite);
	}
}
