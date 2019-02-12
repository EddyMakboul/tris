package tris;
import java.util.ArrayList;
import java.util.LinkedList;

public class Fusion {

    private Sequence sequence1 = new Sequence(10, 100);

    public void triFusion(ArrayList<Integer>list,int start, int end)
    {
        if(start!=end)
        {
            int middle = (start + end)/2;
            triFusion(list,start,middle);
            triFusion(list,middle+1,end);
            fusion(list,start,middle,end);
        }
    }

    public void fusion(ArrayList<Integer> list,int start, int middle, int end)
    {


        LinkedList<Integer>liste =new LinkedList<>();
        liste.addAll(list);
        System.out.println("linkedliste" +liste);
        System.out.println("arrayliste " +list);

        int middle1 = start;
        int middle2 = middle + 1;
        int indice = start;
        while (middle1 <= middle && middle2 <= end)
        {

            if(liste.get(middle1) <= liste.get(middle2))
            {
                list.set(indice,liste.get(middle1));
                middle1++;
            }
            else
            {
                list.set(indice,liste.get(middle2));
                middle2++;
            }
            indice++;
        }
        if (indice <= end)
        {
            while(middle1 <= middle)
            {
                list.set(indice,liste.get(middle1));
                middle1++;
                indice++;
            }
            while(middle2 <= end)
            {
                list.set(indice,liste.get(middle2));
                middle2++;
                indice++;
            }
        }
    }

    public static void main(String[] args) {

        Fusion fus = new Fusion();
        fus.triFusion(fus.sequence1.getSuite(),0,fus.sequence1.getSuite().size()-1);
        System.out.println("ok" + fus.sequence1.getSuite());



    }


}




