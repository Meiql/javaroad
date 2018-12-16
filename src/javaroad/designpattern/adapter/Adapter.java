package javaroad.designpattern.adapter;
//类适配器 通过适配器类 将某个类中的待适配方法扩展到目标接口  这样目标接口就实现了待适配类的功能
public class Adapter extends Source implements Targetable {

	
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("这是目标接口里的方法");
	}

}
