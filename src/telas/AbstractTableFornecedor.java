/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import persistencia.Fornecedor;

/**
 *
 * @author Edgar Vilhalba
 */
public class AbstractTableFornecedor extends AbstractTableModel{
    List lstFornecedor;

    public void setList(List lstFornecedor) {
        this.lstFornecedor = lstFornecedor;
        this.fireTableDataChanged();
    }
    
    public Object getFornecedor(int ind) {
        return lstFornecedor.get(ind);
    }
    @Override
    public int getRowCount() {
        return lstFornecedor.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Fornecedor fornecedor = (Fornecedor) lstFornecedor.get(rowIndex);
        if (columnIndex == 0) {
            return fornecedor.getCodigo();
        }
        if (columnIndex == 1) {
            return fornecedor.getNome();
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
