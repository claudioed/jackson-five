package domain;

import lombok.Data;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
@Data
public class Door {
    
    private String size;

    Door(){}
    
    public Door(String size){
        this.size = size;
    }
    
}
