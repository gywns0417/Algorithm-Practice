package search;

public class GenericClassTester {
    static class GenericClass<T> {

        private T xyz;
        GenericClass(T t){
            this.xyz = t;
        }
        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        String k = "킹";
        GenericClass<String> a = new GenericClass<String>(k);
        System.out.println(a.getXyz());

        int i = 12345;
        GenericClass<Integer> b = new GenericClass<Integer>(i);
        System.out.println(b.getXyz());

        GenericClass<Integer> c = new GenericClass<>(i);
        System.out.println(c.getXyz());
    }
}
