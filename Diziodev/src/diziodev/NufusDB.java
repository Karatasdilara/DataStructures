/*
 Dilara KARATAŞ 02200201044
 */
package diziodev;

import java.util.Scanner;

/**
 *
 * @author dilar
 */
public class NufusDB {
    /*
    int [] dizi;
    int es;
    
    public NufusDB(int boyut) {
        dizi = new int[boyut];
        es=0;
    }
    
    
    
    public void ekle(int a){
        
        if (es>= dizi.length){
            System.out.println("Dizi dolu");
        } else {
            int i=0;
            for(i=(es-1); i>=0 && dizi[i]>a; i--){
            dizi[i+1]= dizi[i];
            }
            dizi[i+1]=a;
            es++;
        }    
    }
    public int arama(int a){
        for(int i=0;i<es ;i++){
            if(dizi[i]==a){
                return i;
            }
        }
        return -1;
    }
    public void sil(int a){
        int indis =this.arama(a);
        
        
    }
    */
    public void yazdir(){
         
        
    Insan people []= new Insan[5];
    
    for (int i=0; i<=people.length; i++){
        Scanner sc = new Scanner(System.in);
            
            String isim = sc.nextLine();
            String soyad = sc.nextLine();
            String yas = sc.nextLine();
            String boy = sc.nextLine();
            String kilo = sc.nextLine();
            Insan birey1 = new Insan(isim, soyad, yas, boy, kilo);
            people[i]=birey1;
    }

    for (int j = 0; j < 6; j++) {
            System.out.print(people[j].getAd());
            System.out.print(people[j].getSoyad());
            System.out.print(people[j].getYas());
            System.out.print(people[j].getBoy());
            System.out.println(people[j].getKilo());

        }
    
        
   
       
    }
    
}
