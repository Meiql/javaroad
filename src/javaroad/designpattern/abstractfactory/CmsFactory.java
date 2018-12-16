package javaroad.designpattern.abstractfactory;

public class CmsFactory implements Provid {

	@Override
	public Sender produce() {
		return new CmsSend();
		
		// TODO Auto-generated method stub
		
	}

}
