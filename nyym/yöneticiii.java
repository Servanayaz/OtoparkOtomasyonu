/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class yöneticiii implements Observer{
    private String adi;

    public yöneticiii(String adi) {
        this.adi = adi;
    }
    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
    

    @Override
    public void update(Observable observable) {
        Tarifee tarifee = (Tarifee) observable;
        
        System.out.println("Güncel Fiyat = " + tarifee.getUcret()+" ₺");
    }
    
}

