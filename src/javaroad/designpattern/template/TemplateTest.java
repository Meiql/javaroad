package javaroad.designpattern.template;
/**
 * 通过调用抽象类里的主方法来调用子类重写的方法
 *1.子类继承抽象父类，并重写父类中的抽象方法
 *2.抽象类，包含一个主方法，n个其他方法；主方法调用其他方法
 * @author Administrator
 *
 */
public class TemplateTest {
	
	public static void main(String[] args) {
		AbstracCla abstracCla = new Cals();
		abstracCla.cal();
	}
}
