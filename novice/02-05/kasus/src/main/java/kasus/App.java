/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package kasus;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import java.util.Set;
import java.util.HashSet;
import java.util.List;


public class App {

    // Create a SessionFactory based on our hibernate.cfg.xml configuration
    // file, which defines how to connect to the database.
    /* private static final SessionFactory sessionFactory =
        new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Member.class)
            .buildSessionFactory();
 */
        // config builder
    private static final Configuration cfg=new Configuration()
            .configure("hibernate.cfg.xml");
            //.addAnnotatedClass(Member.class)
            //.addAnnotatedClass(Salutation.class);	        
        //session factory builder
    private static final SessionFactory factory = cfg.buildSessionFactory();
    
    public static void main(String[] args) {
    
        // open session
        Session session = factory.openSession();
        session.beginTransaction();

        /* Salutation sal = new Salutation();
        sal.setId(1);sal.setSalutation("Mr.");
        Salutation sal2 = new Salutation();
        sal2.setId(2);sal2.setSalutation("Ms.");
        Salutation sal3 = new Salutation();
        sal3.setId(3);sal3.setSalutation("Mrs.");
        Salutation sal4 = new Salutation();
        sal4.setId(4);sal4.setSalutation("Dr.");
        

        Member m1 = new Member();m1.setId(1);m1.setFullName("Janet Jones");m1.setAddress("First Street Plot No 4");m1.setSalutation(sal2);
        Member m2 = new Member();m2.setId(2);m2.setFullName("Robert Phil");m2.setAddress("3rd Street 34");m2.setSalutation(sal);
        Member m3 = new Member();m3.setId(3);m3.setFullName("Robert Phil");m3.setAddress("5th Avenue");m3.setSalutation(sal3);

        Movie movie1 = new Movie();movie1.setId(1);movie1.setTitle("Pirates of the Caribbean");
        Movie movie2 = new Movie();movie2.setId(2);movie2.setTitle("Clash of the Titans");
        Movie movie3 = new Movie();movie3.setId(3);movie3.setTitle("Forgetting Sarah Marshal");
        Movie movie4 = new Movie();movie4.setId(4);movie4.setTitle("Dady's Little Girls");

        
        session.save(sal);session.save(sal2);session.save(sal3);session.save(sal4);
        session.save(m1);session.save(m2);session.save(m3);
        session.save(movie1);session.save(movie2);session.save(movie3);session.save(movie4);
        
        String hql = "from Member as m inner join m.salutation as salut";
        List<?> list = session.createQuery(hql).list();
        
        for(int i=0; i<list.size(); i++) {
			Object[] row = (Object[]) list.get(i);
			Member member = (Member)row[0];
			Salutation salut = (Salutation)row[1];
			
            System.out.println(salut.getSalutation()+" "+member.getFullName()+" rents:");
            System.out.println("1. Pirates of the Caribbean");
            System.out.println("2. Clash of the Titans");
                       
                       
		} */		

        
            /* Salutation sal = new Salutation();
            sal.setId(1);sal.setSalutation("Mr.");
            Salutation sal2 = new Salutation();
            sal2.setId(2);sal2.setSalutation("Ms.");

			Set<Movie> movies = new HashSet<Movie>();
			movies.add(new Movie("Maths"));
			movies.add(new Movie("Computer Science"));

            Member mem1 = new Member();mem1.setId(1);mem1.setFullName("lazuardi");mem1.setAddress("tegal");
            mem1.setSalutation(sal);mem1.setMovies(movies);
			Member mem2 = new Member("Joe", "Batang", sal2, movies);
            session.save(sal);session.save(sal2);
            session.save(movies);
            session.save(mem1);
			session.save(mem2);
 */

        Salutation sal = new Salutation();
        sal.setId(1);sal.setSalutation("Mr. ");
        Salutation sal2 = new Salutation();
        sal2.setId(2);sal2.setSalutation("Ms. ");

        Movie mv = new Movie();
        mv.setId(1);mv.setTitle("Movie 1");
        Movie mv2 = new Movie();
        mv2.setId(2);mv2.setTitle("Purates");
        
        Member mem = new Member();
        mem.setId(1);mem.setFullName("Lazuardi");mem.setAddress("tegak");mem.getMovies().add(mv);
        mem.getMovies().add(mv2);mem.setSalutation(sal);
        Member mem2 = new Member();
        mem2.setId(2);mem2.setFullName("cikutar");mem2.setAddress("fsdfs");mem2.getMovies().add(mv);
        mem2.setSalutation(sal2);

        mv.getMembers().add(mem);mv.getMembers().add(mem2);
        mv.getMembers().add(mem);

        sal.getMembers().add(mem);
        sal.getMembers().add(mem2);

        session.save(mv);session.save(mv2);
        session.save(mem);session.save(mem2);
        session.save(sal);session.save(sal2);


        String hql = "from Member as m inner join m.salutation as salut";
        List<?> list = session.createQuery(hql).list();
        
        for(int i=0; i<list.size(); i++) {
			Object[] row = (Object[]) list.get(i);
			Member member = (Member)row[0];
			Salutation salut = (Salutation)row[1];
         
            //String hql2 = "select mo.title, mo.id "
            String hql3 = "from Member me join me.movies mo "
            +"where me.member_id="+member.getId();
            List<?> list2 = session.createQuery(hql3).list();
            System.out.println(salut.getSalutation()+" "+member.getFullName()+" rents:");
            for (int j = 0; j < list2.size(); j++) {
                Object[] row2 = (Object[]) list2.get(j);
                Member member2 = (Member) row[0];
                Movie movie = member2.getMovies().get(j);
                
                System.out.println(j+1+". "+movie.getTitle());
            }
            
            //System.out.println("1. Pirates of the Caribbean");
            //System.out.println("2. Clash of the Titans");
                       
                       
		}
        

        session.getTransaction().commit();
        session.close();

        

        
    }
}
