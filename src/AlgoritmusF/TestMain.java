package AlgoritmusF;

public class TestMain{

    public static void main(String[] args) {
        Alg1 alg = new Alg1();
        int [] numbers = {6,11,5,4,3,2,1};
        alg.sort(numbers);

        System.out.println("Rekusiv - n! ist :  " + alg.alg_rekusiv(6));

        System.out.println("Iterativ - n! ist : " + alg.alg_Iterativ(6));

        System.out.println("Min Wert ist : " + alg.min(numbers) );

    }

}
