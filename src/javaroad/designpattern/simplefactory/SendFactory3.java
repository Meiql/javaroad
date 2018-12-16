package javaroad.designpattern.simplefactory;
/**
 * 静态工厂方法模式
 * @author Administrator
 *
 */
public  class SendFactory3 {
	public static Sender mailProduce(){
		return new MailSend();
	}
	public static Sender cmsSend(){
		return new CMSSend();
	}
}
