package anand.learn.bean_definition_inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anand.learn.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext factory=new ClassPathXmlApplicationContext("beanDefinitionInheritance-spring.xml");
		Triangle triangle=(Triangle)factory.getBean("triangle1");
		triangle.draw();
		System.out.println("-----------------------------------");
		Triangle triangle1=(Triangle)factory.getBean("triangle2");
		triangle1.draw();
		
	}

}
