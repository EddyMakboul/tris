package tris;
import java.util.ArrayList;

public class TrisParTas {

    private Sequence sequence1 = new Sequence(10, 100);

    public static void permute(ArrayList<Integer> listeswap, int i, int j)
    {
        int swap = listeswap.get(i) ;
        listeswap.set(i,listeswap.get(j));
        listeswap.set(j,swap);
    }

    private static void Tamis(ArrayList<Integer> arbre,int noeud,int n)
    {
        int a = noeud;
        int j = 2*a;

        while(j<=n)
        {
            if((j <= n)&&(arbre.get(j) < arbre.get(j+1)))
            {
                j++;
            }
            if(arbre.get(a) < arbre.get(j))
            {
                permute(arbre,a,j);
                a=j;
                j=2*a;
            }
            else
                break;
        }
    }

    public static void triParTas(ArrayList<Integer> arbre)
    {
        for (int i = arbre.size() >> 1; i >= 0; i--) {
            Tamis(arbre, i, arbre.size() - 1);
            System.out.println("1"+arbre);
        }


        for (int i = arbre.size() - 1; i >= 1; i--)
        {
            permute(arbre,i,0);
            Tamis(arbre, 0, i - 1);
            System.out.println("2"+arbre);
        }
    }

    public static void main(String[] args) {

        TrisParTas tris1 = new TrisParTas();
        int length = tris1.sequence1.getSuite().size();
        tris1.triParTas(tris1.sequence1.getSuite());
        System.out.println(tris1.sequence1.getSuite());


    }

}
