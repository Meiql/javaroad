package javaroad.designpattern.singleton;
/**
 * 多线程环境下 实例的创建和调用分开
 * @author Administrator
 *
 */
public class Singleton2 {
	//私有静态实例防止被引用 null 延迟加载
	private static  Singleton2 singleton2 = null;
	//私有构造方法防止被实例化
	private  Singleton2(){
	}
	// 私有静态实例化加锁
	private static synchronized void intSingleton2(){
		singleton2 = new Singleton2();
	}
	public static Singleton2 getSingleton2(){
		if(singleton2 ==null){
			intSingleton2();
		}
		return singleton2;
		
	}
	
	
}
