package lab_3;
import java.util.*;
public class lab_3 {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size and the elements of both arrays
        System.out.print("Enter the size of the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of the first array: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of the second array: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Find the intersection of the two arrays
        Set<Integer> set1 = new HashSet<>();
        for (int i : arr1) {
            set1.add(i);
        }
        List<Integer> intersection = new ArrayList<>();
        for (int i : arr2) {
            if (set1.contains(i)) {
                intersection.add(i);
            }
        }

        // Create a LinkedList using the intersection ArrayList
        LinkedList<Integer> linkedList = new LinkedList<>(intersection);

        // Perform the requested operations on the LinkedList
        linkedList.addFirst(100);
        linkedList.addLast(200);
        linkedList.removeFirst();
        linkedList.removeLast();

        // Print the elements of the LinkedList in reverse order
        Iterator<Integer> itr = linkedList.descendingIterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // Catch a ClassCastException
        try {
            LinkedList<String> stringList = (LinkedList<String>) (LinkedList) intersection;
        } catch (ClassCastException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("This exception occurred because we attempted to cast a LinkedList of integers to a LinkedList of Strings. This is not allowed in Java as it violates type safety.");
        }
    }







}
