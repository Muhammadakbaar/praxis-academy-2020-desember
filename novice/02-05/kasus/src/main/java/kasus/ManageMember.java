package kasus;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
import java.util.Set;
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageMember {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      
      
      ManageMember ME = new ManageMember();

      ME.sessionFactory();
      /* Add few employee records in database */
      //Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
      //Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      //Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      /* List down all the employees */
      ME.listMember();

      /* Update employee's records */
      //ME.updateEmployee(empID1, 5000);

      /* Delete an employee from the database */
      //ME.deleteEmployee(empID2);

      /* List down new list of the employees */
      ME.listMember();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addMember(String fullName, String address, Salutation salutation, Set<Movie> movies){
      
      

      Session session = factory.openSession();
      Transaction tx = null;
      Integer member_id = null;
      
      try {
         tx = session.beginTransaction();
         Member member = new Member(fullName, address, salutation, (List<Movie>) movies);
         member_id = (Integer) session.save(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return member_id;
   }
   
   /* Method to  READ all the employees */
   public void listMember( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      

      try {
         tx = session.beginTransaction();
         List members = session.createQuery("FROM member").list(); 
         for (Iterator iterator = members.iterator(); iterator.hasNext();){
            Member member = (Member) iterator.next();
            System.out.println("ID: "+member.getId()); 
            System.out.print("Full Name: " + member.getFullName()); 
            System.out.print("Physical Address: " + member.getAddress()); 
            System.out.println("Salutation ID: " + member.getSalutation()); 
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
   public void updateMember(Integer member_id, String fullName, String address, Salutation salutation, Set<Movie> movies ){
      Session session = factory.openSession();
      Transaction tx = null;
      

      try {
         tx = session.beginTransaction();
         Member member = (Member)session.get(Member.class, member_id); 
         member.setFullName( fullName );
         member.setAddress(address);
         member.setSalutation(salutation);
         member.setMovies((List<Movie>) movies);
		 session.update(member); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an employee from the records */
   public void deleteMember(Integer member_id){
      Session session = factory.openSession();
      Transaction tx = null;
      
      

      try {
         tx = session.beginTransaction();
         Member member = (Member)session.get(Member.class, member_id); 
         session.delete(member); 
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