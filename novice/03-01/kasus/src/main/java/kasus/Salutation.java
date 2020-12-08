package kasus;

import java.util.ArrayList;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "salutation")
public class Salutation {
   
   @Id
   private int salutation_id;
   private String salutation;   
   @OneToMany(mappedBy = "salutation", cascade = CascadeType.ALL)
	private List<Member> members = new ArrayList<>(); 

   
   public Salutation() {}
   public Salutation(String salutation) {
      this.salutation = salutation;
   }
   
   public int getId() {
      return salutation_id;
   }
   
   public void setId( int salutation_id ) {
      this.salutation_id = salutation_id;
   }
   
   public String getSalutation() {
      return salutation;
   }
   
   public void setSalutation( String salutation ) {
      this.salutation = salutation;
   }
   
   public List<Member> getMembers() {
      return members;
   }

   public void setMembers(List<Member> members) {
      this.members = members;
   }

 }