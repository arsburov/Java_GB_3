import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        ItemMove move = new ItemMove();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
//        move.itemMove(people);
        Swap.swap(people, 1, 3);
        System.out.println(Arrays.toString(people));
        Swap.swap(people, 10, 3);
        System.out.println(Arrays.toString(people));
    }
}
