package campProject.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import campProject.hrms.business.abstracts.JobAdvertisementService;
import campProject.hrms.core.utilities.results.DataResult;
import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/jobAdvertisements")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdvertisementService;

	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){
		return this.jobAdvertisementService.getAll();
	}
	
	@GetMapping("/getByDate")
	public DataResult<List<JobAdvertisement>> getByDate(){
		return this.jobAdvertisementService.getByDate();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);
	}
	
	
}
