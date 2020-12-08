package latihan.tujuh;

import java.util.List;
import java.util.ArrayList;

public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria (List<Person> persons) {

        List<Person> femalePersons = new ArrayList<Person>();

        for (Person person:persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")) {
                femalePersons.add(person);
            }
        }

        return femalePersons;
    }
}