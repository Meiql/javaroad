package javaroad.designpattern.prototype;
/**
 * 原型模式 ：将一个对象作为原型，对其进行复制克隆产生一个新对象 
 * 实现Cloneable接口，重写clone方法
 * @author Administrator
 *浅复制：基本类型重新创建，引用类型依旧指向原来的对象所指向的
 *深复制：彻底复制全部重新创建（需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象）
 */
public class Prototype implements Cloneable {
	public Object clone() throws CloneNotSupportedException{
		Prototype proto = (Prototype) super.clone();
		return proto;
		}
}
