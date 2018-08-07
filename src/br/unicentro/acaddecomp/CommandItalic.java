package br.unicentro.acaddecomp;

public class CommandItalic implements Command{

	private TextProcessor tp;
	
	public CommandItalic (TextProcessor tp){
		this.tp = tp;
	}
	
	@Override
	public void execute() {
		tp.italic();
	}

}
