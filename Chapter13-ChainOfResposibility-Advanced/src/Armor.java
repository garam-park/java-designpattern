
public abstract class Armor implements Defense {

	private Defense nextDefense;
	
	public void setNextArmor(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
	
	@Override
	public void depense(Attack attack) {
		
		proccess(attack);
		if(nextDefense!=null)
			nextDefense.depense(attack);
	}

	abstract protected void proccess(Attack attack);

}
