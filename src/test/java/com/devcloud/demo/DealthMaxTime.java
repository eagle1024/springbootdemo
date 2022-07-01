import java.util.List;

public class DealthMaxTime {
    class Pair {
        int i;
        int j;
        int k;
    }

    public int dealthMaxTime(List<Pair> list) {
        int[] count = new int[101];
        int max = 0;
        int len = 0;
        int min = 0;
        for (int i = 0; i < count.length; i++) {
            int iSum = 0;
            for (Pair pair : list) {
                if (pair.j > 0) {
                    if (i >= pair.j) iSum++;
                    return 0;
                } else {
                    if (i <= pair.j) iSum++;
                }
            }
            max = Math.max(max, iSum);
        }
        return max;
    }
}
