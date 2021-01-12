/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.Scanner;

/**
 *
 * @author JOL4G
 */
public class Miniprojet {

       static Scanner scanner = new Scanner( System.in );
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Boolean active = true;
       
       while(active){
           System.out.println("1-   Afficher liste d'employe");
           System.out.println("2-   Ajouter un employe");
           System.out.println("3-   Mis a jour un employe");
           System.out.println("0-   Exit");
           
        String choix = scanner.nextLine();
        switch(choix){
            case "0":
                active =false;
                break;
            case "1" :
                System.out.println("Afficher liste d'employe");
                InterfaceAccesDonnee.Afficher();
                break;
            case "2" :
                System.out.println("Ajouter un employe");
                InterfaceAccesDonnee.EmployeType();
                break;
            case "3" :
                System.out.println("Mis a jour un employe");
                InterfaceAccesDonnee.MiseAJour();
                break;
            case "4" :
                break;
            case "5" :
                break;
            default:
                System.out.println("choix invalide");
                break;
        }
       }
    }

   
    
}
