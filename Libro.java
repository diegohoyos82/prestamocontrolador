/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamocontrolador;

/**
 *
 * @author diego
 */
public class Libro {
    
    private String isbn;
    
    public Libro (String isbn) {
        this.isbn = isbn;
    }

   
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return  "Codigo Libro=" + isbn;
    }
    
}
