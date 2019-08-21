package br.fepi.tcc.model;

public enum tipoConta {
	TUTOR("Tutor/Médico"), PACIENTE("Paciente");
	
	private String tipo;
	
	tipoConta(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getTipo()
	{
		return tipo;
	}

}
