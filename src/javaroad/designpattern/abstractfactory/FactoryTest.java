package javaroad.designpattern.abstractfactory;
/**
 * 抽象工厂类；如果新增方法；只需一个实现Sender接口的实现类；一个实现provid的工厂方法
 * @author Administrator
 *
 */
public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Provid provid1 = new MailFactory();
		Sender sender1 = provid1.produce();
		sender1.send();
		
		Provid provid2 = new CmsFactory();
		Sender sender2 = provid2.produce();
		sender2.send();
		
	}

}
