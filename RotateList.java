import java.util.*;

public class RotateList {
    public static List<Integer> rotate(List<Integer> list, int positions) {
        int size = list.size();
        positions = positions % size;
        List<Integer> rotated = new ArrayList<>(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));
        return rotated;
    }
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;
        List<Integer> result = rotate(list, rotateBy);
        System.out.println(result);
    }
}

