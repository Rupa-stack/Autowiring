package com.spring.app;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.spring.app")
public class Driver {
	public static void main(String[] args) {
	AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	//context.refresh();
	Employee emp= (Employee) context.getBean("employee");	
	System.out.println(emp.getEmpId()+":"+emp.getEmpName()+":"+emp.getPassObj().getPassNum()+":"+emp.getPassObj().getDateOfExpiry()+":"+emp.getPassObj().getDateOfIssue());
	
    context.close();
	

}

	
}
