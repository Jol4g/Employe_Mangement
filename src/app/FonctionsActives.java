/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static app.Miniprojet.scanner;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JOL4G
 */
public class FonctionsActives {
    ArrayList<Employe> lesEmployes;
    static Scanner scanner = new Scanner( System.in );
    static ArrayList<Employe> listeEmploye = new ArrayList<>();
    
    static public void Afficher() {
            for (Employe employe : listeEmploye) {
                System.out.println(employe);
            }
    }
    
    
    static public void AfficherDeveloper() {
            for (Employe employe : listeEmploye) {
                if(employe instanceof Developer){
                    System.out.println(employe);   
                }
            }
    }
    
        static public void AfficherJardinier() {
            for (Employe employe : listeEmploye) {
                if(employe instanceof Jardinier){
                    System.out.println(employe);   
                }
            }
    }
    
    
    static public void AddEmploye(){
//        String nom = scanner.nextLine();
//        String prenom = scanner.nextLine();
//        String age = scanner.nextLine();

        Employe e = new Employe("Sarray", "Fedi", 10);
        listeEmploye.add(e);
    }
    
        static public void AddDeveloper(){
        Employe e = new Developer("Sarray", "Fedi", 21);
        listeEmploye.add(e);
    }
        static public void AddJardinier(){
        Employe e = new Jardinier("Sarray", "Akram", 30);
        listeEmploye.add(e);
    }
    
}
