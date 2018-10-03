public class ArrayExample {
    public static void main(String[] args) {
        int[] i = new int[5];
        Object[] obj = new Object[5];
        int[] j = new int[3];
        j[0] = 2;
        j[2] = 1;
        j[1] = 3;
        for (int k = 0; k < j.length; k++) {
            System.out.println(j[k]);
        }
        int[][] f = new int[3][];
        int[] k = new int[5];
        f[0] = k;
        for (int l = 0; l < f[0].length; l++) {
            System.out.println(f[0][l]);
        }

        int[] m = new int[]{234, 234, 562};
        for (int l = 0; l < m.length; l++) {
            System.out.println(m[l]);
        }
        method(new int[]{1,2,3,4});
        int[] h={1,2,3,45};
        for (int l = 0; l < h.length; l++) {
            System.out.println(h[l]);

        }
    }

    static void method(int[] j) {
        for (int i = 0; i < j.length; i++) {
            System.out.println(j[i]);

        }
    }
}

