package anand.learn.bean_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anand.learn.beans.Point;
import anand.learn.beans.Triangle;

public class DrawingApp {

	public static void main(String[] args) {
		System.out.println("on ApplicationContext creation beans initialization");
		ApplicationContext factory=new ClassPathXmlApplicationContext("beanScope-spring.xml");
		System.out.println("parent bean scope prototype and child bean scope singleton");
		Triangle triangle1=(Triangle)factory.getBean("triangle1");
		triangle1.draw();
		Triangle triangle_alias1=(Triangle)factory.getBean("triangle_alias1");
		triangle_alias1.draw();
		
		System.out.println("parent bean scope singleton and child bean scope prototype");
		Triangle triangle2=(Triangle)factory.getBean("triangle2");
		triangle2.draw();
		Triangle triangle_alias2=(Triangle)factory.getBean("triangle_alias2");
		triangle_alias2.draw();
		
	}

}
