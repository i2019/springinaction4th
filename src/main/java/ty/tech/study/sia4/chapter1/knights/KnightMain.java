package ty.tech.study.sia4.chapter1.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {

	  public static void main(String[] args) throws Exception {
		  
		/*测试xml配置方式*/
		/*
		Spring通过应用上下文（Application Context）装载bean的定义并把它 们组装起来。
		Spring应用上下文全权负责对象的创建和组装。
		Spring 自带了多种应用上下文的实现，它们之间主要的区别仅仅在于如何加 载配置。  
		*/
		//knight.xml
		//minstrel.xml
	    ClassPathXmlApplicationContext context = 
	        new ClassPathXmlApplicationContext(
	            "classpath:config/spring/chapter1/minstrel.xml");
	    Knight knight = context.getBean(Knight.class);
	    knight.embarkOnQuest();
	    context.close();
	  }
}
