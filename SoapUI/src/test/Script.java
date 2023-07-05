package test;

import org.oorsprong.websamples.CountryInfoService;
import org.oorsprong.websamples.CountryInfoServiceSoapType;

public class Script 
{
	public static void main(String[] args) 
	{
		CountryInfoService c=new CountryInfoService();
		CountryInfoServiceSoapType req=c.getCountryInfoServiceSoap();
		String res = req.capitalCity("USA");
		System.out.println(res);
	}
}
