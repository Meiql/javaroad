package javaroad.designpattern.proxy;
/**
 * 代理模式
 * @author Administrator
 *
 */
public class ProxyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source source = new Source();
		SourceAble sourceAble = new Proxy(source);
		sourceAble.method();
	}

}
