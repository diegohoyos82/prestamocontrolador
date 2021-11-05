/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package prestamocontrolador;

/**
 *
 * @author diego
 */
public interface OperacionLibros {
    void prestarLibro(Libro a);
    void listarlibro();
    void eliminarLibro(String isbn);
    Libro buscarLibro(String isbn);
    
}

