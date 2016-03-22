package domain;

import lombok.Data;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
@Data
public class Tire {

    Tire(){}
    
    public Tire(String weight){
        this.weight = weight;
    }
    
    private String weight;
    
}
