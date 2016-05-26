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
//ģ��������struts2��������
//@ModelAttribute ��ǵķ���������ÿ��Ŀ�귽��ִ��֮ǰ��springmvc����
	 
	@ModelAttribute
	public void getStudent(@RequestParam(value="id",required=false)Integer id,
			Map<String,Object>map){
		if(id!=null){
			Student stu=new Student();
			stu.setId(1);
			stu.setName("zhangsan");
			stu.setEamil("as@126.com");
			stu.setPassword("123456");
			//������������Сд  ���
			//map.put("abc", stu);
			map.put("student", stu);
			System.out.println("�����ݿ��л�ȡ����");
		}
	}
@RequestMapping("/testModelAttribute")
											//����Ľ������		
	//public String testModelAttribute(@ModelAttribute("abc")Student student)
	public String testModelAttribute(Student student)
{		
		System.out.println("testModelAttribute");
		
		return SUCCESS;
	}
}
