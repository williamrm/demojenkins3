package com.epsi.mycal;

import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Calculator calc = new Calculator();
    Scanner inOps = new Scanner(System.in);
    System.out.println("Quel opération souhaitez-vous effectuer ?");
    System.out.println("Press 1 for add\n"
                     + "Press 2 for sub\n"
                     + "Press 3 for mul\n"
                     + "Press 4 for div\n");
    String ops = inOps.nextLine();
    
    System.out.printf("Entrez la première valeur :");
    int valA = inOps.nextInt();
    
    System.out.printf("\n4Entrez la deuxième valeur :");
    int valB = inOps.nextInt();
    
    switch (ops) {
      case "1":
        System.out.println(calc.add(valA, valB));
        break;
      case "2":
        System.out.println(calc.sub(valA, valB));
        break;
      case "3":
        System.out.println(calc.mul(valA, valB));
        break;
      case "4":
        System.out.println(calc.div(valA, valB));
        break;
      default:
        System.out.println("[ERROR] - Vous n'avez pas saisie une valeur correcte");
    }
  }
}