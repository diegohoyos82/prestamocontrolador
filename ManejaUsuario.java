/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamocontrolador;

/**
 *
 * @author diego
 */
public interface ManejaUsuario {
    void altaUsuario(Usuario a);
    void imprimeUsuario();
    void eliminarUsuario(String identificacionUsuario);
    Usuario buscarUsuario(String identificacionUsuario);

   
}
