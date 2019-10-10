package br.fepi.tcc.model;

public enum TipoConta {
	RESPONSAVEL("Responsável"), PACIENTE("Paciente");
	
	private String tipo;
	
	TipoConta(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getTipo()
	{
		return tipo;
	}

}
