/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Date;

/**
 *
 * @author BlackSterben
 */
public class Cliente {
    private String Cedula;
    private String Nombre ;
    private String Apellidos;
    private String Telefono;
    private String Correo;
    private String Ciudad;

    public Cliente() {
    }

    public Cliente(String Cedula, String Nombre, String Apellidos, String Telefono, String Correo, String Ciudad) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Correo = Correo;
        this.Ciudad = Ciudad;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
    
}
