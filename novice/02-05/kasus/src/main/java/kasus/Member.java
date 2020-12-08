package kasus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;

@Entity
@Table(name = "member")
public class Member {

   @Id
   private int member_id;
   private String fullName; 
   private String address;   
   @ManyToOne(targetEntity=kasus.Salutation.class,cascade=CascadeType.ALL)
   @JoinColumn(name="salutation_id",referencedColumnName="salutation_id")
   private Salutation salutation;  
   @ManyToMany
   @JoinTable(name = "member_movie",joinColumns = @JoinColumn(name = "member_id"), inverseJoinColumns = @JoinColumn(name = "movie_id"))
   private List<Movie> movies = new ArrayList<>();
   

   public Member() {}
   public Member(String fullName, String address, Salutation salutation, List<Movie> movies) {
      this.fullName = fullName;
      this.address = address;
      this.salutation = salutation;
      this.movies = movies;
   }


   
   public int getId() {
      return member_id;
   }
   
   public void setId( int member_id ) {
      this.member_id = member_id;
   }
   
   public String getFullName() {
      return fullName;
   }
   
   public void setFullName( String fullName ) {
      this.fullName = fullName;
   }
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress( String address ) {
      this.address = address;
   }
   
   public Salutation getSalutation() {
      return salutation;
   }
   
   public void setSalutation( Salutation salutation ) {
      this.salutation = salutation;
   }
  
   public List<Movie> getMovies()  
   {  
      return movies;  
   }  
   public void setMovies(List<Movie> movies)  
   {  
      this.movies = movies;  
   }  

 }