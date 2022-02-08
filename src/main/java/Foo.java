import java.util.ArrayList;

public class Foo {
    int id;
    String name;
    ArrayList<String> list;

    public Foo() {
    }

    public Foo(int i, String s) {
        id = i;
        name = s;
    }

    public Foo(int i, String s, ArrayList<String> l) {
        id = i;
        name = s;
        list = l;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", list=" + list +
                '}';
    }
}
