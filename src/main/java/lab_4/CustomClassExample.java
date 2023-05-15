package lab_4;

public class CustomClassExample {
    public static void main(String[] args) {
        CustomClass obj = new CustomClass();

        // print the name of the superclass
        System.out.println("Superclass: " + obj.getClass().getSuperclass().getName());

        // print the names of all the interfaces implemented by the class
        Class[] interfaces = obj.getClass().getInterfaces();
        System.out.println("Interfaces:");
        for (Class i : interfaces) {
            System.out.println(i.getName());
        }
    }
}
