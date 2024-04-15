public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(findMissingInt(new int[] { 3, 0, 1 }));
        System.out.println(secondMaxValue(new int[] { 6, 9, 4, 7, 3, 4 }));
        System.out.println(containsTheSameElements(new int[] { 1, 2, 1, 1, 2 }, new int[] { 2, 1 }));
        System.out.println(containsTheSameElements(new int[] { 2, 2, 3, 7, 8, 3, 2 }, new int[] { 8, 2, 7, 7, 3 }));
        System.out.println(containsTheSameElements(new int[] { 3, -4, 1, 2, 5 }, new int[] { 1, 3, -4, 5 }));
        System.out.println(isExist(new int[] { 1, 2, 3 }, 0));
        System.out.println(isSorted(new int[] { 7, 5, 4, 3, -12 }));
        System.out.println(isSorted(new int[] { 1, -2, 3 }));
        System.out.println(isSorted(new int[] { 1, 1, 500 }));

    }

    public static int findMissingInt(int[] array) {
        int n = array.length;
        boolean[] temp = new boolean[n + 1];
        int i = 0;
        int miss = 0;
        while (i < n) {
            temp[array[i]] = true;
            i++;
        }
        i = 0;
        while (i <= n) {
            if (temp[i] == false) {
                miss = i;
            }
            i++;
        }
        return miss;
    }

    public static int secondMaxValue(int[] array) {
        int n = array.length;
        int max = array[0];
        int i = 0;
        int rep = 0;
        while (i < n) {
            if (array[i] >= max) {
                max = array[i];
            }
            i++;
        }
        i = 0;
        while (i < n) {
            if (array[i] == max) {
                rep++;
            }
            i++;
        }
        i = 0;
        int temp[] = new int[n - rep];
        while (i < n - rep) {
            if (array[i] != max) {
                temp[i] = array[i];
            }
            i++;
        }
        i = 0;
        int sec = temp[i];
        while (i < n - rep) {
            if (temp[i] >= sec) {
                sec = temp[i];
            }
            i++;
        }

        return sec;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        boolean ans = true;
        for (int i = 0; i < array1.length; i++) {
            if (!isExist(array2, array1[i])) {
                ans = false;
            }
        }
        return ans;
    }

    public static boolean isSorted(int[] array) {
        int up = 1;
        int down = 1;
        boolean ans = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                up++;
            }
            if (array[i] <= array[i - 1]) {
                down++;
            }
        }
        if (down == array.length || up == array.length) {
            ans = true;

        }
        return ans;
    }

    public static boolean isExist(int[] array, int x) {
        int n = array.length;
        boolean exist = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                exist = true;
            }
        }
        return exist;
    }

}
