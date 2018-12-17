package javaroad.designpattern.strategy;
/**
 *抽象辅助类
 * @author Administrator
 *
 */
public abstract class AbstractHelp {
	public int[] split(String A, String B) {
		String array[] = A.split(B);
		int arrayint[] = new int[2];
		arrayint[0] = Integer.parseInt(array[0]);
		arrayint[1] = Integer.parseInt(array[1]);
		return arrayint;
		
	}
}
