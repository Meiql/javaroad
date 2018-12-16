package javaroad.designpattern.adapter;
/**
 * 类的适配器模式
 * 对象适配器模式
 * 
 * @author Administrator
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//类适配器  通过适配器类 将某个类中的待适配方法扩展到目标接口  这样目标接口就实现了待适配类的功能
		System.out.println("-------------这是一个类适配器测试-----------");
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		//对象适配器  通过目标对象接口的实现类持有原对象实例
		System.out.println("-------------这是一个对象适配器测试-----------");
		Source source = new Source();
		Targetable target1 = new Wrapper(source);
		target1.method1();
		target1.method2();
	}

}
