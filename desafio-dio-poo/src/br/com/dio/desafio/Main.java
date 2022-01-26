package br.com.dio.desafio;

import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("curso Java");
		curso1.setDescricao("treinamento em linguagem Java.");
		curso1.setCargaHoraria(96);
		
		System.out.println(curso1);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso JAva intermediário");
		curso2.setDescricao("treinamento intermediário em linguagem Java.");
		curso2.setCargaHoraria(100);
		
		System.out.println(curso2);
		
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("mentoria em Java");
		mentoria1.setDescricao("Mentoria em linguagem Java.");
		mentoria1.setDate(LocalDate.now());
		
		System.out.println(mentoria1);

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java");
		bootcamp.setDescricao("Descrição do bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		
		Dev devMarcos = new Dev();
		devMarcos.setNome("Marcos");
		devMarcos.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + devMarcos.getConteudoInscrito());
		devMarcos.progredir();
		System.out.println("Conteudos Inscritos: " + devMarcos.getConteudoInscrito());
		System.out.println("Conteudos Concluidos: " + devMarcos.getConteudoConcluido());
		System.out.println("XP " + devMarcos.calcularTotalXP());
		
		Dev devMarcela = new Dev();
		devMarcela.setNome("Marcela");
		devMarcela.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: " + devMarcela.getConteudoInscrito());
		devMarcela.progredir();
		System.out.println("Conteudos Inscritos: " + devMarcela.getConteudoInscrito());
		System.out.println("Conteudos Concluidos: " + devMarcela.getConteudoConcluido());
		System.out.println("XP " + devMarcela.calcularTotalXP());
	}

}
