package anand.learn.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import anand.learn.beans.Circle;
import anand.learn.beans.Employee;
import anand.learn.beans.Line;
import anand.learn.beans.Triangle;


public class DrawingApp {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("autowire-spring.xml");
		
		System.out.println("------------no autowire--------------");
		Line line = (Line)factory.getBean("line");
		line.draw();
		
		System.out.println("------------byName autowire--------------");
		Triangle triangle=(Triangle)factory.getBean("triangle");
		triangle.draw();
		
		System.out.println("------------byType autowire--------------");
		Circle circle = (Circle)factory.getBean("circle");
		circle.draw();
		
		System.out.println("------------Constructor autowire--------------");
		Employee employee = (Employee)factory.getBean("employee");
		System.out.println("Hello .."+employee.getFullName()+" your department is "+employee.getDepartment().getName());
		
		
	}

}
