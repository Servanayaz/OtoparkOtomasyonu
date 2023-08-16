/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class calisan {
    private String calisanadsoyad;
    private int calisanno;
    private String calisaneposta;

    public calisan(String adsoyad, int calisanno, String calisaneposta) {
        this.calisanadsoyad = adsoyad;
        this.calisanno = calisanno;
        this.calisaneposta = calisaneposta;
    }

    public calisan() {
    }

    public String getAdsoyad() {
        return calisanadsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.calisanadsoyad = adsoyad;
    }

    public int getCalisanno() {
        return calisanno;
    }

    public void setCalisanno(int calisanno) {
        this.calisanno = calisanno;
    }

    public String getCalisaneposta() {
        return calisaneposta;
    }

    public void setCalisaneposta(String calisaneposta) {
        this.calisaneposta = calisaneposta;
    }

    @Override
    public String toString() {
        return "calisan{" + "calisanadsoyad=" + calisanadsoyad + ", calisanno=" + calisanno + ", calisaneposta=" + calisaneposta + '}';
    }
    
    
}
