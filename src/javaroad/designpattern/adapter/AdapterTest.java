package javaroad.designpattern.adapter;
/**
 * 绫荤殑閫傞厤鍣ㄦā寮�
 * 瀵硅薄閫傞厤鍣ㄦā寮�
 * 
 * @author Administrator
 *
 */
public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//类适配
		System.out.println("-------------类适配-----------");
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		//对象适配
		System.out.println("-------------对象适配�-----------");
		Source source = new Source();
		Targetable target1 = new Wrapper(source);
		target1.method1();
		target1.method2();
		
		//接口适配：定义中间抽象方法，实现接口并被类继承
		Targetable target2 = new Source1();
		target2.method1();
		target2.method2();
		Targetable target3 = new Source2();
		target3.method1();
		target3.method2();
	}

}
