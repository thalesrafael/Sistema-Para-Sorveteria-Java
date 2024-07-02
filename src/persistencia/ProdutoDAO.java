/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.awt.List;
import persistencia.Produto;
import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Admin
 */
public class ProdutoDAO extends DAO_Abstract {
    Session session;

       
    
    public ProdutoDAO() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();  
   
        
    }
    @Override
    public void insert(Object objeto) {
         if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        
       
        session.save( (Produto) objeto);
        session.getTransaction().commit();
    }
          
           
    

    @Override
    public void update(Object objeto) {
         if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        session.update( (Produto) objeto);
        session.flush();
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object objeto) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
      
        session.delete( (Produto) objeto);
        session.getTransaction().commit();
    }

    
    public Object list(int codigo) {
       if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
            System.out.println("ativou");
        }
        
       Criteria crit = session.createCriteria(Produto.class);
        crit.add(Restrictions.eq("codigog", codigo));
        Produto produto = null;
        if (!crit.list().isEmpty()) {
            produto = (Produto) crit.list().get(0);
        }
        //session.getTransaction().commit();
        return produto;

    }

    @Override
    public ArrayList listAll() {
         if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        Criteria crit = session.createCriteria(Produto.class);
        
         java.util.List lista = crit.list();
         return (ArrayList) lista;
    }
    public static void main(String[]args){
        Produto produto = new Produto("G2", "grupo 2", 2);
        ProdutoDAO produtoDAO = new ProdutoDAO();
        produtoDAO.delete(produto);
        System.out.println("Inserido com sucesso");
    }

}