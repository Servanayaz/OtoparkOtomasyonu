/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;



/**
 *
 * @author Msi
 */
public class Tarifee extends Observable {



    /*private static class ucret {

    
    }*/

    private String gece;
    private String gunduz;
    private String girciksaati;
    private int ucret;

    public Tarifee(String gece, String gunduz, String girciksaati, int ucret) {
        this.gece = gece;
        this.gunduz = gunduz;
        this.girciksaati = girciksaati;
        this.ucret = 0;
    }

    public Tarifee() {
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
        
        System.out.println(ucret);
        
        ucretKontrol();
    }
    

    private void ucretKontrol() {
        if (ucret>=100){
            haberver();
        }
    }

    
    }
