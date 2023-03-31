
public class Beyblade {
    
    private String beybladeci;
    private int donusHizi;
    private int saldiriGucu;
    //Constructor
    public Beyblade(String beybladeci, int donusHizi, int saldiriGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }
    
    //Methods
    public void saldir(){
        System.out.println(beybladeci+" "+saldiriGucu+" ve "+donusHizi+" ile saldiriyor...");
    }
    
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade in kutsal canavari bulunmuyor..");
    }
    
    public void bilgileriGoster(){
        System.out.println("Beybladeci Ismi:" +beybladeci);
        System.out.println("Saldiri Gucu:" +saldiriGucu);
        System.out.println("Donus Hizi:" +donusHizi);
    }
    
    
    
    
    //Getter-Setter
    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    
    
}
