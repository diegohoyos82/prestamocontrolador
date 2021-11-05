package prestamocontrolador;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Usuario {
    private String identificacionUsuario;
    private int tipoUsuario;
    
    public Usuario (String identificacionUsuario, int tipoUsuario){
        this.identificacionUsuario = identificacionUsuario;
        this.tipoUsuario = tipoUsuario;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    @Override
    public String toString() {
        return "Usuario{" + "identificacionUsuario=" + identificacionUsuario + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
   
}
