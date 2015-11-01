
public class FlashMCF implements MorseCodeFunction{

	@Override
	public void dot() {
		System.out.print(" 번쩍 ");
	}

	@Override
	public void dash() {
		System.out.print(" 반짝 ");
	}

	@Override
	public void space() {
		System.out.print(" - ");
	}

}
