package com.spring.ic.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import org.springframework.stereotype.Service;

@Service
public class LcServicesImpl implements LcServices {


	@Override
	public int CalculateLove(String userName, String crushName) {
	
		//to trim spaces and to lowercase letters in names
        userName = userName.toLowerCase().trim();
        crushName = crushName.toLowerCase().trim();
        //to seggregate first name from names
        String uFirstName = userName.split(" ")[0];
        String cFirstName = crushName.split(" ")[0];

        // adding LOVES into statement
        String finalStmt = uFirstName + "loves" + cFirstName;
//        System.out.println(finalStmt);

        // count the occurence of each letter in statement 
        LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();

        for (char ch : finalStmt.toCharArray()) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, (charCountMap.get(ch) + 1));
            } else {
                charCountMap.put(ch, 1);
            }
        }
       
        // LOVE CALCULATOR ALGORITHM
        ArrayList<Integer> newString = new ArrayList<Integer>();
        ArrayList<Integer> tempString = new ArrayList<Integer>();

        // adding numbers to newString
        for (Character key : charCountMap.keySet()) {
            newString.add(charCountMap.get(key));
        }
        
        while (newString.size() > 2) {

            while (newString.size() != 0) {
                if (newString.size() == 1) {
                    tempString.add(newString.get(0));
                    newString.remove(0);
                } else {
                    int temp = newString.get(0) + newString.get(newString.size() - 1);

                    if (temp > 9) {
                        int tempFirst = temp / 10;
                        int tempSec = temp % 10;
                        tempString.add(tempFirst);
                        tempString.add(tempSec);
                    } else {
                        tempString.add(temp);
                    }

                    newString.remove(0);
                    newString.remove(newString.size() - 1);
                }
            }

           
            newString.addAll(tempString);
            tempString.clear();
//            System.out.println(newString);

        }

        String result = "" + newString.get(0) + newString.get(1);
        int lovePercentage = Integer.parseInt(result);
//        System.out.println(lovePercentage);
        
		return lovePercentage;
	}

}
