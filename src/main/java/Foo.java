public class Foo {
    int id;
    String name;

    public Foo() {
    }

    public Foo(int i, String s) {
        id = i;
        name = s;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }


    public String toString() {
        return "Foo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
