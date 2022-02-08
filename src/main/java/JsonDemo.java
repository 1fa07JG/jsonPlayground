import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class JsonDemo {

    public static void main(String[] args) {

        
        try {
            whenSerializeAndDeserializeUsingJackson_thenCorrect();
        } catch (IOException e) {
            e.printStackTrace();
        }
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
