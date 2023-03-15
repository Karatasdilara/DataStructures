/*
 Dilara KARATAŞ 02200201044
 */
package diziodev;

import java.util.Scanner;

/**
 *
 * @author dilar
 */
public class Insan {
    
    public String ad;
    public String soyad;
    public String yas;
    public String kilo;
    public String boy;

    public Insan(String ad, String soyad, String yas , String kilo, String boy) {
        
        this.ad= ad;
        this.soyad = soyad;
        this.yas = yas;
        this.boy=boy ;
        this.kilo=kilo;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the yas
     */
    public String getYas() {
        return yas;
    }

    /**
     * @param yas the yas to set
     */
    public void setYas(String yas) {
        this.yas = yas;
    }

    /**
     * @return the kilo
     */
    public String getKilo() {
        return kilo;
    }

    /**
     * @param kilo the kilo to set
     */
    public void setKilo(String kilo) {
        this.kilo = kilo;
    }

    /**
     * @return the boy
     */
    public String getBoy() {
        return boy;
    }

    /**
     * @param boy the boy to set
     */
    public void setBoy(String boy) {
        this.boy = boy;
    }
    
    
    
            
}