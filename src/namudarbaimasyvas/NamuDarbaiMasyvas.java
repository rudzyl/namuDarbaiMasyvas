
package namudarbaimasyvas;

public class NamuDarbaiMasyvas {

    public static void main(String[] args) {
        //pirmoji uzduotis
        int[]masyvas = {15, 42, 15, 98, -2, -47, 10, 3, -14, 36};
        int didejantis;
        int mazejantis;
        //uzduoties duomenys
        for(int i =0; i < masyvas.length; i++){ 
        System.out.print(masyvas[i] + " ");
        }
        //nuo maziausio iki didziausio
        for(int i = 0; i < masyvas.length - 1; i++) { //tikrinama ar i yra maziau uz ciklo length
            for(int j = i+1; j < masyvas.length; j++) { //ciklas cikle j igauna reiksme i+1
                if(masyvas[i] > masyvas[j]) { //pradedama tikrinti taip- i=0 j=1,paimami skaiciai is masyvo i=15 j=42
                    didejantis = masyvas[i]; //gaunasi pirmu vaarijantu false, vygdom pries tai veiksma, j++ 
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
        for(int i = 0; i < masyvas.length - 1; i++) {
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
        
        int[][] rez = new int [m.length][m.length]; //is pradziu jis yra tuscias rezultatinis masyvas uzpildytas 0
        //00000
        //00000
        //00000
        //00000
        //00000
        for(int i=0; i<m.length;i++) {
            for(int j = 0;j < m.length; j++){
//               rez[i][j]=m[(i + j) % m.length]; //i viena puse
               rez[i][(i + j) % m.length]=m[j]; //i kita puse
            }
        }
        for(int i=0; i < rez.length; i++){
            int[] eilute = rez[i];
            for(int j=0; j < eilute.length; j++) {
                int elementas = eilute[j];
                System.out.print(elementas +" ");
            }
            System.out.println();
            } 
        }
    }
    
