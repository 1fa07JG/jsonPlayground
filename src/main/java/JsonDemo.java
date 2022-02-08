import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class JsonDemo {

    public static void main(String[] args) throws JsonProcessingException {
        ArrayList<String[]> list = new ArrayList<>();
        list.add(new String[]{"Second", "Third", "Fourth"});
        Foo f = new Foo(1, "First", (ArrayList<String>) list);
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
