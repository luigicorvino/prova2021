/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

/**
 *
 * @author luigi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        salute("Fisciano");
 
        System.out.println("Hello world!");
        salute("universe");
        System.out.println("Hello metaverse");

    }
    public static void salute(String whom){
        System.out.println("Hello, "+whom);
    }
}
