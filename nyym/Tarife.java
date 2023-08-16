/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class Tarife{
    private String gece;
    private String gunduz;
    private String girciksaati;
    private int ucret;

    public Tarife(String gece, String gunduz, String girciksaati, int ucret) {
        this.gece = gece;
        this.gunduz = gunduz;
        this.girciksaati = girciksaati;
        this.ucret = ucret;
    }

    public Tarife() {
    }

    public String getGece() {
        return gece;
    }

    public void setGece(String gece) {
        this.gece = gece;
    }

    public String getGunduz() {
        return gunduz;
    }

    public void setGunduz(String gunduz) {
        this.gunduz = gunduz;
    }

    public String getGirciksaati() {
        return girciksaati;
    }

    public void setGirciksaati(String girciksaati) {
        this.girciksaati = girciksaati;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "tarife{" + "gece=" + gece + ", gunduz=" + gunduz + ", girciksaati=" + girciksaati + ", ucret=" + ucret + '}';
    }
    
    
}
