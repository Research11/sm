package com.pb.helloword;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//��web.xml�ļ�������HiddenHttpMethodFilter�ſ���ʹ��delete,put����
//���õ�jquery
@Controller
public class springmvctest1 {

	private static final String SUCCESS="success";
//��ѯ	
@RequestMapping(value="/testget/{id}",method=RequestMethod.GET)
	public String testget(@PathVariable Integer id){		
		System.out.println("testget"+id);
		return SUCCESS;
	}

//���
@RequestMapping(value="/testpost",method=RequestMethod.POST)
public String testpost(){
	
	System.out.println("testpost");
	return SUCCESS;
}

//ɾ��
@RequestMapping(value="/testdelete/{id}" ,method=RequestMethod.DELETE)
public String testdelete(@PathVariable Integer id){	
	System.out.println("testdelete");
	return SUCCESS;
}

//�޸�
@RequestMapping(value="/testput/{id}",method=RequestMethod.PUT)
public String testput(@PathVariable Integer id){
	
	System.out.println("testput");
	return SUCCESS;
}

}
