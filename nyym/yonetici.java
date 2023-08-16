/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nyym;

/**
 *
 * @author Msi
 */
public class yonetici {
    private String yoneticiadsoyad;
    private int yoneticino;
    private String yoneticieposta;

    public yonetici(String yoneticiadsoyad, int yoneticino, String yoneticieposta) {
        this.yoneticiadsoyad = yoneticiadsoyad;
        this.yoneticino = yoneticino;
        this.yoneticieposta = yoneticieposta;
    }

    public yonetici() {
    }

    public String getYoneticiadsoyad() {
        return yoneticiadsoyad;
    }

    public void setYoneticiadsoyad(String yoneticiadsoyad) {
        this.yoneticiadsoyad = yoneticiadsoyad;
    }

    public int getYoneticino() {
        return yoneticino;
    }

    public void setYoneticino(int yoneticino) {
        this.yoneticino = yoneticino;
    }

    public String getYoneticieposta() {
        return yoneticieposta;
    }

    public void setYoneticieposta(String yoneticieposta) {
        this.yoneticieposta = yoneticieposta;
    }

    @Override
    public String toString() {
        return "yonetici{" + "yoneticiadsoyad=" + yoneticiadsoyad + ", yoneticino=" + yoneticino + ", yoneticieposta=" + yoneticieposta + '}';
    }
    
    
}
