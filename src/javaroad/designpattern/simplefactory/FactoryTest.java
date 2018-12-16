package javaroad.designpattern.simplefactory;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//简单工厂模式
		SendFactory sendFactory = new SendFactory();
		Sender sender = sendFactory.produce("1");
		sender.send();
		
		//多个工厂方法模式
				SendFactory2 factory= new SendFactory2();
				Sender sender1 = factory.mailProduce();
				Sender sender2= factory.cmsProduce();
				sender1.send();
				sender2.send();
				
		//静态工厂方法模式 ；工厂方法 static 使用不需要创建
				Sender sender3 = SendFactory3.cmsSend();
				Sender sender4 = SendFactory3.mailProduce();
				sender4.send();
				sender3.send();
		
		
	}

}
