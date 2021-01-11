
package namudarbaimasyvas;

public class NamuDarbaiMasyvas {

    public static void main(String[] args) {
        //pirmoji uzduotis
        int[]masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        int didejantis = 0;
        int mazejantis = 0;
        //uzduoties duomenys
        for(int i =0; i < masyvas.length; i++){
        System.out.print(masyvas[i] + " ");
        }
        //nuo maziausio iki didziausio
        for(int i = 0; i < masyvas.length; i++) {
            for(int j = i+1; j < masyvas.length; j++) {
                if(masyvas[i] > masyvas[j]) {
                    didejantis = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = didejantis;
                }
            }
        }
        System.out.println(" ");
        for (int i =0; i < masyvas.length; i++) {
            System.out.print(masyvas[i]+" ");
        }
        //nuo didziausio iki maziausio
        for(int i = 0; i < masyvas.length; i++) {
            for(int j = i+1; j < masyvas.length; j++) {
                if(masyvas[i] < masyvas[j]) {
                    mazejantis = masyvas[i];
                    masyvas[i] = masyvas[j];
                    masyvas[j] = mazejantis;

                }
            }
        }
        System.out.println(" ");
        for (int i =0; i < masyvas.length; i++) {
            System.out.print(masyvas[i]+" ");
        }
        System.out.println(" ");
        //antroji uzduotis
        
        int[] m = {1, 2, 3, 4, 5};
        
        
        int[][] rez = new int [m.length][m.length];
        
        for (int i =0; i < rez.length; i++) {
            int [] eilute = rez[i];
            for (int j =0; j < eilute.length; j++) {
                int elementas = eilute[j];
                System.out.print(elementas + " ");
            }
            System.out.println();
        }
//        int [][] mr1 = {
//            {1,2,3,4,5},
//            {2,3,4,5,1},
//            {3,4,5,1,2},
//            {4,5,1,2,3},
//            {5,1,2,3,4}
//        };
//        int [][] mr2 = {
//            {1,2,3,4,5},
//            {5,1,2,3,4},
//            {4,5,1,2,3},
//            {3,4,5,1,2},
//            {2,3,4,5,1}
//        };
    }
    
}
