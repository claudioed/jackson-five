package domain;

import lombok.Data;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
@Data
public abstract class MyObject<T> {
    
    protected String identity;
    
    protected T property;

}
