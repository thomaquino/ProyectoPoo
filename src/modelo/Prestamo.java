/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author Flor Karina Garcia Rojas
 */
public class Prestamo {
    
    private int idPrestamo;
    private Usuario usuario;
    private LibroFisico libro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private boolean devuelto;
    

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Usuario usuario, LibroFisico libro, 
                    LocalDate fechaPrestamo, LocalDate fechaDevolucion,
                    boolean devuelto) {
        this.idPrestamo = idPrestamo;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.devuelto = devuelto;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LibroFisico getLibro() {
        return libro;
    }

    public void setLibro(LibroFisico libro) {
        this.libro = libro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
    
    public void registrarDevolucion(){
        
        if (devuelto){
            throw new IllegalStateException("El material ya fue devuelto");
        }
        
        this.devuelto = true;
        
        libro.devolver();
    }

    @Override
    public String toString() {
        return "Prestamo(" + "idPrestamo=" + idPrestamo + ", usuario=" + usuario.getNombre() + ", libro=" + libro.getTitulo() +
            ", fechaPrestamo=" + fechaPrestamo + ", fechaDevolucion=" + fechaDevolucion +  ", devuelto=" + devuelto +')';
    }
    
}
