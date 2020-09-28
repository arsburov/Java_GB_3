import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ItemMove move = new ItemMove();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        move.itemMove(people);
        System.out.println(Arrays.toString(people));
    }
}
