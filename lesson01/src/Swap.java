public class Swap {
    public static <T> T[] swap (T[] array, int a, int b) {
//        сначала написал свое исключение, но написал неправильно и при тестировании понял что в любом случае при подаче
//        неверных значений a или b программа свалится с исключением, но все же написал свое правильно и закомментил :)
//        if (a >= array.length || b >= array.length || a <= 0 || b <= 0) {
//            throw new RuntimeException("SWW");
//        }
        T x = array[a];
        array[a] = array[b];
        array[b] = x;
        return array;
    }
}
