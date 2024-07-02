/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.awt.List;



import java.util.ArrayList;

import org.hibernate.criterion.Restrictions;
import persistencia.Cliente;
import persistencia.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;




/**
 *
 * @author Admin
 */
public class ClienteDAO extends DAO_Abstract {
    Session session;

   
    
        
    public ClienteDAO() {
        session = HibernateUtil.getSessionFactory().getCurrentSession();   
       
    }
    @Override
    public void insert(Object objeto) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        
       
        session.save( (Cliente) objeto);
        session.getTransaction().commit();
    
    }

    @Override
    public void update(Object objeto) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        session.update( (Cliente) objeto);
        session.flush();
        session.getTransaction().commit();
      
    }

    @Override
    public void delete(Object objeto) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
      
        session.delete( (Cliente) objeto);
        session.getTransaction().commit();
       
    }

    @Override
    public Object list(int codigo) {
        if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
            System.out.println("ativou");
        }
        
       Criteria crit = session.createCriteria(Cliente.class);
        crit.add(Restrictions.eq("codigog", codigo));
        Cliente cliente = null;
        if (!crit.list().isEmpty()) {
            cliente = (Cliente) crit.list().get(0);
        }
        //session.getTransaction().commit();
        return cliente;
       
    } 
    
                 
    
    
    @Override
    public ArrayList listAll() {
          if(!session.getTransaction().isActive()){
            session.getTransaction().begin();
        }
        Criteria crit = session.createCriteria(Cliente.class);
        
         java.util.List lista = crit.list();
         return (ArrayList) lista;

      }
    public static void main(String[]args){
      Cliente cliente = new Cliente("G2", "grupo 2", 2);
        ClienteDAO clienteDAO = new ClienteDAO();
        //List lista = grupoDAO.listAll();
        //System.out.println("grupo:" + ((TbGrupos) lista.get(0)).getNome());
        clienteDAO.delete(cliente);
//        System.out.println("inserdido com sucesso");
    }
      
    
}
    

