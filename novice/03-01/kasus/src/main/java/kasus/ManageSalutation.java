package kasus;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageSalutation {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      
      
      ManageSalutation ME = new ManageSalutation();

      ME.sessionFactory();
      /* Add few employee records in database */
      //Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
      //Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      //Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      /* List down all the employees */
      ME.listSalutation();

      /* Update employee's records */
      //ME.updateEmployee(empID1, 5000);

      /* Delete an employee from the database */
      //ME.deleteEmployee(empID2);

      /* List down new list of the employees */
      ME.listSalutation();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addSalutation(String salutation){
      
      Session session = factory.openSession();
      Transaction tx = null;
      Integer salutation_id = null;
      
      try {
         tx = session.beginTransaction();
         Salutation salut = new Salutation(salutation);
         salutation_id = (Integer) session.save(salut); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return salutation_id;
   }
   
   /* Method to  READ all the employees */
   public void listSalutation( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      

      try {
         tx = session.beginTransaction();
         List saluts = session.createQuery("FROM salutation").list(); 
         for (Iterator iterator = saluts.iterator(); iterator.hasNext();){
            Salutation salut = (Salutation) iterator.next();
            System.out.println("ID: "+salut.getId()); 
            System.out.print("Salutation:" + salut.getSalutation()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE salary for an employee */
   public void updateSalutation(Integer salutation_id, String salutation ){
      Session session = factory.openSession();
      Transaction tx = null;
      

      try {
         tx = session.beginTransaction();
         Salutation salut = (Salutation)session.get(Salutation.class, salutation_id); 
         salut.setSalutation( salutation );
		 session.update(salut); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an employee from the records */
   public void deleteSalutation(Integer salutation_id){
      Session session = factory.openSession();
      Transaction tx = null;
      
      

      try {
         tx = session.beginTransaction();
         Salutation salut = (Salutation)session.get(Salutation.class, salutation_id); 
         session.delete(salut); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }

   public void sessionFactory() {
      try {
         factory = new Configuration().configure().addAnnotatedClass(Salutation.class).addAnnotatedClass(Member.class).buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
   }
}