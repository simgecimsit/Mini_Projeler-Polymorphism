
public class Draciel extends Beyblade {

    private String kutsalCanavar;

    public Draciel(String kutsalCanavar, String beybladeci, int donusHizi, int saldiriGucu) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal Canavar Adi:" +kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci()+""+kutsalCanavar+" i ortaya cikariyor.."); 
        System.out.println(getBeybladeci()+ " in Savunmasi: Kale Savunmasi");
    }
    
    
    
}
