/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jtcaq
 */
public abstract class MaterialBibliografico {
    
    private int id;
    private String titulo;
    private String autor;
    private String categoria;
    private String isbn; //CodigoIdentificadorUnico
    private int anioPublicacion;
    private boolean disponible;

    public MaterialBibliografico() {
    }

    public MaterialBibliografico(int id, String titulo, String autor, String categoria, String isbn, int anioPublicacion, boolean disponible) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public abstract String getTipoMaterial();

    @Override
    public String toString() {
        return "ID: " + id + ", Tipo: " + getTipoMaterial() + ", Titulo: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Categoria:" + categoria + ", Año: " + anioPublicacion + ", Disponible: " + disponible;
    }
    
    
    
}
