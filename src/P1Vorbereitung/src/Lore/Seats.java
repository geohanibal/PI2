package P1Vorbereitung.src.Lore;

public class Seats {
    public String [][] seats = new String[5][5];

     private void  freiZeigen(){
        for (int i = 0; i < seats.length ; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = "frei";
            }
        }
    }

    public static void main(String[] args) {
         Seats s = new Seats();
         s.freiZeigen();

        for (int i = 0; i < s.seats.length; i++) {
            for (int j = 0; j < s.seats[i].length; j++) {
                System.out.print("  ["+ i +"]" +"["+ j + "] "+s.seats[i][j]);
            }
            System.out.println("");

        }

    }
}
