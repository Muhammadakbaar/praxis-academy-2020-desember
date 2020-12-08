package kasus;

import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManageMovie {
   private static SessionFactory factory; 
   public static void main(String[] args) {
      
      
      
      ManageMovie ME = new ManageMovie();

      ME.sessionFactory();
      /* Add few employee records in database */
      //Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
      //Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      //Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      /* List down all the employees */
      ME.listMovie();

      /* Update employee's records */
      //ME.updateEmployee(empID1, 5000);

      /* Delete an employee from the database */
      //ME.deleteEmployee(empID2);

      /* List down new list of the employees */
      ME.listMovie();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addMovie(String title){
      
      Session session = factory.openSession();
      Transaction tx = null;
      Integer movie_id = null;
      
      try {
         tx = session.beginTransaction();
         Movie movie = new Movie(title);
         movie_id = (Integer) session.save(movie); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return movie_id;
   }
   
   /* Method to  READ all the employees */
   public void listMovie( ){
      Session session = factory.openSession();
      Transaction tx = null;
      
      

      try {
         tx = session.beginTransaction();
         List movies = session.createQuery("FROM movie").list(); 
         for (Iterator iterator = movies.iterator(); iterator.hasNext();){
            Movie movie = (Movie) iterator.next();
            System.out.println("ID: "+movie.getId()); 
            System.out.print("Title:" + movie.getTitle()); 
            
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
   public void updateMovie(Integer movie_id, String title ){
      Session session = factory.openSession();
      Transaction tx = null;
      

      try {
         tx = session.beginTransaction();
         Movie movie = (Movie)session.get(Movie.class, movie_id); 
         movie.setTitle( title );
		 session.update(movie); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an employee from the records */
   public void deleteMovie(Integer movie_id){
      Session session = factory.openSession();
      Transaction tx = null;
      
      

      try {
         tx = session.beginTransaction();
         Movie movie = (Movie)session.get(Movie.class, movie_id); 
         session.delete(movie); 
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
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
   }
}