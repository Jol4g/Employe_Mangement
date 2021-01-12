/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author JOL4G
 */
public class Employe {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int jobID;
    String nom;
    String prenom;   
    int  age;
    public int id=0;
    public Employe( String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.jobID=count.incrementAndGet();
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
        return "Employe{" + "id=" + jobID+ " nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }
     
    
}
