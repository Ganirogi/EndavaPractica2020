package OOP;

public class Comanda {
	
	public int ID;
	public int pret;
	public int cantitate;
	
	public Comanda(int id, int pret, int cantitate) {
		this.ID=id;
		this.pret=pret;
		this.cantitate=cantitate;
		   
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
	public void setPret(int newPret) {
		this.pret = newPret;
	}
	public int getCantitate() {
		return cantitate;
	}
	public void setCantitate(int newCantitate) {
		this.cantitate = newCantitate;
	}
	
	public void ComandaEfectuata() {
		System.out.println("Order "+ID+" was placed and has the price of "+this.pret*this.cantitate+" lei.");
    }
	
}

