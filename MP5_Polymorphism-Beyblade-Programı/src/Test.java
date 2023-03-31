
import java.util.Scanner;


public class Test {
    //Polymorphism ile Beyblade Programı
    
    public static void main(String[] args) {
        
        System.out.println("Beyblada Programina Hosgeldiniz...");
        System.out.println("Cikis icin q ya basin.");
        
        Scanner scanner =new Scanner(System.in);
        
        while(true){
            System.out.println("Beyblade Turleri: Dragon , Drayga ,Dranza , Draciel");
            System.out.print("Hangi beyblade i uretmek istiyorsunuz? ");
             String islem=scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }
            else {
                BeybladeFabrikasi fabrika=new BeybladeFabrikasi();
                Beyblade beyblade=fabrika.beybladeuret(islem);
                
                if(beyblade==null){
                    System.out.println("Lutfen Gecerli Bir Beyblade Ismi Girin.");
                         
                   }
                else{
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
                
                
                
                
            }
        }
    }
}
