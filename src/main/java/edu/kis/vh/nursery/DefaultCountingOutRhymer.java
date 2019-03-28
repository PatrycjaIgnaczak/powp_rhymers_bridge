package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;

public class DefaultCountingOutRhymer{

	private Stackable stack;


	public void countIn(int in) {
		stack.countIn(in);
	}

	public boolean callCheck() {
		return stack.callCheck();
	}

	public boolean isFull() {
		return stack.isFull();
	}

	public int peekaboo() {
		return stack.peekaboo();
	}

	public int countOut() {
		return stack.countOut();
	}

	public DefaultCountingOutRhymer() {
		super();
		this.stack = new IntLinkedList();
	}

	public DefaultCountingOutRhymer(IntLinkedList intLinkedList) {
		super();
		this.stack = intLinkedList;
	}

}
