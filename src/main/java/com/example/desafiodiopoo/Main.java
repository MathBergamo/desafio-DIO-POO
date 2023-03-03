package com.example.desafiodiopoo;

import com.example.desafiodiopoo.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 = new Curso("Curso Java","Descrição curso Java",8);
       Curso curso2 = new Curso("Curso JavaScript","Descrição curso JavaScript",4);

       Mentoria mentoria1 = new Mentoria("Mentoria de Java","Descrição Mentoria Java", LocalDate.now());

       System.out.println(mentoria1);
    }
}