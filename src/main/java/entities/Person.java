package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by: Denis Timofeev
 * Date: 23.06.2018
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    private String name;
    private String address;
    private Integer age;

}
