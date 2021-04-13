/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassDAO;

import Class.Cliente;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author BlackSterben
 */
public class ClienteDAO extends Conexion {
    private final String tablaCliente = "clientes";
    
    public void GuardarCliente (Connection conexion, Cliente cliente) throws SQLException{
        PreparedStatement consulta;
        
        consulta = conexion.prepareStatement("INSERT INTO"+this.tablaCliente+
                "(CEDULA"+
                ",NOMBRE"+
                ",APELLIDOS"+
                ",TELEFONO"+
                ",CORREO"+
                ",CIUDAD) VALUES (?,?,?,?,?,?);");
        consulta.setString(1, cliente.getCedula());
        consulta.setString(2, cliente.getNombre());
        consulta.setString(3, cliente.getTelefono());
        consulta.setString(4, cliente.getCorreo());
        consulta.setString(5, cliente.getCiudad());
        
        consulta.executeLargeUpdate();
        JOptionPane.showMessageDialog(null, "Empleado Registrado correctamente");
     }
    
    
    public boolean registrar (Cliente cliente) throws SQLException, ClassNotFoundException{
        PreparedStatement consulta = null;
        
        Connection conect = obtener();
        
        String sql = "INSERT INTO clientes"+
                "(CEDULA"+
                ",NOMBRE"+
                ",APELLIDOS"+
                ",TELEFONO"+
                ",CORREO"+
                ",CIUDAD) VALUES (?,?,?,?,?,?);";
            
        try{
            consulta = conect.prepareStatement(sql);
            consulta.setString(1, cliente.getCedula());
            consulta.setString(2, cliente.getNombre());
            consulta.setString(3, cliente.getApellidos());
            consulta.setString(4, cliente.getTelefono());
            consulta.setString(5, cliente.getCorreo());
            consulta.setString(6, cliente.getCiudad());
            
            consulta.execute();
            return true;
        }catch(SQLException e){
            //System.out.println("");
            System.err.print(e);
            return false;
        } 
        
    }
    
    public List<Cliente> RecuperarClientes (Connection conexion)throws SQLException, ClassNotFoundException {
       
        List<Cliente> Clientes;
        Clientes = new LinkedList<>();
        
        try {
            
            PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM "+ this.tablaCliente+ " ORDER BY NOMBRE");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()){
                Clientes.add(new Cliente(resultado.getString("CEDULA"),resultado.getString("NOMBRE"),resultado.getString("APELLIDOS"),resultado.getString("TELEFONO"),resultado.getString("CORREO"),resultado.getString("CIUDAD")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Clientes;
    }
    
}
