package Collections;

public class Comanda {
	
	private int ID;
	private double pret;
	private int cantitate;
	
	public Comanda(int id, double pret, int cantitate) {
		this.ID=id;
		this.pret=pret;
		this.cantitate=cantitate;
		   
	   }
	
	public double Valoare() {
		return this.pret*this.cantitate;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int newID) {
		this.ID = newID;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(double newPret) {
		this.pret = newPret;
	}
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int newCantitate) {
		this.cantitate = newCantitate;
	}
	
	public double ValComanda() {
		return this.pret*this.cantitate;
	}

	public void PlasareComanda() {
		System.out.println("the order with ID "+ID+" was placed, with the cost of: "+ValComanda()+" lei.");
    }
	
	@Override
	public String toString() {
		return "Comanda [ID=" + ID + ", pret=" + pret + ", cantitate=" + cantitate + "]";
	}
	
}

