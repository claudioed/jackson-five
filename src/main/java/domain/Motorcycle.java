package domain;

import lombok.Data;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
@Data
public class Motorcycle extends MyObject<Tire> {
    
    Motorcycle(){}
    
    public Motorcycle(String identity,Tire tire){
        this.identity = identity;
        this.property = tire;
    }
    
}
