package domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
@Data
public class Car extends MyObject<Door> {
    
    Car(){}
    
    public Car(String identity,Door door){
        this.identity = identity;
        this.property = door;
    }
    
}
