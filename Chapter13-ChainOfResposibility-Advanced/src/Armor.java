
public abstract class Armor implements Defense {

	private Defense nextArmor;
	
	public void setNextArmor(Defense nextArmor) {
		this.nextArmor = nextArmor;
	}
	
	@Override
	public void depense(Attack attack) {
		
		proccess(attack);
		if(nextArmor!=null)
		nextArmor.depense(attack);
	}

	abstract protected void proccess(Attack attack);

}
