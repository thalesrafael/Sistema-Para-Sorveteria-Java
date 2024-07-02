/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import persistencia.Produto;

/**
 *
 * @author Edgar Vilhalba
 */
public class AbstractTableProduto extends AbstractTableModel{
    List lstProduto;

    public void setList(List lstGrupos) {
        this.lstProduto = lstProduto;
        this.fireTableDataChanged();
    }
    
    public Object getProduto(int ind) {
        return lstProduto.get(ind);
    }
    @Override
    public int getRowCount() {
        return lstProduto.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = (Produto) lstProduto.get(rowIndex);
        if (columnIndex == 0) {
            return produto.getCodigo();
        }
        if (columnIndex == 1) {
            return produto.getNomeproduto();
        }
       
        return null;
    }
    public String getColumnName(int coluna) {
        if (coluna == 0) {
            return "Código";
        }
        if (coluna == 1) {
            return "Nome produto";
        }
       
        return "";
    }
    
}
