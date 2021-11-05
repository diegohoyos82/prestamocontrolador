/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamocontrolador;

/**
 *
 * @author diego
 */
public interface OperacionPrestamo {
    void altaPrestamo(Usuario a, String identificacionUsuario);
    void eliminarPrestamo(String identificacionUsuario);
    Usuario buscarPrestamo(String identificacionUsuario);

   
}
