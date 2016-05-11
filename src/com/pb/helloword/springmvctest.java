package com.pb.helloword;

import java.io.InputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@RequestMapping�ȿ������η���Ҳ����������

@RequestMapping("/springmvc")
@Controller
public class springmvctest {
	private static final String SUCCESS="success";
	//@RequestMapping�ȿ������η���Ҳ����������
	@RequestMapping("/testRequestMapping")
	public String testRequestMapping(){
		
		System.out.println("testRequestMapping");
		return SUCCESS;
	}
	//@RequestMapping��method����
	@RequestMapping(value="/testmethod",method=RequestMethod.POST)
	public String testmethod(){		
		System.out.println("testmethod");
		return SUCCESS;
	}
	//@RequestMapping��params  and headers����
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
	
	@RequestMapping("/testtpathvariable/{id}")//ռλ���ķ�ʽ���в�������
	public String testtpathvariable(@PathVariable(value="id") Integer id){		
		System.out.println("testtpathvariable"+id);
		return SUCCESS;
	}
	
	
}
