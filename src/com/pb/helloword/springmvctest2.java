package com.pb.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pb.domain.Student;

@Controller
public class springmvctest2 {

	private static final String SUCCESS="success";
//@RequestParam���������
//RequestParam���������ᱨ��   �����required=false �ò������Ǳ���
//int age��Ϊ���Ǳ����Ҳ�ᱨ��   �����defaultValue="0"�� Integer age
@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam(value="username",required=false) String um,@RequestParam(value="age" ,defaultValue="0")Integer age ,Model model){		
		System.out.println("testRequestParam");
		model.addAttribute("username", um);
		return SUCCESS;
	}

@RequestMapping("/testpojo")
//֧��servletԭ��api Reader Writer InputStream OutputStream  ��....

//public String testpojo(String name,String email,Model model)
//public String testpojo(Student student,HttpServletRequest request)
//public String testpojo(Student student,HttpSession Session)
//public String testpojo(Student student,Map<String,Object> map)
public String testpojo(Student student,Model model)
{		
	System.out.println("testpojo");
	model.addAttribute("student", student);
	return SUCCESS;
}

}
