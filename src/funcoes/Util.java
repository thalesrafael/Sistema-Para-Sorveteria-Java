/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcoes;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

/**
 *
 * @author Admin
 */
public class Util {
    public static void habilitar(boolean valor, JComponent...componentes){
        for(JComponent comp:componentes){
            comp.setVisible(valor);
        }
    }
    public static void limpar(JComponent...componentes){
        for(JComponent obj:componentes){
            if(obj instanceof JTextField){
                ((JTextField)obj).setText("");
            }
            if(obj instanceof JComboBox){
                ((JComboBox)obj).setSelectedIndex(0);
            }if(obj instanceof JRadioButton)
               ((JRadioButton)obj).setSelected(false);
            }
        }
    }

  
   
