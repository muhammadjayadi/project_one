/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSI-PC
 */
public class mainclass {

    public static void main(String[] args) {
        String data[][] = {
            {"G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "HASIL"},
            {"YA", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "YA", "YA", "YA", "TIDAK", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "TIDAK", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "TIDAK", "POSITIF"},
            {"TIDAK", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "YA", "YA", "YA", "YA", "YA", "YA", "TIDAK", "YA", "POSITIF"},
            {"YA", "YA", "YA", "YA", "YA", "YA", "TIDAK", "YA", "YA", "POSITIF"},
            {"TIDAK", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "TIDAK", "POSITIF"},
            {"YA", "YA", "YA", "YA", "YA", "TIDAK", "TIDAK", "YA", "YA", "POSITIF"},
            {"YA", "TIDAK", "YA", "YA", "TIDAK", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "YA", "YA", "YA", "YA", "TIDAK", "YA", "YA", "TIDAK", "POSITIF"},
            {"YA", "YA", "YA", "YA", "TIDAK", "YA", "TIDAK", "YA", "YA", "POSITIF"},
            {"YA", "TIDAK", "YA", "YA", "YA", "YA", "YA", "YA", "TIDAK", "POSITIF"},
            {"YA", "YA", "YA", "TIDAK", "YA", "TIDAK", "YA", "YA", "YA", "POSITIF"},
            {"YA", "TIDAK", "YA", "YA", "YA", "YA", "YA", "TIDAK", "YA", "POSITIF"},
            {"YA", "YA", "TIDAK", "YA", "YA", "TIDAK", "YA", "YA", "YA", "POSITIF"},
            {"YA", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "YA", "YA", "TIDAK", "TIDAK", "YA", "YA", "YA", "YA", "POSITIF"},
            {"TIDAK", "TIDAK", "YA", "YA", "YA", "YA", "YA", "YA", "YA", "POSITIF"},
            {"YA", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "YA", "NEGATIF"},
            {"YA", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "NEGATIF"},
            {"TIDAK", "YA", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "NEGATIF"},
            {"TIDAK", "TIDAK", "YA", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "NEGATIF"},
            {"TIDAK", "TIDAK", "TIDAK", "YA", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "NEGATIF"},
            {"TIDAK", "TIDAK", "TIDAK", "TIDAK", "YA", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "NEGATIF"},
            {"TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "YA", "TIDAK", "TIDAK", "TIDAK", "NEGATIF"},
            {"TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "TIDAK", "YA", "TIDAK", "TIDAK", "NEGATIF"},
        
        };
        
        
        
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length ; j++) {
                System.out.println(data[i][j]+"\t");
            }
            System.out.println();
        }
        
        
        Scanner input = new Scanner(System.in);
        List<bruteforce> list = new ArrayList<>();

        System.out.println("apakah anda pusing y/t:");
        String gejala1 = input.next();
        System.out.println("apakah anda mengigil y/t:");
        String gejala2 = input.next();
        System.out.println("apakah anda mual-mual y/t:");
        String gejala3 = input.next();

        list.add(new bruteforce(gejala1, gejala2, gejala3));

        if (gejala1.equalsIgnoreCase("y") && gejala2.equalsIgnoreCase("t") && gejala3.equalsIgnoreCase("t")) {

//            System.out.println("g1" + "\t|" + "g2" + "\t|g3");
//            System.out.println(gejala1 + "\t" + "|" + gejala2 + "\t|" + gejala3);
//            System.out.println("");
//            System.out.println("penyakit anda adalah    : ?");
        } else if (gejala1.equalsIgnoreCase("y") && gejala2.equalsIgnoreCase("y") && gejala3.equalsIgnoreCase("t")) {
            System.out.println("matisuri");
        } else if (gejala1.equalsIgnoreCase("y") && gejala2.equalsIgnoreCase("y") && gejala3.equalsIgnoreCase("y")) {
            System.out.println("matisuri");
        } else if (gejala1.equalsIgnoreCase("t") && gejala2.equalsIgnoreCase("y") && gejala3.equalsIgnoreCase("y")) {
            System.out.println("matisuri");
        } else if (gejala1.equalsIgnoreCase("t") && gejala2.equalsIgnoreCase("t") && gejala3.equalsIgnoreCase("y")) {
            System.out.println("matisuri");
        } else if (gejala1.equalsIgnoreCase("t") && gejala2.equalsIgnoreCase("t") && gejala3.equalsIgnoreCase("t")) {
            System.out.println("matisuri");
        } else if (gejala1.equalsIgnoreCase("t") && gejala2.equalsIgnoreCase("y") && gejala3.equalsIgnoreCase("t")) {
            System.out.println("matisuri");
        } else if (gejala1.equalsIgnoreCase("y") && gejala2.equalsIgnoreCase("t") && gejala3.equalsIgnoreCase("y")) {
            System.out.println("matisuri");
        }

    }
}
