package campProject.hrms.core.adapters;

import org.springframework.stereotype.Service;

import campProject.hrms.core.utilities.results.Result;
import campProject.hrms.core.utilities.results.SuccessResult;

@Service
public class MernisVertification implements PersonAdapter {

	@Override
	public Result checkIfRealPerson(String firstName, String lastName, String birthYear, String identificationNumber) {
		/*
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = client.TCKimlikNoDogrula(TcKimlikNo, ad.toUpperCase(new Locale("tr")),
					soyad.toUpperCase(new Locale("tr")), dogumYili);
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		return result ? new SuccessResult() : new ErrorResult("Not a valid person!");
		*/
		return new SuccessResult();
	}

}
