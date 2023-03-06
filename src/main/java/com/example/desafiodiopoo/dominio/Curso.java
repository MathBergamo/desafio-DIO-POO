package com.example.desafiodiopoo.dominio;

public class Curso extends Conteudo{
    private Integer cargaHoraria;

    public Curso(String titulo, String descricao, Integer cargaHoraria) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    public Double calcularXp(Double xp){
        return 0.0;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}