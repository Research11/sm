package com.pb.helloword;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pb.domain.Student;

@Controller
public class springmvctest3 {

	private static final String SUCCESS="success";
//模拟类似于struts2的拦截器
//@ModelAttribute 标记的方法，会在每个目标方法执行之前被springmvc调用
	 
	@ModelAttribute
	public void getStudent(@RequestParam(value="id",required=false)Integer id,
			Map<String,Object>map){
		if(id!=null){
			Student stu=new Student();
			stu.setId(1);
			stu.setName("zhangsan");
			stu.setEamil("as@126.com");
			stu.setPassword("123456");
			//键必须是类名小写  解决
			//map.put("abc", stu);
			map.put("student", stu);
			System.out.println("从数据库中获取对象");
		}
	}
@RequestMapping("/testModelAttribute")
											//上面的解决如下		
	//public String testModelAttribute(@ModelAttribute("abc")Student student)
	public String testModelAttribute(Student student)
{		
		System.out.println("testModelAttribute");
		
		return SUCCESS;
	}
}
