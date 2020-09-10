package OOP;

public class ComandaFerma extends Comanda{

	
public ComandaFerma(int id, int pret, int cantitate) {
		super(id, pret, cantitate);
	}

@Override
	public void ComandaEfectuata() {
		System.out.println("Order "+this.ID+" didn't end succesfully.");
    }
}
