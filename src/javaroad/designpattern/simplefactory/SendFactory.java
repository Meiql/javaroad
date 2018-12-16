package javaroad.designpattern.simplefactory;
/**
 * 普通工厂模式
 * @author Administrator
 *
 */
public class SendFactory {
	public Sender produce(String type ){
		if("1".equals(type)){
			return new MailSend();
		}else if ("2".equals(type)){
			return new CMSSend();
		}else{
		return null;
		}
		
	}
}
