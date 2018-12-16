package javaroad.designpattern.simplefactory;
/**
 * 多个工厂方法模式
 * @author Administrator
 *
 */
public class SendFactory2 {
	public Sender mailProduce(){
		return new MailSend();
	}
	public Sender cmsProduce(){
		return new CMSSend();
	}
}
