package concrete;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class FactoryInstance {

	public static GuiFac getGuiFac() {

		switch (1) {
		case 0:
			return new MacGutFac();
		case 1:
			return new LinuxGuiFac();
		case 2:
			return new WinGutFac();
		}
		return null;
	}

	private static int getOsCode() {
		if (System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		}
		return 1;
	}

}

class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("리눅스 버튼 ");
	}

}

class LinuxGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		//
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		// TODO Auto-generated method stub
		return new LinuxTextArea();
	}

}

class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "리눅스 텍스트에어리어";
	}

}

class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("맥 버튼 ");
	}

}

class MacGutFac implements GuiFac {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}

class MacTextArea implements TextArea {

	@Override
	public String getText() {
		return "맥 텍스트 에어리어";
	}

}

class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼 ");
	}

}

class WinGutFac implements GuiFac {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}

class WinTextArea implements TextArea {

	@Override
	public String getText() {
		return "윈도우 텍스트 에어리어";
	}

}
