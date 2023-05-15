package lab_4;

class MyClass implements MyInterface<String> {
    @Override
    public void print(String value) {
        System.out.println(value);
    }
}