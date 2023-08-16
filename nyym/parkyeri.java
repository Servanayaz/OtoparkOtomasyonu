/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class parkyeri {
    private String alan;
    private int sirano;

    public parkyeri(String alan, int sırano) {
        this.alan = alan;
        this.sirano = sırano;
    }

    public parkyeri() {
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public int getSırano() {
        return sirano;
    }

    public void setSırano(int sırano) {
        this.sirano = sırano;
    }

    @Override
    public String toString() {
        return "parkyeri{" + "alan=" + alan + ", sirano=" + sirano + '}';
    }
    
    
}
