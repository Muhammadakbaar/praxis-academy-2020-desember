package kasus;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "movie")
public class Movie {

   @Id
   private int movie_id;
   private String title;
   @ManyToMany(mappedBy = "movies")
   private List<Member> members = new ArrayList<>();
   

   public Movie() {}
   public Movie(String title) {
      this.title = title;
   }
   
   public int getId() {
      return movie_id;
   }

   public void setId( int movie_id ) {
      this.movie_id = movie_id;
   }
   
   public String getTitle() {
      return title;
   }
   
   public void setTitle( String title ) {
      this.title = title;
   }
   
   @ManyToMany(cascade=CascadeType.ALL)  
   @JoinTable(name="member_movie", joinColumns=@JoinColumn(name="movie_id"), 
   inverseJoinColumns=@JoinColumn(name="member_id"))  
   public List<Member> getMembers()  
   {  
      return members;  
   }  
   public void setMembers(List<Member> members)  
   {  
      this.members = members;  
   }  
   
   
 }