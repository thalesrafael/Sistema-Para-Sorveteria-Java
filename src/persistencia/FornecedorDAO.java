/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;


import java.awt.List;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
/**
 *
 * @author Admin
 */
public class FornecedorDAO extends DAO_Abstract {
    Session session;
    
       

    public FornecedorDAO() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();
    
      
    }
            

    @Override
    public void insert(Object objeto) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        
       
        session.save( (Fornecedor) objeto);
        session.getTransaction().commit();
    }
        
    

    @Override
    public void update(Object objeto) {
 if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        session.update( (Fornecedor) objeto);
        session.flush();
        session.getTransaction().commit();
        
            
    }

    @Override
    public void delete(Object objeto) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
      
        session.delete( (Fornecedor) objeto);
        session.getTransaction().commit();
    }
        
    
    
      @Override
    public Object list(int codigo) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
            System.out.println("ativou");
        }
        
       Criteria crit = session.createCriteria(Fornecedor.class);
        crit.add(Restrictions.eq("codigog", codigo));
        Fornecedor fornecedor = null;
        if (!crit.list().isEmpty()) {
            fornecedor = (Fornecedor) crit.list().get(0);
        }
        //session.getTransaction().commit();
        return fornecedor;
  
    }
       
    
            
    

    @Override
    public ArrayList listAll() {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        Criteria crit = session.createCriteria(Fornecedor.class);
        
         java.util.List lista = crit.list();
         return (ArrayList) lista;
    }
    public static void main(String[]args){
        Fornecedor fornecedor = new Fornecedor("G2", "grupo 2", 2);
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedorDAO.delete(fornecedor);
        //System.out.println("Inserido com sucesso");
    }
    }
        

    

  
    

