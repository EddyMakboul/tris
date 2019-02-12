package tris;

public class Bubble {


    Bubble(int size, int max) {

        Sequence sequence1 = new Sequence(size,max);

        for(int i = size-1 ; i>=1 ; i--)
            for(int j = 1; j<=i ; j++)
            {
                if(sequence1.getSuite().get(j-1) > sequence1.getSuite().get(j))
                {
                    int swap = sequence1.getSuite().get(j);
                    sequence1.getSuite().set(j,sequence1.getSuite().get(j-1));
                    sequence1.getSuite().set(j-1,swap);
                }
            }
            System.out.print(sequence1.getSuite().toString());

    }

}
