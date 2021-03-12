package com.epsi.mycal;

import java.util.Scanner;

public class ConsoleUi {

  Calculator calc = new Calculator();
  String ops = "";
  String firstVal = "Entrez la première valeur :";
  String secondVal = "\nEntrez la deuxième valeur :";
  int valA = 0;
  int valB = 0;
  boolean stop = true;

  public void process() {
    
    while (stop) {
      Scanner inOps = new Scanner(System.in);
      System.out.println("Quel opération souhaitez-vous effectuer ?");
      System.out.println("Press 1 for add\nPress 2 for sub\nPress 3 for mul\nPress 4 for div\nPress 5 for checkPair\nPress 6 for verify if value is premier");
      ops = inOps.nextLine();
      
      switch (ops) {
      case "1":
        System.out.printf("Entrez la première valeur :");
        valA = inOps.nextInt();
        System.out.printf("\nEntrez la deuxième valeur :");
        valB = inOps.nextInt();
        System.out.println(calc.add(valA, valB));
        break;
      case "2":
        System.out.printf("Entrez la première valeur :");
        valA = inOps.nextInt();
        System.out.printf("\nEntrez la deuxième valeur :");
        valB = inOps.nextInt();
        System.out.println(calc.sub(valA, valB));
        break;
      case "3":
        System.out.printf("Entrez la première valeur :");
        valA = inOps.nextInt();
        System.out.printf("\nEntrez la deuxième valeur :");
        valB = inOps.nextInt();
        System.out.println(calc.mul(valA, valB));
        break;
      case "4":
        System.out.printf("Entrez la première valeur :");
        valA = inOps.nextInt();
        System.out.printf("\nEntrez la deuxième valeur :");
        valB = inOps.nextInt();
        System.out.println(calc.div(valA, valB));
        break;
      case "5":
        System.out.printf("Entrez la première valeur :");
        valA = inOps.nextInt();
        System.out.println(calc.checkPair(valA));
        break;
      case "6":
        System.out.printf("Entrez la première valeur :");
        valA = inOps.nextInt();
        System.out.println(calc.isPremier(valA));
        break;
      case "quitter":
        inOps.close();
        stop = false;
        break;
      default:
        System.out.println("[ERROR] - Vous n'avez pas saisie une valeur correcte");
      }
    }
  }
}