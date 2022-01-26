package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {

	private String nome;
	private Set<Conteudo> conteudoInscrito = new LinkedHashSet<>();
	private Set<Conteudo> conteudoConcluido = new LinkedHashSet<>();
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudoInscrito.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
		
	}
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudoInscrito.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudoConcluido.add(conteudo.get());
			this.conteudoInscrito.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo.");
		}
	}
	
	public double calcularTotalXP() {
		return this.conteudoInscrito
				.stream()
				.mapToDouble(conteudo -> conteudo.calcularXP())
				.sum();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudoInscrito() {
		return conteudoInscrito;
	}

	public void setConteudoInscrito(Set<Conteudo> conteudoInscrito) {
		this.conteudoInscrito = conteudoInscrito;
	}

	public Set<Conteudo> getConteudoConcluido() {
		return conteudoConcluido;
	}

	public void setConteudoConcluido(Set<Conteudo> conteudoConcluido) {
		this.conteudoConcluido = conteudoConcluido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudoConcluido == null) ? 0 : conteudoConcluido.hashCode());
		result = prime * result + ((conteudoInscrito == null) ? 0 : conteudoInscrito.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (conteudoConcluido == null) {
			if (other.conteudoConcluido != null)
				return false;
		} else if (!conteudoConcluido.equals(other.conteudoConcluido))
			return false;
		if (conteudoInscrito == null) {
			if (other.conteudoInscrito != null)
				return false;
		} else if (!conteudoInscrito.equals(other.conteudoInscrito))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
	
}
