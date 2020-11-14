/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan57.vehicle;

/**
 *
 * @author RAF
 * Nama         : Ridhwan Anwar Fauzan
 * NIM          : 10119077
 * Kelas        : IF - 2
 * Deskripsi    : Menampilkan Vehicle
 */
public class PBOIF210119077Latihan57Vehicle {

    
    public static void main(String[] args) {
        Bicycle objBicycle = new Bicycle();
        objBicycle.setBrand("Trek Bike");
        objBicycle.setModel("7.4FX");
        objBicycle.setGearCount(23);
        System.out.println("Brand : "+objBicycle.getBrand());
        System.out.println("Model : "+objBicycle.getModel());
        System.out.println("Jumlah Gear : "+objBicycle.getGearCount());
        System.out.println("");
        
        Skateboard objSkateboard = new Skateboard();
        objSkateboard.setBrand("Ally Skate");
        objSkateboard.setModel("Rocket");
        objSkateboard.setBoardLength(54.5);
        System.out.println("Brand : "+objSkateboard.getBrand());
        System.out.println("Model : "+objSkateboard.getModel());
        System.out.println("Panjangnya Board : "+objSkateboard.getBoardLength());
    }
    
}
