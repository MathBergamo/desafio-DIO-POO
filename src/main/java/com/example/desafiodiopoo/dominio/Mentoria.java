package com.example.desafiodiopoo.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{//Extends define que Mentoria é filha de Conteudo
    //Tudo que tem em Conteudo, será obtido por Mentoria, mas tudo que tem em Mentoria, não estará necessariamente em Conteudo.
    private LocalDate data; //Classe que nos permite trabalhar com datas.

    /*Criei o construtor por opção própria para poder definir os atributos das classes instânciadas de forma mais simples utilizando 1 linha.
    Sem necessariamente utilizar o "set" para colocar o atributo linha por linha.
    */
    public Mentoria(String titulo, String descricao, LocalDate data) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
