package campProject.hrms.core.adapters;

import campProject.hrms.core.utilities.results.Result;

public interface PersonAdapter {
	Result checkIfRealPerson(String firstName, String lastName, String birthYear, String identificationNumber);
}
