package campProject.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {

	public SuccessDataResult(T data, boolean success, String message) {
		super(data, true, message);
		// TODO Auto-generated constructor stub
	}

	public SuccessDataResult(T data) {
		super(data,true);
	}
	
	public SuccessDataResult(String message) {
		super(null, true, message);
	}
	public SuccessDataResult() {
		super(null, true);
	}
	

}
