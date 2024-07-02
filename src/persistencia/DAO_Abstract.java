package persistencia;

import java.awt.List;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcos
 */
public abstract class DAO_Abstract {
    
    public abstract void insert(Object objeto);

    public abstract void update(Object objeto);

    public abstract void delete(Object objeto);        
    
    public abstract Object list(int codigo);
    
    public abstract ArrayList listAll();
    
}
