package tris;

import java.util.ArrayList;

public class Quicksort {

    private Sequence sequence1 = new Sequence(10, 100);

    public static void permute(ArrayList<Integer> listeswap, int i, int j)
    {
        int swap = listeswap.get(i) ;
        listeswap.set(i,listeswap.get(j));
        listeswap.set(j,swap);
    }


    public void quicksort(ArrayList<Integer> liste,int start,int end)
    {
        if(start < end)
        {
            int pivot = partitionner(liste,start,end);
            quicksort(liste,start,pivot-1);
            quicksort(liste,pivot+1,end);
        }
    }

    public int partitionner(ArrayList<Integer> liste2,int start,int end)
    {
        int pstart = start;
        int pend = end+1;
        int i=start;
        int vpivot=liste2.get(start);

        while(i<pend)
        {
            if(liste2.get(i) == vpivot)
            {
                i++;
            }

            else if(liste2.get(i) > vpivot)
            {
                permute(liste2,pend-1,i);
                System.out.println("i>pivot"+liste2+" i="+i+" pstart"+pstart+" pend"+pend);
                pend--;
            }


            else if(liste2.get(i) < vpivot)
            {
                    permute(liste2,pstart,i);

                System.out.println("i<pivot"+liste2+" i="+i+" pstart"+pstart+" pend"+pend);
                    pstart++;
                    i++;
            }
        }
        System.out.println("pivot:"+vpivot);
        return pstart;
    }

    public static void main(String[] args) {

        Quicksort newquick = new Quicksort();
        int length = newquick.sequence1.getSuite().size();
        newquick.quicksort(newquick.sequence1.getSuite(),0,length-1);
        System.out.println(newquick.sequence1.getSuite());


    }
}
