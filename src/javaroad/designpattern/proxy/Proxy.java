package javaroad.designpattern.proxy;
/**
 * 代理模式
 * 用代理类中方法去替换原方法的作用；并在原方法功能上扩展
 * 实现原方法的接口
 * 1.定义原对象2.代理类构造方法构造原对象3.重写接口中的方法；4方法中扩展功能，调用原对象的方法
 * @author Administrator
 *
 */
public class Proxy implements SourceAble {
	
	private Source source;
	public Proxy(Source source) {
		super();
		this.source = new Source();
	}
	@Override
	public void method() {
		// TODO Auto-generated method stub
		before();
		source.method();
		after();
	}
	
	private void before() {
		System.out.println("代理类之前");
	}
	private void after() {
		System.out.println("代理类之后");
	}
}
