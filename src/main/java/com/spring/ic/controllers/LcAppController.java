package com.spring.ic.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.ic.api.UserInfoDTO;
import com.spring.ic.api.UserPlayDTO;
import com.spring.ic.services.LcServices;
import com.spring.ic.services.LcServicesImpl;


@Controller
public class LcAppController {

	@Autowired
	private LcServicesImpl lcServiceImpl;
	
	
	@ResponseBody
	@RequestMapping("/test")
	public String test() {
		return "yes, it's working";
	}
	
	@RequestMapping("/")
	public String homePage(@ModelAttribute("userPlay") UserPlayDTO userPlayDTO) {
//		UserInfoDTO userInfo = new UserInfoDTO();
//		model.addAttribute("userInfo", userInfo);
		
		return "homePage";
	}
	
	//USING @REQUESTPARAM Data Binding {PROBLEM: too lengthy parameters for input fields}
	
//	@RequestMapping("/ResultPage")
//	public String ResultPage(@RequestParam("userName") String userName1,@RequestParam("CrushName") String CrushName1)
//	or
//	@RequestMapping("/ResultPage")
//	public String ResultPage(@RequestParam String userName,@RequestParam String CrushName, Model model){
//		model.addAttribute("UserName",userName );
//		model.addAttribute("CrushName",CrushName );
//		return "ResultPage";
//	}
	
//	                                     OR 
	
	//USING POJO/DTO class Data Binding
	@RequestMapping("/ResultPage")
	public String ResultPage(@Valid @ModelAttribute("userPlay") UserPlayDTO userPlayDTO, BindingResult result){
		//"userInfoDTO.getUserName()" is to get value of userName variable 
//	System.out.println(userInfoDTO.getCrushName());
//	System.out.println(userInfoDTO.getUserName());
		
//		model.addAttribute("userInfo", userInfoDTO);
		
		if(result.hasErrors()) {
//			System.out.println("home form has errors");
//			List<ObjectError> allErrors = result.getAllErrors();
//			for (ObjectError temp : allErrors) {
//				System.out.println(temp);
//			}
		return "homePage";
		}else {
			
			int resultPercentage =  lcServiceImpl.CalculateLove(userPlayDTO.getUserName(), userPlayDTO.getCrushName());
			userPlayDTO.setResult(resultPercentage);
		return "ResultPage";
		}
		
	}
	
	@RequestMapping("/register")
	public String RegisterPage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO) {
		
//		System.out.println("inside registerPage method");
		return "RegisterPage";
	}
	
	@RequestMapping("/registerSucess")
	public String RegisterSucess(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) {
	
		if(result.hasErrors()) {
//			System.out.println("register form has errors");
//			List<ObjectError> allErrors = result.getAllErrors();
//			for (ObjectError temp : allErrors) {
//				System.out.println(temp);
//			}
		return "RegisterPage";
		}else {
			
			return "RegisterSucess";
		}
//		System.out.println("inside registerSuccess method");
		
		
	}

}
