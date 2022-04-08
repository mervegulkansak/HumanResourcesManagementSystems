package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateLanguageService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateLanguage;

@RestController
@RequestMapping("/candidateLanguages")
public class CandidateLanguageController {

	private CandidateLanguageService candidateLanguageService;

	public CandidateLanguageController(CandidateLanguageService candidateLanguageService) {
		super();
		this.candidateLanguageService = candidateLanguageService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateLanguage>> getAll(){
		return this.candidateLanguageService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(CandidateLanguage candidateLanguage) {
		return this.candidateLanguageService.add(candidateLanguage);
	}
	
	@DeleteMapping("/delete")
	public Result delete(CandidateLanguage candidateLanguage) {
		return this.delete(candidateLanguage);
	}
	
	@PutMapping("/update")
	public Result update(CandidateLanguage candidateLanguage) {
		return this.update(candidateLanguage);
	}
}
