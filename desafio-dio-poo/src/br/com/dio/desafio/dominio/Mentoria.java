package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

	private LocalDate date;
	
	public Mentoria() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20;
	}
	
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Mentoria [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", date=" + date + "]";
	}





	
	
	
}
