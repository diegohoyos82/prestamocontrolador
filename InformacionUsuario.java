/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamocontrolador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class InformacionUsuario implements ManejaUsuario {
    
    private ArrayList<Usuario> usuario;
    
    public InformacionUsuario(){
        usuario = new ArrayList<>();
    }

    public ArrayList<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(ArrayList<Usuario> usuario) {
        this.usuario = usuario;
    }
    
        
    
    public void imprimeUsuario() {
       
        for (int i=0; i<usuario.size();i++){
                System.out.println(usuario.get(i));
        }
    }

    public void altaUsuario(Usuario a) {
        usuario.add(a);
    }

    

    @Override
    public void eliminarUsuario(String identificacionUsuario) {
        Usuario a = buscarUsuario(identificacionUsuario);
        if (a != null) {
            usuario.remove(a);
            System.out.println("Op. Eliminar usuario:" + identificacionUsuario);
        }    
    }

    @Override
    public Usuario buscarUsuario(String identificacionUsuario) {
        for (Usuario a : usuario) {
                    
            if (a.getIdentificacionUsuario() == identificacionUsuario) {
                System.out.println("Op.Buscar Usuario:" + identificacionUsuario);
                System.out.println(a);
                return null;
            }
        }
        System.out.println("El usuario con Identificacion:" + identificacionUsuario + " no existe");
        return null;}

   
    
}
