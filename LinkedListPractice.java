import java.util.LinkedList;

public class LinkedListPractice {
    public static void main(String[] args){

        LinkedList<Integer> numbers=new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);

        numbers.addFirst(5);
        System.out.println(numbers);

        numbers.addLast(50);
        System.out.println(numbers);

        numbers.removeFirst();
        System.out.println(numbers);
    }
}