package com.liu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.liu.po.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/add1.do")
	public String add1(HttpServletRequest request){
		String userNum = request.getParameter("userNumber");
		String password = request.getParameter("password");

		System.out.println("userNumber:" + userNum + "  password:" + password);
		return "user_add1";
	}
	
	@RequestMapping(value="/add2.do")
	public String add2(String userNumber, int password){

		System.out.println("userNumber:" + userNumber + "  password:" + password);
		return "user_add2";
	}
		
	@RequestMapping(value="/add3.do")
	public String add3(@RequestParam("userNumber") String userNumber, @RequestParam("password") int password){

		System.out.println("userNumber:" + userNumber + "  password:" + password);
		return "user_add3";
	}
	
	@RequestMapping(value="/add4.do")
	public String add4(UserInfo user){

		System.out.println(user.toString());
		return "user_add4";
	}
	
	@RequestMapping(value="/add5.do")
	public String add5(Integer userId,Date userTime){

		System.out.println(userId);
		System.out.println(userTime);
		
		return "user_add5";
	}
	
	/**
	 * ʱ�����Ա༭��
	 */
	@InitBinder
	public void initBinder(ServletRequestDataBinder bin){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		CustomDateEditor cust = new CustomDateEditor(sdf, true);
		
		
		bin.registerCustomEditor(Date.class,cust);
	}
}
