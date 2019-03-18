package webservice.component;

public class Dto {
    private String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "a='" + a + '\'' +
                '}';
    }
}
