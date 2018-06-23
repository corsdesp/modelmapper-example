package mapper;

import entities.Customer;
import entities.Person;
import org.modelmapper.PropertyMap;

/**
 * Created by: Denis Timofeev
 * Date: 23.06.2018
 */
public class CustomerPersonPropertyMap extends PropertyMap<Customer, Person> {
    @Override
    protected void configure() {
        map().setAddress(source.getDeliveryPoint());
        map().setName(source.getCustomer());
    }
}
