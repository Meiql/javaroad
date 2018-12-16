package javaroad.designpattern.singleton;
/**
 * 单例模式
 * @author Administrator
 *
 */
public class Singleton {
	//私有静态实例防止被引用；设置为null 延迟加载
	private static Singleton singleton = null;
	//私有构造方法，防止被实例化
	private Singleton(){
	}
	//静态工程方法，创建实例
	public static Singleton getSingleton(){
		if(singleton ==null){
			//多线程环境下，在创建时加锁
			synchronized (singleton) {
				if(singleton ==null){
					singleton = new Singleton();
				}
			}
			
		}
		return singleton;
	}
	
	//如果该对象用于实例化，可以保证对象在序列化前后保持一致
	public Object readResolve(){
		return singleton;
	}
}
