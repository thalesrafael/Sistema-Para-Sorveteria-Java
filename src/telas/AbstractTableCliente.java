/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import persistencia.Cliente;

/**
 *
 * @author Edgar Vilhalba
 */
public class AbstractTableCliente extends AbstractTableModel{
    List lstCliente;

    public void setList(List lstGrupos) {
        this.lstCliente = lstCliente;
        this.fireTableDataChanged();
    }
    
    public Object getCliente(int ind) {
        return lstCliente.get(ind);
    }
    @Override
    public int getRowCount() {
        return lstCliente.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = (Cliente) lstCliente.get(rowIndex);
        if (columnIndex == 0) {
            return cliente.getCodigo();
        }
        if (columnIndex == 1) {
            return cliente.getNome();
        }
       
        return null;
    }
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Código";
        }
        if (coluna == 1) {
            return "Nome";
        }
       
        return "";
    }
    
}
