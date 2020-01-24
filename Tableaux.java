/**
 * @author France Beaudoin
 */
public class Tableaux {
    private static void permute(int[] tab, int i1, int i2){
        int transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    private static void permute(String[] tab, int i1, int i2){
        String transit = tab[i1];
        tab[i1] = tab[i2];
        tab[i2] = transit;
    }

    public static void trierCroissantSSS(int[] tab){
        int imin;
        for (int i = 0; i < tab.length - 1; i++){
            imin = i;
            for (int  j= i + 1; j < tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierCroissantSSS(String[] tab){
        int imin;
        for (int i = 0; i < tab.length - 1; i++){
            imin = i;
            for (int j = i + 1; j < tab.length; j++){
                if (Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin]))
                    imin = j;
            }
            if (imin != i)
                permute(tab, i, imin);
        }
    }

    public static void trierDecroissantSSS(int[] tab){
        int imin;
        for(int i = 0; i < tab.length - 1; i++){
            imin = i;
            for(int j = i + 1; j < tab.length; j++ ){
                if(tab[j] > tab[imin]){
                    imin = j;
                }
            }
            if(imin != i){
                permute(tab, i, imin);
            }
        }
    }

    public static void trierDecroissantSSS(String[] tab){
        int imin;
        for(int i = 0; i < tab.length - 1; i++){
            imin = i;
            for(int j = i + 1; j < tab.length; j++ ){
                if(Integer.parseInt(tab[j]) > Integer.parseInt(tab[imin])){
                    imin = j;
                }
            }
            if(imin != i){
                permute(tab, i, imin);
            }
        }
    }

    public static void print(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }

    public static void print(String[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }

    public static int maximum (int[] tab){
        int imin;
        for(int i = 0; i < tab.length - 1; i++){
            imin = i;
            for(int j = i + 1; j < tab.length; j++){
                if(tab[j] < tab[imin]){
                    imin = j;
                }
            }
            if(imin != i){
                permute(tab, i, imin);
            }
        }
        return tab[tab.length - 1];
    }

    public static int maximum (String[] tab){
        int imin;
        for(int i = 0; i < tab.length - 1; i++){
            imin = i;
            for(int j = i + 1; j < tab.length; j++){
                if(Integer.parseInt(tab[j]) < Integer.parseInt(tab[imin])){
                    imin = j;
                }
            }
            if(imin != i){
                permute(tab, i, imin);
            }
        }
        return Integer.parseInt(tab[tab.length - 1]);
    }

    public static int minimum (int[] tab){
        trierDecroissantSSS(tab);
        return tab[tab.length - 1];
    }

    public static int minimum (String[] tab){
        trierDecroissantSSS(tab);
        return Integer.parseInt(tab[tab.length - 1]);
    }

    public static double moyenne (int[] tab){
        int somme = 0;
        for(int i = 0; i < tab.length; i++){
            somme += tab[i];
        }
        return somme / tab.length;
    }

    public static double moyenne (String[] tab){
        int somme = 0;
        for(int i = 0; i < tab.length; i++){
            somme += Integer.parseInt(tab[i]);
        }
        return somme / tab.length;
    }

    public static int fouilleSeq (int[] tab, int cherche){
        boolean trouve = false;
        int i = 0;
        while(i < tab.length && !trouve){
            if(tab[i] == cherche)
                trouve = true;
            else
                i++;
        }
        if(trouve)
            return i;
        else
            return -1;
    }

    public static int fouilleSeq (String[] tab, String cherche){
        boolean trouve = false;
        int i = 0;
        while(i < tab.length && !trouve){
            if(tab[i].equals(cherche))
                trouve = true;
            else
                i++;
        }
        if(trouve)
            return i;
        else
            return -1;
    }
}
/**
 _   _  ____  _____  ______
 | \ | |/ __ \|  __ \|  ____|
 |  \| | |  | | |__) | |__
 | . ` | |  | |  ___/|  __|
 | |\  | |__| | |    | |____
 |_| \_|\____/|_|    |______|
 */
