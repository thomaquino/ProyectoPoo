/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import interfaces.Reproducible;

/**
 *
 * @author jtcaq
 */
public class AudioLibro extends MaterialBibliografico implements Reproducible {
    
    private int duracionMinutos;
    private String narrador;
    private String formatoAudio;

    public AudioLibro() {
    }

    public AudioLibro(int id, String titulo, String autor, String categoria, 
                      String isbn, int anioPublicacion, boolean disponible, 
                      int duracionMinutos, String narrador, String formatoAudio) {
        super(id, titulo, autor, categoria, isbn, anioPublicacion, disponible);
        this.duracionMinutos = duracionMinutos;
        this.narrador = narrador;
        this.formatoAudio = formatoAudio;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public String getFormatoAudio() {
        return formatoAudio;
    }

    public void setFormatoAudio(String formatoAudio) {
        this.formatoAudio = formatoAudio;
    }
    
    @Override
    public String getTipoMaterial() {
        return "Audiolibro";
    }

    @Override
    public void reproducir() {
        
        System.out.println("Reproduciendo audiolibro: "+ getTitulo());
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + getTipoMaterial()+  ", Narrador: "
            + narrador + ", Duración: " + duracionMinutos + " min" + ", Formato: "
            + formatoAudio;
    }
    
    
    
    
}
