package br.unicentro.acaddecomp;

import java.util.ArrayList;

public class Macro {

	private ArrayList<Command> macro = new ArrayList<>();
	
	public void addCommand(Command c){
		macro.add(c);
	}
	
	public void executeAll(){
		for (Command c : macro){
			c.execute();
		}
	}
}
