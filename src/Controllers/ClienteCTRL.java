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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BlackSterben
 */
public class ClienteCTRL implements ActionListener {

    private Cliente cliente;
    private ClienteDAO clientedao;
    private ViewGestionCliente viewCliente;

    public ClienteCTRL() {
    }

    public ClienteCTRL(Cliente cliente, ClienteDAO clientedao, ViewGestionCliente viewCliente) {
        this.cliente = cliente;
        this.clientedao = clientedao;
        this.viewCliente = viewCliente;
        //Para todos los botones que hayan en la interfaz
        this.viewCliente.BtmRegister.addActionListener(this);
        this.viewCliente.jButton1.addActionListener(this);
    }

    public void Iniciar() {
        viewCliente.setTitle("Gestionar Clienteeeee");
        viewCliente.setLocationRelativeTo(null);

    }


    public void recuperarClientes() throws SQLException, ClassNotFoundException {
        List<Cliente> clientes = clientedao.RecuperarClientes(Conexion.obtener());

        clientes.forEach((cliente) -> {
            //viewCliente.tableClientes.
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == viewCliente.BtmRegister) {
            //System.out.println("Controllers.ClienteCTRL.actionPerformed()");
            cliente.setCedula(viewCliente.TxCedula.getText());
            cliente.setNombre(viewCliente.TxName.getText());
            cliente.setApellidos(viewCliente.TxLastName.getText());
            cliente.setTelefono(viewCliente.TxCel.getText());
            cliente.setCorreo(viewCliente.TxEmail.getText());
            cliente.setCiudad(viewCliente.TxCity.getText());

            try {
                clientedao.GuardarCliente(Conexion.obtener(), cliente);
//                if(clientedao.registrar(cliente)){
//                    System.out.println("Registro guardado");
//                    Limpiar();
//                }else{
//                    System.out.println("Error");
//                }
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ClienteCTRL.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        //Aca irian el resto de botones que tenga la interfaz
        
        if(e.getSource() == viewCliente.jButton1){
            System.out.println("Controllers.ClienteCTRL.actionPerformed()");
        }
    }
    
    public void Limpiar(){
        viewCliente.TxCedula.setText(null);
        viewCliente.TxName.setText(null);
        viewCliente.TxLastName.setText(null);
        viewCliente.TxCel.setText(null);
        viewCliente.TxEmail.setText(null);
        viewCliente.TxCity.setText(null);
    }

 
}
