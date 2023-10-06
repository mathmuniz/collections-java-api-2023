package com.mtmuniz.list.Pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicao;

    public Livro(String titulo, String autor, int anoPublicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicao = anoPublicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicao() {
        return anoPublicao;
    }

    public void setAnoPublicao(int anoPublicao) {
        this.anoPublicao = anoPublicao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicao=" + anoPublicao +
                '}';
    }
}
