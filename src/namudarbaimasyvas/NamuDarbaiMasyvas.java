
package namudarbaimasyvas;

public class NamuDarbaiMasyvas {

    public static void main(String[] args) {
        int[]masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        int didejantis = 0;
        int mazejantis = 0;
        for(int i =0; i < masyvas.length; i++){
        System.out.print(masyvas[i] + " ");
        }
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
    }
    
}
