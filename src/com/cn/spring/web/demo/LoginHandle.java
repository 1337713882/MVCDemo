package com.cn.spring.web.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.spring.web.entity.Pserson;
import com.cn.spring.web.entity.User;

@Controller
public class LoginHandle {
	@RequestMapping("/demoPojo")
	public String demoPojo(Pserson p){
		System.out.println(p.toString());
		return "redirect:/index.jsp";
	}
	@RequestMapping("/loginHandle")
	public String loginHandle(@RequestParam(required=false,defaultValue="admin")String userName,@RequestParam(required=false,defaultValue="a123")String userPwd){
		System.out.println("redirect:/index.jsp"+userName+"--"+userPwd);
		return "redirect:/LoadAll";
	}
	
	@RequestMapping("/LoadAll")
	public String LoadAllHandle(HttpSession session){
		System.out.println("LoadAll");
		List<User> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			User u = new User();
			u.setUserId(i);
			u.setUserName("ÕÅÈý"+i);
			u.setUserPwd("a"+(123+i));
			list.add(u);
		}
		
		session.setAttribute("list", list);
		return "redirect:/index.jsp";
	}
}


