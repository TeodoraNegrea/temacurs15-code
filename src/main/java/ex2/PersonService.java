package ex2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(Collection<Person> person){
        if(person!=null){
            this.persons.addAll(person);
        }
    }

    public List<Person> getAllPersons() {
        List<Person> result = new ArrayList<>();
        for(Person person : persons){
            result.add(person.person());
        }
        return result;
    }

    public List<String> getAllPersonNames() {
        List<String> result = new ArrayList<>();
        for(Person person : persons){
            result.add(person.getName());
        }
        return result;
    }
    public List<Person> getPersonsOlderThan(int age){
        List<Person> result = new ArrayList<>();
        for(Person person : persons){
            result.get(person.getAge());
        }
        return result;
    }
}
