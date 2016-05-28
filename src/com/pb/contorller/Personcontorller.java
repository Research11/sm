package com.pb.contorller;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.pb.domain.Person;

@SessionAttributes(value={"person"},types={String.class})
@Controller
public class Personcontorller {
	
	@ModelAttribute
	public void getperson(Map<String,Object>map){
		Person person=new Person();
		
		person.setId(1);
		person.setName("lisi");
		person.setAge(22);
		person.setEmail("lisi");
		person.setBithday(new Date());
		
		map.put("person", person);
		
	}

	@RequestMapping(value="/login")
	public String save(@ModelAttribute("person1")Person person,Map<String,Object>map,HttpSession session){
		
		//session.setAttribute("person", person);
		//map.put("person", person);
		
		return "display";
	}
}
