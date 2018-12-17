package javaroad.designpattern.strategy;
/**
 * 策略模式
 * 1一个接口中的方法，被不同实现类重写；外加一个辅助的抽象类提供辅助方法
 * 系统提供不同的算法；而用户去确定使用哪一种
 * @author Administrator
 *
 */
public class StrategyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StrategyAble strategyAble = new Cla2();
		int result = strategyAble.cla("5-2");
		System.out.println(result);
		
		
		StrategyAble strategyAble2 = new Cla1();
		int result2 = strategyAble2.cla("5*2");
		System.out.println(result2);
	}

}
