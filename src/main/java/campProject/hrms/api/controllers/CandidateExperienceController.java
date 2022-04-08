package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateExperienceService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateExperience;

@RestController
@RequestMapping("/candidateExperiences")
public class CandidateExperienceController {

	private CandidateExperienceService candidateExperienceService;

	@Autowired
	public CandidateExperienceController(CandidateExperienceService candidateExperienceService) {
		super();
		this.candidateExperienceService = candidateExperienceService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateExperience>> getAll(){
		return this.candidateExperienceService.getAll();
	}
	
	@GetMapping("/getBySortFinishedDate")
	public DataResult<List<CandidateExperience>> getBySortFinishedDate(){
		return this.candidateExperienceService.getBySortFinishedDate();
	}

	@PostMapping("/add")
	public Result add(CandidateExperience candidateExperience) {
		return this.candidateExperienceService.add(candidateExperience);
	}
	
	@DeleteMapping("/delete")
	public Result delete(CandidateExperience candidateExperience) {
		return this.candidateExperienceService.delete(candidateExperience);
	}
	
	@PutMapping("/update")
	public Result update(CandidateExperience candidateExperience) {
		return this.candidateExperienceService.update(candidateExperience);
	}
}
