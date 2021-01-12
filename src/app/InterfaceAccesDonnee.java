/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import static app.Miniprojet.scanner;

/**
 *
 * @author JOL4G
 */
public class InterfaceAccesDonnee {
    
     public static void EmployeType(){
        
        System.out.println("     1-   Ajouter un employe");
        System.out.println("     2-   Ajouter un jardinier");
        System.out.println("     3-   Ajouter un developer");
        System.out.println("     0-   Exit");
        String type = scanner.nextLine();
        switch(type){
            case "1" :
                System.out.println("Ajouter un employe");
                FonctionsActives.AddEmploye();
                break;
            case "2" :
                System.out.println("Ajouter un jardinier");
            FonctionsActives.AddJardinier();
                break;
            case "3" :
                System.out.println("Ajouter un developer");
                FonctionsActives.AddDeveloper();
                break;
            default:
                System.out.println("choix invalide");
                break;
        }
    }
    static public void MiseAJour(){
        System.out.println("");
    }
    
    static public void Afficher(){
        FonctionsActives.Afficher();
        System.out.println("app.InterfaceAccesDonnee.Afficher()");
    }
    
}
