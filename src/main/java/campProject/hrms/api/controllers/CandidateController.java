package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

	private CandidateService candidateService;
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<Candidate>> getAll(){
		return this.candidateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	@DeleteMapping("delete")
	public Result delete(Candidate candidate) {
		return this.candidateService.delete(candidate);
	}
	
	@PutMapping("/update")
	public Result update(Candidate candidate) {
		return this.candidateService.update(candidate);
	}
}
