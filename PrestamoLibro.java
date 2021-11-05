/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamocontrolador;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class PrestamoLibro implements OperacionLibros {
    
    private ArrayList<Libro> libro;
    
    public PrestamoLibro(){
        libro = new ArrayList<>();
    }

    public ArrayList<Libro> getLibro() {
        return libro;
    }

    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }
    
    @Override
    public void prestarLibro(Libro a){
        libro.add(a);
    }
    
    @Override
    public void listarlibro() {
        for (int i=0; i<libro.size();i++){
            System.out.println(libro.get(i));
        }
    }
    
    public Libro buscarLibro(String isbn) {
        for (Libro a : libro) {
                    
            if (a.getIsbn() == isbn) {
                System.out.println("Op.Buscar Libro:" + isbn);
                System.out.println(a);
                return a;
            }
        }
        System.out.println("El Libro con isbn:" + isbn + " no esta disponible!");
        return null;
    }
    
    public void eliminarLibro(String isbn) {
        Libro a = buscarLibro(isbn);
        if (a != null) {
            libro.remove(a);
            System.out.println("Op. Eliminar Libro:" + isbn);
        }
    }

    void altaUsuario(Usuario a1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

           
}
