public class tri_fusion {
    public static int[] Tri_Fusion(int[] T) {
        int[] MG, MD;
        if (T.length < 2) {
            return T;
        } else {
            int milieu = T.length / 2;
            MG = new int[milieu];
            System.arraycopy(T, 0, MG, 0, milieu);

            MD = new int[T.length - milieu];
            System.arraycopy(T, milieu, MD, 0, T.length - milieu);

            return Fusion(Tri_Fusion(MG), Tri_Fusion(MD));
        }
    }


    private static int[] Fusion(int[] T1, int[] T2) {
        int[] resultat = new int[T1.length + T2.length];
        int i = 0, j = 0;
        while(i < T1.length && j < T2.length) {
            if (T1[i] < T2[j]) {
               resultat[i + j] = T1[i];
               i++;
            } else {
                resultat[i + j] = T2[j];
                j++;
            }
        }
        if (i < T1.length) {
            while(i < T1.length) {
                resultat[i+j] = T1[i];
                i++;
            }
        } else {
            while (j < T2.length) {
                resultat[i+j] = T2[j];
                j++;
            }
        }
        return resultat;
    };
}
