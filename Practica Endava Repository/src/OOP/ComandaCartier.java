package OOP;

public class ComandaCartier extends Comanda{
	
	String cartier;

	public ComandaCartier(int id, int pret, int cantitate, String Cartier) {
		super(id, pret, cantitate);
		this.cartier = Cartier;
		
	}

	public String getCartier() {
		
		return cartier;
	}
	
	public void setCartier(String Cartier) {
		this.cartier = Cartier;
	}
	
@Override
	public void ComandaEfectuata() {
		System.out.println("Order "+ID+" was placed and has the price of "+this.pret*this.cantitate+" lei.");
	}
	
}
