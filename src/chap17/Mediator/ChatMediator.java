package chap17.Mediator;

import chap17.Mediator.contract.Mediator;

public class ChatMediator extends Mediator {

	@Override
	public void mediate(String data) {
		colleagues.forEach(value->value.handle(data));
	}

}
