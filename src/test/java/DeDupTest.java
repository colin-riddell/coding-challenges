import models.Person;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DeDupTest {

    private Person[] dupPeople = new Person[10];

    private Person[] people = new Person[8];
    @Before
    public void before(){
        dupPeople[0] = new Person("Colin","K", new Date(), "colink@nomail.com");
        dupPeople[1] = new Person("Dave","K", new Date(), "dk@col.com");
        dupPeople[2] = new Person("Peter","F", new Date(), "pete86@snomail.com");
        dupPeople[3] = new Person("Sarah","K", new Date(), "sadie@email.com");
        dupPeople[4] = new Person("Sarah","K", new Date(), "sadie@email.com");
        dupPeople[5] = new Person("Louise","R", new Date(), "lou@ecom.com");
        dupPeople[6] = new Person("Anna","H", new Date(), "ah123@gemail.com");
        dupPeople[7] = new Person("Joanne","Riddell", new Date(), "joanne@col.com");
        dupPeople[8] = new Person("Joanne","Riddell", new Date(), "joanne@col.com");
        dupPeople[9] = new Person("Colin","Riddelll", new Date(), "colin@col.com");



        people[0] = new Person("Colin","K", new Date(), "colink@nomail.com");
        people[1] = new Person("Dave","K", new Date(), "dk@col.com");
        people[2] = new Person("Peter","F", new Date(), "pete86@snomail.com");
        people[3] = new Person("Sarah","K", new Date(), "sadie@email.com");
        people[4] = new Person("Louise","R", new Date(), "lou@ecom.com");
        people[5] = new Person("Anna","H", new Date(), "ah123@gemail.com");
        people[6] = new Person("Joanne","Riddell", new Date(), "joanne@col.com");
        people[7] = new Person("Colin","Riddelll", new Date(), "colin@col.com");
    }

    @Test
    public void canDeDupStream(){
        List<Person> deDuped = DeDupArray.deDupStream(dupPeople);
        assertEquals(8, deDuped.size());

    }

    @Test
    public void canDeDupManual(){
        List<Person> deDuped = DeDupArray.deDupManual(dupPeople);
        assertEquals(8, deDuped.size());
    }

    @Test
    public void canDeDupOldManual(){
        Person[] deDuped = DeDupArray.deDupOldManual(dupPeople);
        assertEquals(8, deDuped.length);
    }

    @Test
    public void canDeDupWithSet(){
        Person[] deDuped = DeDupArray.deDupWithSet(dupPeople);
        assertEquals(8, deDuped.length);
    }
}
