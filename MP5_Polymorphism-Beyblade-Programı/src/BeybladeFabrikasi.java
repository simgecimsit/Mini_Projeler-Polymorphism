
public class BeybladeFabrikasi {
    
    public Beyblade beybladeuret(String beyblade_turu){
        
        if(beyblade_turu.equals("Dragon")){
            return new Dragon("Mavi Ejderha", "Kutsal Canavarla Konusma", "Takao", 800, 300);
        }
        else if(beyblade_turu.equals("Dranza")){
            return  new Dranza("Kirmizi Anka Kusu", "Kai", 600, 400);
        }
        else if(beyblade_turu.equals("Drayga")){
            return  new Drayga("Beyaz Kaplan", "Rei", 800, 250);
        }
        else if(beyblade_turu.equals("Draciel")){
            return new Draciel("Kara Kaplumbaga", beyblade_turu, 400, 1000);
        }
        else{
            return null;
        }
    }
}
