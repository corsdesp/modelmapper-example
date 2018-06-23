import entities.Customer;
import entities.Person;
import mapper.CustomerPersonPropertyMap;
import org.modelmapper.ModelMapper;

/**
 * Created by: Denis Timofeev
 * Date: 23.06.2018
 */
public class Application {
    public static void main(String[] args) {
        // Create ModelMapper object
        ModelMapper mapper = new ModelMapper();
        // Add custom mapping
        mapper.addMappings(new CustomerPersonPropertyMap());
        // Create Customer object
        Customer customerJohn = new Customer("John", "13 Elm str.", 18);
        // Map Customer object to Person object
        Person personJohn = mapper.map(customerJohn, Person.class);
        // Show mapping result
        System.out.println(personJohn);
    }

}
