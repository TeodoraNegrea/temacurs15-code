package ex2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonServiceTest {
    @Test
    @DisplayName("WHEN person's name is null THEN return null")
    void testNameIsNUll(){
        //SETUP
        Person person = new Person(1, "", 25);
        //RUN
        String actual = person.getName();
        //ASSERT
        assertThat(actual).isEqualTo(person.getName());
    }
    @Test
    @DisplayName("WHEN the age is wrong THEN return invalid age")
    void testAge(){
        //SETUP
        Person person = new Person(1,"Mihai", 0);
        //RUN
        int actual = person.getAge();
        //ASSERT
        assertThat(actual).isZero();
    }
    @Test
    @DisplayName("WHEN the id is negative THEN return bad id")
    void testId(){
        //SETUP
        Person person = new Person(-2,"Alexandru",25);
        //RUN
        int actual = person.getId();
        //ASSERT
        assertThat(actual).isNegative();
    }
    @Test
    @DisplayName("WHEN a null person is given THEN  return empty string")
    void testGetPersons(){
        //SETUP
        PersonService  personService = new PersonService(null);
        //RUN
        List<Person> person = personService.getAllPersons();
        //ASSERT
        assertThat(person).isNotNull();
        assertThat(person).isEmpty();
    }
    @Test
    @DisplayName("WHEN the list of  person is given THEN only the names of the person is returned")
    void testGetAllPersonNames(){
        //SETUP
        PersonService personService = new PersonService(List.of(
                new Person(1,"Mihai",32),
                new Person(2,"Alexandru",31),
                new Person(3,"Ioana",30),
                new Person(4,"Sofia",28)
        ));
        //RUN
        List<String> result = personService.getAllPersonNames();
        //ASSERT
        assertThat(result).isNotNull();
    }
    @Test
    @DisplayName("WHEN the age is older than 120 THEN ")
    void testPersonsOlderThan(){
        //SETUP
        PersonService personService = new PersonService(List.of(
                new Person(1,"Mihai",32),
                new Person(2,"Alexandru",31),
                new Person(3,"Ioana",123),
                new Person(4,"Sofia",28)
        ));
        //RUN
        List<Person> result = personService.getPersonsOlderThan(120);
        //ASSERT

    }
}
