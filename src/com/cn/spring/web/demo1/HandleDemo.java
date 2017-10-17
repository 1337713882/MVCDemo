package com.cn.spring.web.demo1;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cn.spring.web.entity.Students;

@Controller
public class HandleDemo {
	
	@ModelAttribute
	public void getUser(@RequestParam(value="stuId",required=false) Integer id,
			Map<String , Object> obj){
		
	
		if(id !=null){
			Students s = new Students(1, "张三", "a123","13388@qq.com");
			System.out.println("数据库数据"+s);
			obj.put("abc", s);
		}
	}
	
	
	/**
	 * 
	     @ModelAttribute obj.put("students", s);
	     的students 必须和参数的名一致
	
	 * @param students
	 * @return
	 */
	
	@RequestMapping("/date")
	public String dateDeno(@ModelAttribute("abc") Students students){
		System.out.println(students+"data测试数据");
		return "redirect:/index.jsp";
	}
	
	/**
	 * @RequestMapping("/date")
		public String dateDeno(Students students){
			System.out.println(students+"data测试数据");
			return "redirect:/index.jsp";
		}
	 * @param map
	 * @return
	 */
	
	@RequestMapping("/map")
	public String mapDemo(Map<String,Object> map){
		map.put("names", Arrays.asList("Tom","Jack","roos"));
		return "redirect:/index.jsp";
	}
	
	@RequestMapping("/modelandview")
	public ModelAndView Modelandview(){
		String viewName = "redirect:/index.jsp";
		ModelAndView model = new ModelAndView(viewName);
		model.addObject("time", new Date());
		System.out.println(new Date());
		return model;
	}
	
	@RequestMapping("/baidu")
	public void show(HttpServletRequest request,
			HttpServletResponse response,Writer out) throws IOException{
		System.out.println(request+"----"+response);
		out.write("mvc");
	}
}
