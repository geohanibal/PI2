package de.uni_bremen.pi2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Gela {


    private final int raodenoba;
    private  final Stack<Integer>[] stack1 = new Stack[3];

    public Gela(final int raodenoba){
        assert raodenoba >0;

        this.raodenoba = raodenoba;

        for (int i = 0; i < stack1.length; i++) {
            stack1[i] = new Stack<>();
        }

        for (int i = raodenoba; i >0 ; --i) {
            stack1[2].add(i);
        }
    }

    public void dayaviDaIbatone()
    {
        anzeige();
        dayaviDaIbatone(2,1,raodenoba);

    }
    private void dayaviDaIbatone(final int i, final int j, final int höhe)
    {
        // Um etwas zu verschieben, muss ein Stapel mindestens Höhe 1 haben.
        if(höhe > 0)
        {

         final int t= 3 - i - j;
         dayaviDaIbatone(i, t, höhe -1);
         stack1[j].push(stack1[i].pop());

         anzeige();
         dayaviDaIbatone(t,j,höhe-1);
        }

    }

    public void algoritmi1(){

        anzeige();
    }


    private void anzeige(){
        for ( var s : stack1){
            System.out.println(s);
        }
        System.out.println("___________");
    }

    public static void main(String[] args) {


        Gela gela = new Gela(4);
        gela.dayaviDaIbatone();






    }
}
