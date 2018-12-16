package javaroad.designpattern.adapter;
//对象适配： 一个对象满足另外一个接口的对象时   只需改接口的实现类持有原来对象的实例即可
public class Wrapper implements Targetable {
	private Source source;
	public Wrapper(Source source){
		super();
		this.source = source;
	}
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		source.method1();
	}

	@Override
	public void method2() {
		System.out.println("这是目标接口里实现类方法");

	}

}
