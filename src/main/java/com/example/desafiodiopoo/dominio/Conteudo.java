package com.example.desafiodiopoo.dominio;

public abstract class Conteudo { //Abstratc é um recurso que torna a Classe abstrata, ou seja, ela não pode ser instânciada
    //Logo, abstract tem a intenção de ser usada apenas para ser a classe mãe, portanto, não tem a necessidade de ser utilizada
    //de forma que há necessidade de abstrai-la, pois seus conteúdos só serão usados posteriormente por outras classes.
    protected static final double XP_PADRAO = 10d;
    //Static atribui os métodos e atributos dessa classe para todos os seus objetos que forem instânciados, ou seja.
    //garante que todos os objetos herdem seus valores.
    private String titulo;
    private String descricao;
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
