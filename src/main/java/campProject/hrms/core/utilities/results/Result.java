package campProject.hrms.core.utilities.results;

import lombok.Data;

@Data
public class Result {

	private boolean success;
	private String message;
	
	public Result(boolean success,String message) {
		this.message = message;
		this.success = success;
	}
	
	public Result(boolean success) {
		this.success = success;
	}

	
	
	
}
