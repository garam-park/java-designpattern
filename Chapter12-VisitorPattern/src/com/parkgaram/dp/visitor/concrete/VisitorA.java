package com.parkgaram.dp.visitor.concrete;

import com.parkgaram.dp.visitor.contract.Visitable;
import com.parkgaram.dp.visitor.contract.Visitor;

public class VisitorA implements Visitor {

	private int number;
	
	
	
	public VisitorA() {
		this.number = 0;
	}
	
	@Override
	public void visit(Visitable visitable) {
		if(visitable instanceof VisitableA){
			number+=((VisitableA) visitable).numberOfMember;
		}else {
			//...
		}
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
}
