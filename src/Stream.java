import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import model.Person;
import model.Product;


public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(1, "Leo Messi", LocalDate.of(1991, 1, 21));
        Person p2 = new Person(2, "Carlos Tevez", LocalDate.of(1990, 2, 21));
        Person p3 = new Person(3, "Juan Roman Riquelme", LocalDate.of(1980, 6, 23));
        Person p4 = new Person(4, "Emanuel ginobili", LocalDate.of(2019, 5, 15));
        Person p5 = new Person(5, "Martin Palermo", LocalDate.of(2010, 1, 4));

        Product pr1 = new Product(1, "Quilmes", 150.0);
        Product pr2 = new Product(2, "Miller", 250.50);
        Product pr3 = new Product(3, "Heineken", 350.0);
        Product pr4 = new Product(4, "Budweiser", 250.0);

        List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
        List<Product> products = Arrays.asList(pr1, pr2, pr3, pr4);
        
       /* for(int i = 0; i<persons.size(); i++){
            System.out.println(persons.get(i));
        }*/
        
        persons.forEach(x -> System.out.println(x));
	}

}
