package javaroad.designpattern.strategy;
/**
 * 策略模式 实现类2  实现接口，集成抽象类
 * @author Administrator
 *
 */
public class Cla2 extends AbstractHelp implements StrategyAble {

	@Override
	public int cla(String A) {
		// TODO Auto-generated method stub
		int arrayInt[] = split(A, "-");
		
		return arrayInt[0]-arrayInt[1];
	}

}
