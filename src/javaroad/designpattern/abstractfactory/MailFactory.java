package javaroad.designpattern.abstractfactory;

public class MailFactory implements Provid {

	@Override
	public Sender produce() {
		return new MailSend();
		// TODO Auto-generated method stub

	}

}
