package br.com.coletorlixo.model;

import javax.swing.JLabel;

/*
 * Essa classe foi extendida de Image para montar o ambiente
 * o atributo flag serve para identificar se � agente, lixeira organico,
 * lixeira seco, lixo seco ou lixo organico.
 * */

public class MyAmbiente extends JLabel {

	private String flag;
	
	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	
}
