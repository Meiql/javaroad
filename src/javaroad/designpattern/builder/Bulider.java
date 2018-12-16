package javaroad.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Bulider {
	private List<Sender> list = new ArrayList<Sender>();
	public void produceMailSender (int count){
		for(int i=0;i<count;i++){
			list.add(new MailSend());
		}
		for(Sender s:list){
			s.Send();
		}
	}
	public void produceCmsSend(int count){
		for (int i = 0; i < count; i++) {
			list.add(new CmsSend());
		}
		for(Sender s:list){
			s.Send();
		}
	}
}
