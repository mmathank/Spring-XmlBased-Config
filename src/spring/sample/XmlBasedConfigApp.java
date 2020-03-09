package spring.sample;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedConfigApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Cricket cricket = context.getBean("cricket", Cricket.class);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Information About Cricket: " + cricket.provideInfo());
		System.out.println("FirstAid in Cricket: " + cricket.getFirstAidInfo());
		System.out.println("Cricket Team Name: " + cricket.getTeamName());
		System.out.println("------------------------------------------------------------------------------");
		
		BasketBall basketBall = context.getBean("basketball", BasketBall.class);
		System.out.println("Information About BasketBall: " + basketBall.provideInfo());
		System.out.println("FirstAid in BasketBall: " + basketBall.getFirstAidInfo());
		System.out.println("Basket Ball Team Name: " + basketBall.getTeamName());
		System.out.println("------------------------------------------------------------------------------");
		
		// bean's scope
		Cricket sigletonCricket1 = context.getBean("cricket", Cricket.class);
		Cricket sigletonCricket2 = context.getBean("cricket", Cricket.class);
		boolean flag = sigletonCricket1 == sigletonCricket2;
		System.out.println("Only One Object per container in Singleton Scope: " + flag);
		System.out.println("------------------------------------------------------------------------------");
		
		BasketBall prototypeBasketBall1 = context.getBean("basketball", BasketBall.class);
		BasketBall prototypeBasketBall2 = context.getBean("basketball", BasketBall.class);
		boolean flag2 = prototypeBasketBall1 == prototypeBasketBall2;
		System.out.println("New Object created for each request: " + flag2);
		
		context.close();
	}

}
