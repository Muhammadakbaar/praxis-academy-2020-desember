package latihan.tujuh;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robbert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleFemale = new AndCriteria(single, female);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males : ");
        printPersons(male.meetCriteria(persons));

    }

    public static void printPersons(List<Person> persons){
   
        for (Person person : persons) {
           System.out.println("Person : [ Name : " + person.getName() + ", Gender : " + person.getGender() + ", Marital Status : " + person.getMaritalStatus() + " ]");
        }
    }      
  
}