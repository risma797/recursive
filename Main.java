import recursive.Fibonaci;
import recursive.Name;
import recursive.Rank;
import recursive.Row;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // rank
        System.out.println("----- Perpangkatan 3^14 -----");
        Integer rankResult = Rank.makeRank(3, 0, 0, 14);
        System.out.println(rankResult);

        // fibonaci
        System.out.println("----- Fibonaci -----");
        ArrayList<Integer> fibonaciResults = Fibonaci.makeFibonaci(0,0, 0, 20, new ArrayList<>());
        System.out.println(fibonaciResults);

        // rows
        System.out.println("----- Deret -----");
        ArrayList<Integer> rowResults = Row.makeRows(2, 1, 0, 50, new ArrayList<>());
        System.out.println(rowResults);

        System.out.println("----- Nama 100x -----");
        ArrayList<String> nameResults = Name.generateName("Risma Nurhayati GUstiani", 0, 100, new ArrayList<>());
        System.out.println(nameResults);

    }
}