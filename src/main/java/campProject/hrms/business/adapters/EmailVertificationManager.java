package campProject.hrms.business.adapters;

import org.springframework.stereotype.Service;

import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessResult;

@Service
public class EmailVertificationManager implements EmailVertificationService {

	@Override
	public Result verify(String email) {
		
		return new SuccessResult();
	}

	
}
