package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.imp.LoginServiceImp;
import vo.User;

public class TestD {
	public static void main(String[] args) {
		ApplicationContext aContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		LoginServiceImp lServiceImp=(LoginServiceImp) aContext.getBean("loginService");
		User user=lServiceImp.getName("admin");
		System.out.println(user);
	}
}
