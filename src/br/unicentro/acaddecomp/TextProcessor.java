package br.unicentro.acaddecomp;

public class TextProcessor {

	private String text;
	
	public TextProcessor (String text){
		this.text = text;
	}
	
	public void italic(){
		System.out.println("<i>" + text + "</i>");
	}
	
	public void bold(){
		System.out.println("<u>" + text + "</u>");
	}
	
}
