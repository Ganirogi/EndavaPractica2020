
package OOP;

public class OOPmain {

	public static void main(String[] args) {
		Comanda c1 = new ComandaCartier(1,2,4,"Bradu");
		c1.ComandaEfectuata();
		Comanda c2 = new ComandaFerma(2,3,0);
		c2.ComandaEfectuata();
	}
}
