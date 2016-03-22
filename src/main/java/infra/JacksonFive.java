package infra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
public class JacksonFive {

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String toJson(Object element) {
        try {
            return OBJECT_MAPPER.writeValueAsString(element);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error Object to String");
        }
    }

    public static <T> T toObject(String json, Class<T> clazz) {
        try {
            return OBJECT_MAPPER.readValue(json, clazz);
        } catch (IOException e) {
            throw new RuntimeException("Erro String to Object");
        }
    }

}
