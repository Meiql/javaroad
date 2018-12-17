package javaroad.designpattern.template;

public abstract class AbstracCla {
	//定义抽象类中的主方法用来调用其他方法
	public final void cal(){
		split1();
		cals();
		split2();
		
	}
	//定义抽象方法，用来被实现
	public abstract void cals();
	//其他方法 n个 被主方法调用
	public void split1(){
		System.out.println("这是抽象类里的方法1");
	}
	public void split2(){
		System.out.println("这是抽象类里的方法2");
	}
}
