package javaroad.designpattern.strategy;
/**
 * 策略模式 实现类1 
 * @author Administrator
 *
 */
public class Cla1 extends AbstractHelp implements StrategyAble {

	@Override
	public int cla(String A) {
		// TODO Auto-generated method stub
		int arrayInt[] = split(A, "\\*");
		
		return arrayInt[0] * arrayInt[1];
	}

}
