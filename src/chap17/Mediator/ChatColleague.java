package chap17.Mediator;

import chap17.Mediator.contract.Colleague;

public class ChatColleague extends Colleague {

	@Override
	public void handle(String data) {
		System.out.println(this + " - " + data);
	}

}
