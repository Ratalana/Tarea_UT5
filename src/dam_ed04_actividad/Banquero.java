/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam_ed04_actividad;

/**
 *
 * @author DPTOSISTEMAS
 */
public class Banquero {
    
    private String nombre;
    private String apellidos;
    private String DNI;

    public Banquero() {
    }

    public Banquero(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    
     
}
