import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonDemo {

    public static void main(String[] args) throws JsonProcessingException {
        Foo f = new Foo(1, "First");
        ObjectMapper mapper = new ObjectMapper();

        String jsonStr = mapper.writeValueAsString(f);
        System.out.println("jsonStr: " + jsonStr);
        Foo result = mapper.readValue(jsonStr, Foo.class);
        System.out.println("result: " + result);

    }

    public static void whenSerializeAndDeserializeUsingJackson_thenCorrect()
            throws IOException {
        Foo foo = new Foo(1,"first");
        ObjectMapper mapper = new ObjectMapper();

        String jsonStr = mapper.writeValueAsString(foo);
        Foo result = mapper.readValue(jsonStr, Foo.class);
        assertEquals(foo.getId(),result.getId());
    }
}
