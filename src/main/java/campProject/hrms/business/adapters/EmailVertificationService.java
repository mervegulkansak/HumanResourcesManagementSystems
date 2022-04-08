package campProject.hrms.business.adapters;

import campProject.hrms.core.utilities.results.Result;

public interface EmailVertificationService {

	Result verify(String email);
}
