/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class arac {
    private String plaka;
    private String marka;
    private String tipi;

    public arac(String plaka, String marka, String tipi) {
        this.plaka = plaka;
        this.marka = marka;
        this.tipi = tipi;
    }

    public arac() {
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getTipi() {
        return tipi;
    }

    public void setTipi(String tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "arac{" + "plaka=" + plaka + ", marka=" + marka + ", tipi=" + tipi + '}';
    }
    
    
}
