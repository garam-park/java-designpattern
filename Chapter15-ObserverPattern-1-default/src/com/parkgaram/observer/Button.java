package com.parkgaram.observer;

public class Button {
	
	public void onClick(){
		//이벤트 처리
		if(onClickListener !=null)
			onClickListener.onClick(this);
	}
	
	public interface OnClickListener{
		public void onClick(Button button);
	}
	
	private OnClickListener onClickListener;
	
	public void setOnClickListener(OnClickListener onClickListener) {
		this.onClickListener = onClickListener;
	}

}
