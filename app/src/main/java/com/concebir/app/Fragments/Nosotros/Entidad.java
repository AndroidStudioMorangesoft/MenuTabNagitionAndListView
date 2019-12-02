package com.concebir.app.Fragments.Nosotros;

public class Entidad {


    private int imgfoto;
    private String titulo;
    private String contenido;

    public Entidad(int imgfoto, String titulo, String contenido) {
        this.imgfoto = imgfoto;
        this.titulo = titulo;
        this.contenido = contenido;
    }

    public int getImgfoto() {
        return imgfoto;
    }

    public void setImgfoto(int imgfoto) {
        this.imgfoto = imgfoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
