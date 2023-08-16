/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class musteri {
    private String musteriadsoyad;
    private int musterino;
    private String musterieposta;

    public musteri(String musteriadsoyad, int musterino, String musterieposta) {
        this.musteriadsoyad = musteriadsoyad;
        this.musterino = musterino;
        this.musterieposta = musterieposta;
    }

    public musteri() {
    }

    public String getMusteriadsoyad() {
        return musteriadsoyad;
    }

    public void setMusteriadsoyad(String musteriadsoyad) {
        this.musteriadsoyad = musteriadsoyad;
    }

    public int getMusterino() {
        return musterino;
    }

    public void setMusterino(int musterino) {
        this.musterino = musterino;
    }

    public String getMusterieposta() {
        return musterieposta;
    }

    public void setMusterieposta(String musterieposta) {
        this.musterieposta = musterieposta;
    }

    @Override
    public String toString() {
        return "musteri{" + "musteriadsoyad=" + musteriadsoyad + ", musterino=" + musterino + ", musterieposta=" + musterieposta + '}';
    }
    
    
}
