package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.PositionService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/positions")
public class PositionController {

	private PositionService positionService;
	 
	@Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.positionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition) {
		return this.positionService.add(jobPosition);
	}
	
}
