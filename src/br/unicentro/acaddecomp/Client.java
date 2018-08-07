package br.unicentro.acaddecomp;

public class Client {
	public static void main(String[] args) {
		TextProcessor tp = new TextProcessor("Test");
		CommandItalic italic = new CommandItalic(tp);
		CommandBold bold = new CommandBold(tp);
		Macro macro = new Macro();
		macro.addCommand(italic);
		macro.addCommand(bold);
		macro.executeAll();
	}
}
