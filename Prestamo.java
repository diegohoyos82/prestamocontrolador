/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestamocontrolador;

/**
 *
 * @author diego
 */
public class Prestamo {
    private String identificacionUsuario;
    private int tipoUsuario;
    
    
    

    public Prestamo(String iduser, int tipouser) {
        this.identificacionUsuario = identificacionUsuario;
        this.tipoUsuario = tipoUsuario; 
    }

       
      public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }

    
    @Override
    public String toString() {
        return "Prestamo{" + "identificacionUsuario=" + identificacionUsuario + ", tipoUsuario=" + tipoUsuario + '}';
    }
    
    }
    
    
