package Z1;

public class ArrayUtil {
    public static <T extends Comparable<T>> boolean jestPalindromem(T[] list) {
//        if(Collections.reverseOrder(Arrays.stream(list).toArray()) == Arrays.stream(list).toArray()){
//            return true;
//        }
//        return false;
        for(int i = 0; i < list.length; i++){
            if(list[i].compareTo(list[list.length - 1 - i]) != 0){
                return false;
            }
        }
        return true;
    }
}
