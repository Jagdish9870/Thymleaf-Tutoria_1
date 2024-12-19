package com.jack.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jack.entity.Student;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model m) {
		m.addAttribute("today",new Date());
		
		Student st1=new Student(1,"jack","india");
		Student st2=new Student(2,"john","USA");
		m.addAttribute("student",st1);
		m.addAttribute("student2",null);
		m.addAttribute("status",true);
		m.addAttribute("msg","hii");
		return "index";
	}
	
	@GetMapping("/profile")
	public String profile(Model m) {
		Student st1=new Student(1,"jack","india");
		Student st2=new Student(2,"john","USA");
		Student st3=new Student(3,"jack","india");
		Student st4=new Student(4,"john","USA");		
		List<Student> list= new ArrayList<Student>();		
		list.add(st1);	
		list.add(st2);
		list.add(st3);
		list.add(st4);
		m.addAttribute("studentList",list);
		
		
		return "profile";
	}

	
}
