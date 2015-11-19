package com.parkgaram.dp.visitor.concrete;

import com.parkgaram.dp.visitor.contract.Visitable;
import com.parkgaram.dp.visitor.contract.Visitor;

public class VisitableA implements Visitable {

	int numberOfMember;

	public VisitableA(int numberOfMember) {
		this.numberOfMember = numberOfMember;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
