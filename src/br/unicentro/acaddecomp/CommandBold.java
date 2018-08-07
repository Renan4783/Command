package br.unicentro.acaddecomp;

public class CommandBold implements Command{

private TextProcessor tp;
	
	public CommandBold (TextProcessor tp){
		this.tp = tp;
	}
	
	@Override
	public void execute() {
		tp.bold();
	}

}
