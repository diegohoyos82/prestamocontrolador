/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prestamocontrolador;
import integracion.LibroDAO;
import integracion.UsuarioDAO;
import integracion.PrestamoDAO;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class PrestamoControlador {

    public static String A3456;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ingreso de Libros
        Scanner consola = new Scanner(System.in);
        System.out.println("Digite la cantidad de Libros a ingresar: ");
        int cantidad = consola.nextInt();
        
        for  (int i=0; i < cantidad; i++){
            System.out.println("Ingrese Nuevo Libro");
            consola = new Scanner(System.in);
            String libronew = consola.nextLine();
            
            Libro a1 = new Libro(libronew);
            PrestamoLibro cc = new PrestamoLibro();
            cc.prestarLibro(a1);
         
            System.out.println("Este es el libro que acabo de ingresar:");
            
            LibroDAO dao = new LibroDAO();
            dao.prestarLibro(a1);
            dao.listarlibro();
            
            
        }
        
        // TODO code application logic here
        //Libro a1 = new Libro("A1234");
        //Libro a = new Libro("A2345");
        //Libro a = new Libro("A3456");
        //Libro a = new Libro("A4567");
       // Libro a5 = new Libro(libronew);
    
        //PrestamoLibro cc = new PrestamoLibro();
        
        
        //cc.prestarLibro(a1);
        //cc.prestarLibro(a2);
        //cc.prestarLibro(a3);
        //cc.prestarLibro(a4);
        //cc.prestarLibro(a5);
        
        //System.out.println("Estos Son los Libros Disponibles:");
        //cc.listarlibro();
        
        System.out.println("Ingrese el codigo del Libro a Buscar");
        //Scanner consola = new Scanner(System.in);
        String tituloLibro =consola.nextLine();
        System.out.println(tituloLibro);
        
        PrestamoLibro cc = new PrestamoLibro();
        cc.buscarLibro("A3456");
        //cc.listarlibro("A3456");
        
        LibroDAO dao = new LibroDAO();
        dao.buscarLibro(tituloLibro);
        
        
        System.out.println("Ingrese el codigo del Libro a Eliminar");
        //Scanner consola = new Scanner(System.in);
        String eliminandoLibro =consola.nextLine();
        System.out.println(tituloLibro);
        
        //PrestamoLibro cc = new PrestamoLibro();
        cc.eliminarLibro("A3456");
        //cc.listarlibro("A3456");
        
        //LibroDAO dao = new LibroDAO();
        dao.eliminarLibro(eliminandoLibro);
        
        //-------------------------------------------------------------------------
             //Ingreso de Usuarios
            System.out.println("Ingrese ID Usuario");
            consola = new Scanner(System.in);
            String usuarioid = consola.nextLine();
            System.out.println("Ingrese tipo Usuario");
            consola = new Scanner(System.in);
            int usuariotipo = consola.nextInt();
            
            Usuario a1 = new Usuario(usuarioid, usuariotipo);
            UsuarioDAO dae = new UsuarioDAO();
            dae.altaUsuario(a1);
         
            System.out.println("Este es el Usuario que acabo de ingresar:");
            
            dae.altaUsuario(a1);
            dae.imprimeUsuario();
            
            
            System.out.println("Ingrese el codigo del Usuario a Buscar");
            consola = new Scanner(System.in);
            String userioid =consola.nextLine();
            System.out.println(usuarioid);

            UsuarioDAO dai = new UsuarioDAO();
            dai.buscarUsuario(userioid);
  
               
            System.out.println("Ingrese el codigo del Usuario a Eliminar");
            //Scanner consola = new Scanner(System.in);
            String userDelete =consola.nextLine();
            System.out.println(userDelete);

            //PrestamoLibro cc = new PrestamoLibro();
            UsuarioDAO dau = new UsuarioDAO();
            dau.eliminarUsuario(userDelete);

            //-------------------------------------------------------------------------
             //Ingreso de Prestamos
            System.out.println("Ingrese ID Usuario");
            consola = new Scanner(System.in);
            String iduser = consola.nextLine();
            System.out.println("Ingrese tipo Usuario");
            consola = new Scanner(System.in);
            int tipouser = consola.nextInt();
            
            
            
            Prestamo t1 = new Prestamo(iduser, tipouser);
            PrestamoDAO dea = new PrestamoDAO();
            dea.altaPrestamo(t1);
         
            System.out.println("Este es el Usuario que acabo de ingresar:");
            
            dea.altaPrestamo(t1);
            dea.buscarPrestamo();
            
            
            System.out.println("Ingrese el codigo del Usuario a Buscar");
            consola = new Scanner(System.in);
            String idusuario =consola.nextLine();
            System.out.println(usuarioid);

            PrestamoDAO dei = new PrestamoDAO();
            dei.buscarPrestamo(idusuario);
  
               
            System.out.println("Ingrese el codigo del Usuario a Eliminar");
            //Scanner consola = new Scanner(System.in);
            String deleteUser =consola.nextLine();
            System.out.println(deleteUser);

            //PrestamoLibro cc = new PrestamoLibro();
            PrestamoDAO diu = new PrestamoDAO();
            diu.eliminarPrestamo(userDelete);
            
        
    }
               
    }

