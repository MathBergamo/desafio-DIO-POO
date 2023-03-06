package com.example.desafiodiopoo;

import com.example.desafiodiopoo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JavaScript", "Descrição curso JavaScript", 4);

        Mentoria mentoria1 = new Mentoria("Mentoria de Java", "Descrição Mentoria Java", LocalDate.now());

        Conteudo curso3 = new Curso("Curso de Python", "Descrição Curso de Python", 12);
        //Isso é um exemplo de polimofirsmo, ou seja, tudo que está dentro de Conteudo, está em Curso, mas não vice-versa.

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("--- Matheus ---");
        System.out.println("Conteúdos inscritos: " + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("Conteúdos concluídos: " + devMatheus.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devMatheus.getConteudosInscritos());//Retirou dos conteúdos incristos os conteúdos que foram para concluídos.
        System.out.println("XP: " + devMatheus.calcularTotalXp());

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("\n--- João ---");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}