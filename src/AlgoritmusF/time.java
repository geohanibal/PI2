package AlgoritmusF;

import java.sql.Time;

public class time {



    String [] days={"montag","d","m","f","s","Sontag"};
    public static String friDay( int day, int month, int year){

        String tag = days(day);
       return tag;

    }
     private  String getDay(int day){


        return days[day % 7];
    }


    public static void main(String[] args) {
        System.out.println(localT);
    }
}
