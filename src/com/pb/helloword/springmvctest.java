package com.pb.helloword;

import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping既可以修饰方法也可以修饰类

@RequestMapping("/springmvc")
@Controller
public class springmvctest {
	private static final String SUCCESS="success";
	//@RequestMapping既可以修饰方法也可以修饰类
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping(){
		
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
	//@RequestMapping的method属性
	@RequestMapping(value="/testmethod",method=RequestMethod.POST)
	public String testmethod(){		
		System.out.println("testmethod");
		return SUCCESS;
	}
	//@RequestMapping的params  and headers属性
	@RequestMapping(value="/testparamsandheaders",
					params={"username","age!=10"},
					headers={"Accept-Language=zh-CN,zh;q=0.8"})
	public String testparamsandheaders(){		
		System.out.println("testparamsandheaders");
		return SUCCESS;
	} 
	//
	@RequestMapping("/testAntpath/*/abc")
	public String testAntpath(){		
		System.out.println("testAntpath");
		return SUCCESS;
	}
	
	@RequestMapping("/testtpathvariable/{id}")//占位符的方式进行参数传递
	public String testtpathvariable(@PathVariable(value="id") Integer id){		
		System.out.println("testtpathvariable"+id);
		return SUCCESS;
	}
	
	
}
