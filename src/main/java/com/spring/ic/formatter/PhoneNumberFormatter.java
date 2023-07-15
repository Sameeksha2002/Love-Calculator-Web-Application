package com.spring.ic.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.spring.ic.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {
		
//		System.out.println("parsing data");
		//split the number coming from the user
		String[] PhoneNumber = completePhoneNumber.split("-");
		// extract the data(countrycode,number) and set it to the phone class 
				Phone phone = new Phone();
				
		int index = completePhoneNumber.indexOf('-');
		if(index == -1 ) {
			phone.setCountryCode("91");
			phone.setUserNumber(PhoneNumber[0]);
		}else if (index == 0) {
			phone.setCountryCode("91");
			phone.setUserNumber(PhoneNumber[1]);
//			System.out.println("number is " +PhoneNumber[1]);
			
		} else{	
		
		phone.setCountryCode(PhoneNumber[0]);
		phone.setUserNumber(PhoneNumber[1]);
		}
		return phone;
	}

	
}
