/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author JOL4G
 */
public class Jardinier extends Employe{
    int salaire ;
    public Jardinier(String nom, String prenom, int age) {
        super(nom, prenom, age);
        this.id=id++;
        this.salaire=400;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

 

    @Override
    public String toString() {
        return "Jardinier{" + "id=" + jobID+ " nom=" + nom + ", prenom=" + prenom + ", age=" + age +" "+ "salaire=" + salaire  + '}';
    }
    
    
    
}
