package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateCoverLetterService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateCoverLetter;

@RestController
@RequestMapping("/candidateCoverLetter")
public class CandidateCoverLetterController {

	private CandidateCoverLetterService candidateCoverLetterService;

	@Autowired
	public CandidateCoverLetterController(CandidateCoverLetterService candidateCoverLetterService) {
		super();
		this.candidateCoverLetterService = candidateCoverLetterService;
	}
	
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateCoverLetter>> getAll(){
		return this.candidateCoverLetterService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(CandidateCoverLetter candidateCoverLetter) {
		return this.candidateCoverLetterService.add(candidateCoverLetter);
	}
	@DeleteMapping("/delete")
	public Result delete(CandidateCoverLetter candidateCoverLetter) {
		return this.delete(candidateCoverLetter);
	}
	
	@PutMapping("/update")
	public Result update(CandidateCoverLetter candidateCoverLetter) {
		return this.update(candidateCoverLetter);
	}
}
