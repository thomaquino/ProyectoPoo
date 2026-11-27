
package modelo;

import interfaces.Prestable;
/**
 *
 * @author Ramses zhores iturrizaga Acosta
 */
public class LibroFisico extends MaterialBibliografico implements Prestable {
    
    private int cantidadEjemplares;
    private String ubicacionEstante;

    public LibroFisico() {
    }

    public LibroFisico(int id, String titulo, String autor, String categoria,
                       String isbn, int anioPublicacion, boolean disponible,
                       int cantidadEjemplares, String ubicacionEstante) {
        super(id, titulo, autor, categoria, isbn, anioPublicacion, disponible);
        
        if(cantidadEjemplares < 0){
        throw new IllegalArgumentException("La cantidad de ejemplares no puede ser negativa");
        }
        this.cantidadEjemplares = cantidadEjemplares;
        
        if(ubicacionEstante == null || ubicacionEstante.isBlank()){
        throw new IllegalArgumentException("Debe indicar una ubicación de estante");
        }
        this.ubicacionEstante = ubicacionEstante;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        
        if(cantidadEjemplares < 0){
        throw new IllegalArgumentException("La cantidad de ejemplares no puede ser negativa");
    }
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getUbicacionEstante() {
        return ubicacionEstante;
    }

    public void setUbicacionEstante(String ubicacionEstante) {
       
        if(ubicacionEstante == null|| ubicacionEstante.isBlank()){

        throw new IllegalArgumentException("Debe indicar una ubicación de estante");
        }
        this.ubicacionEstante = ubicacionEstante;
    }

    @Override
    public String getTipoMaterial() {
        return "Libro Fisico";
    }

    @Override
    public void prestar() {
        
        if (cantidadEjemplares <= 0){
            throw new IllegalStateException(
            "No hay ejemplares disponibles");
        }
           
        cantidadEjemplares--;
            
        if (cantidadEjemplares == 0){
                setDisponible(false);
        }          
    }

    @Override
    public void devolver() {
        
        cantidadEjemplares++;
        
        setDisponible(true);
    }

    @Override
    public String toString() {
        return super.toString() + ", Ejemplares: " 
                + cantidadEjemplares + ", Estante: " + ubicacionEstante; 
    }
    
   
}
