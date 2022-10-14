package at.ac.fhcampuswien;

import org.w3c.dom.ls.LSInput;

import javax.swing.*;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        double number;
        double largestNumber = 0.00000;
        int i = 1;

        System.out.print("Number "+i+": ");
        largestNumber = scanner.nextDouble();

        if (largestNumber <= 0){
            System.out.println("No number entered.");
        } else {
            do {
                i++;
                System.out.print("Number "+i+": ");
                number = scanner.nextDouble();

                if (number > largestNumber){
                    largestNumber = number;
                }

            } while (number > 0);

            System.out.printf("The largest number is %.2f"+ System.lineSeparator(), largestNumber);
        }

    }

    //todo Task 2
    public void stairs(){
        Scanner scanner = new Scanner(System.in);
        int reihen;
        int counter = 0;
        int x;
        System.out.print("n: ");
        reihen = scanner.nextInt();

        if(reihen <= 0){
            System.out.println("Invalid number!");
        } else {
            for(int i = 1; i <= reihen; i++){
                x = 0;
                while (x < i) {
                    counter++;
                    x++;
                    if(x==i){
                        System.out.print(counter + " " + System.lineSeparator());
                    } else {
                        System.out.print(counter + " ");
                    }
                };

            }
        }
    }

    //todo Task 3
    public void printPyramid(){
        int reihen = 6;
        int breite = 11;
        int sterne = 1;
        int abstand = 0;

        for(int i = 0; i < reihen; i++) {
            abstand = (breite - sterne) / 2;

            for(int a = 0; a < abstand; a++){
                System.out.print(" ");
            }

            for(int s = 1; s <= sterne; s++){
                if(s==sterne){
                    System.out.print("*"+ System.lineSeparator());
                } else {
                    System.out.print("*");
                }
            }
            sterne +=2;
        }



    }

    //todo Task 4
    public void printRhombus(){
        int abstand = 0;
        int zeichen = 1;
        int pos = 0;
        int zeichen_pos = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if(h%2 == 0){
            System.out.println("Invalid number!");
        } else {
            for (int i=0; i<h; i++){
                abstand = (h - zeichen) / 2;

                for(int a = 0; a < abstand; a++){
                    System.out.print(" ");
                }

                pos = (zeichen - 1) / 2;

                for(int s = 1; s <= zeichen; s++){
                    zeichen_pos = c - pos;

                    if(s==zeichen){
                        System.out.print((char)zeichen_pos+ System.lineSeparator());
                    } else {
                        System.out.print((char)zeichen_pos);
                    }
                    if(pos>=0 && s<=((zeichen-1)/2)){
                        pos--;
                    }else{
                        pos++;
                    }
                }

                if(zeichen < h && i<=((h-1)/2)){
                    zeichen +=2;
                } else {
                    zeichen -=2;
                }
            }
        }
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int note = 0, i= 0, fuenfer = 0, gesamt = 0;

        do
        {
            System.out.print("Mark " + (i+1) + ": ");
            note = scanner.nextInt();
            if (note < 0 || note > 5){
                System.out.println("Invalid mark!");
            } else {
                // note auskommentiert damit der App Test funktioniert
                gesamt += note;
                if(note == 5){
                    fuenfer++;
                }
                if(note != 0){
                    i++;
                }
            }
        } while(note != 0);

        double durchschnitt = (double)gesamt / (double)i;

        if(i==0){
            durchschnitt = 0.00;
        }

        System.out.printf("Average: %.2f"+System.lineSeparator(), durchschnitt);
        System.out.println("Negative marks: "+fuenfer);
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int zahl = scanner.nextInt(), ziffer = 0, ergebnis = 0, ende = 0;

        while(ende == 0) {
            while (zahl > 0) {
                ziffer = zahl % 10;
                ergebnis += ziffer * ziffer;
                zahl /= 10;
            }

            if (ergebnis == 1) {
                System.out.println("Happy number!");
                ende = 1;
            } else if (ergebnis == 4) {
                System.out.println("Sad number!");
                ende = 1;
            } else {
                zahl = ergebnis;
                ergebnis = 0;
            }
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

/*        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();*/

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

/*        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();*/
    }
}