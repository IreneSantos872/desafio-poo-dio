package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargahoraria(4);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargahoraria(6);

        System.out.println(curso1);
        System.out.println(curso2);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição Mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devnome = new Dev();
        devnome.setNome("Irene");
        devnome.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devnome.getConteudosInscritos());
        devnome.progredir();
        devnome.progredir();
        devnome.progredir();
        System.out.println("-------");
        System.out.println("Conteudos Inscritos: " + devnome.getConteudosInscritos());
        System.out.println("Conteudos Concluidoc: " + devnome.getConteudosConcluidos());


        Dev devnome2 = new Dev();
        devnome2.setNome("Paulo");
        devnome2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devnome2.getConteudosInscritos());
        devnome2.progredir();
        System.out.println("-------");
        System.out.println("Conteudos Inscritos: " + devnome2.getConteudosInscritos());
        System.out.println("Conteudos Concluidoc: " + devnome2.getConteudosConcluidos());

    }
}
