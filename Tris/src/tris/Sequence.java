package tris;
import java.util.ArrayList;


 class Sequence {

    private ArrayList<Integer> suite;

    Sequence(int size, int max){

        suite= new ArrayList<>(size);

        for(int i=0; i<size;i++)
        {
            suite.add((int)(Math.random()*max));
        }
        System.out.println(suite);

    }

     ArrayList<Integer> getSuite(){return suite;}

     public void permute(int i,int j)
     {
         int swap = this.suite.get(i) ;
         this.suite.set(i,this.suite.get(j));
         this.suite.set(j,swap);
     }

}
