public class ItemMove {
    public <T> void itemMove (T[] array){
        T a = array[0];
        array[0] = array[1];
        array[1] = a;
    }
}
