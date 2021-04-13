/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Class.Cliente;
import ClassDAO.ClienteDAO;
import Conexion.Conexion;
import Views.ViewGestionCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BlackSterben
 */
public class CTRLCliente implements ActionListener{
    
    private Cliente cliente;
    private ClienteDAO clienteDAO;
    private ViewGestionCliente VGC;

    public CTRLCliente(Cliente cliente, ClienteDAO clienteDAO, ViewGestionCliente VGC) {
        this.cliente = cliente;
        this.clienteDAO = clienteDAO;
        this.VGC = VGC;
        
        this.VGC.BtmRegister.addActionListener(this);
        this.VGC.jButton1.addActionListener(this);
    }
    
    public void Iniciar(){
        VGC.setTitle("Clietnes");
        VGC.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getSource() == VGC.BtmRegister) {
            System.out.println("Controllers.ClienteCTRL.actionPerformed()");
            cliente.setCedula(VGC.TxCedula.getText());
            cliente.setNombre(VGC.TxName.getText());
            cliente.setApellidos(VGC.TxLastName.getText());
            cliente.setTelefono(VGC.TxCel.getText());
            cliente.setCorreo(VGC.TxEmail.getText());
            cliente.setCiudad(VGC.TxCity.getText());

            try {
                //clienteDAO.GuardarCliente(Conexion.obtener(), cliente);
                if(clienteDAO.registrar(cliente)){
                    System.out.println("Registro guardado");
                    Limpiar();
                }else{
                    System.out.println("Error");
                }
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ClienteCTRL.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        //Aca irian el resto de botones que tenga la interfaz
        
        
        if(e.getSource() == VGC.jButton1){
            System.out.println("Controllers.ClienteCTRL.actionPerformed()");
        }
    }
    
     public void Limpiar(){
        VGC.TxCedula.setText(null);
        VGC.TxName.setText(null);
        VGC.TxLastName.setText(null);
        VGC.TxCel.setText(null);
        VGC.TxEmail.setText(null);
        VGC.TxCity.setText(null);
    }
    
}
