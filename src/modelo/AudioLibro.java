
package modelo;

import interfaces.Reproducible;

/**
 *
 * @author Ramses zhores iturrizaga Acosta 
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
        
        if(duracionMinutos <= 0){
        throw new IllegalArgumentException("La duración debe ser mayor que cero");
        }
        this.duracionMinutos = duracionMinutos;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        if(narrador == null ||narrador.isBlank()){
        throw new IllegalArgumentException("Debe indicar un narrador");
        }
        this.narrador = narrador;
    }

    public String getFormatoAudio() {
        return formatoAudio;
    }

    public void setFormatoAudio(String formatoAudio) {
        if(formatoAudio == null ||formatoAudio.isBlank()){
        throw new IllegalArgumentException("Debe indicar un formato");
        }
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
        return super.toString() + ", Narrador: "
            + narrador + ", Duración: " + duracionMinutos + " min" + ", Formato: "
            + formatoAudio;
    }
    
    
    
    
}
