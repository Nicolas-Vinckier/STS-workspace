package banque;

public class Credit extends Operation {

    public Credit(String date, float montant) {
        super(date, montant);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        return ("Credit :");
    }
    
}
