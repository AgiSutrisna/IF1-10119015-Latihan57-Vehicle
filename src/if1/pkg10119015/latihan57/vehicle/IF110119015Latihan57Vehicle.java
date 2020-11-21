/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119015.latihan57.vehicle;

/**
 *
 * @author Agy
 * NAMA     : Agi Sutrisna
 * KELAS    : IF-1
 * NIM      : 10119015
 */
public class IF110119015Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle kendaraan = new Bicycle();
        kendaraan.setBrand("Trek Bike");
        kendaraan.setModel("7.4FX");
        System.out.println("Brand : " + kendaraan.getBrand());
        System.out.println("Model : " + kendaraan.getModel());
        kendaraan.setGearCount(23);
        System.out.println("Jumlah Gear : " + kendaraan.getGearCount());
        System.out.println();
        
        Skateboard kendaraan2 = new Skateboard();
        kendaraan2.setBrand("Ally Skate");
        kendaraan2.setModel("Rocket");
        System.out.println("Brand : " + kendaraan2.getBrand());
        System.out.println("Model : " + kendaraan2.getModel());
        kendaraan2.setBoardLength(54.5);
        System.out.println("Panjangnya Board : " + kendaraan2.getBoardLeght());
        
    }
    
}
