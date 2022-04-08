package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateEducationService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateEducation;

@RestController
@RequestMapping("/candidateEducations")
public class CandidateEducationController {

	private CandidateEducationService candidateEducationService;

	@Autowired
	public CandidateEducationController(CandidateEducationService candidateEducationService) {
		super();
		this.candidateEducationService = candidateEducationService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateEducation>> getAll(){
		return this.candidateEducationService.getAll();
	}
	
	@GetMapping("/getBySortFinishedYear")
	public DataResult<List<CandidateEducation>> getBySortFinishedYear(){
		return this.candidateEducationService.getBySortFinishedYear();
	}
	
	@PostMapping("/add")
	public Result add(CandidateEducation candidateEducaation) {
		return this.candidateEducationService.add(candidateEducaation);
	}
	
	@DeleteMapping("/delete")
	public Result delete(CandidateEducation candidateEducation) {
		return this.candidateEducationService.delete(candidateEducation);
	}
	
	@PutMapping("/update")
	public Result update(CandidateEducation candidateEducation) {
		return this.candidateEducationService.update(candidateEducation);
	}
}
