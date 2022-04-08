package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.CandidateSkillsService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.CandidateSkills;

@RestController
@RequestMapping("/api/candidateSkills")
public class CandidateSkillsController {

	private CandidateSkillsService candidateSkillsService;

	public CandidateSkillsController(CandidateSkillsService candidateSkillsService) {
		super();
		this.candidateSkillsService = candidateSkillsService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<CandidateSkills>> getAll(){
		return this.candidateSkillsService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(CandidateSkills candidateSkills) {
		return this.candidateSkillsService.add(candidateSkills);
	}
	
	@DeleteMapping("/delete")
	public Result delete(CandidateSkills candidateSkills) {
		return this.candidateSkillsService.delete(candidateSkills);
	}
	
	@PutMapping("/update")
	public Result update(CandidateSkills candidateSkills) {
		return this.candidateSkillsService.update(candidateSkills);
	}
}
