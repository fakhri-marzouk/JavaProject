
public class Client extends Personne {
	private int num ;

	public Client(int cin, String nom, String prenom, int age, String mail, String adresse, int numero_telph, int num) {
		super(cin, nom, prenom, age, mail, adresse, numero_telph);
		this.num = num;
	}

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	@Override
	public String toString( ) {
		return "Client [num=" + num + ", toString()=" + super.toString() + ", getCin()=" + getCin() + ", getNom()="
				+ getNom() + ", getPrenom()=" + getPrenom() + ", getAge()=" + getAge() + ", getMail()=" + getMail()
				+ ", getAdresse()=" + getAdresse() + ", getNumero_telph()=" + getNumero_telph() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
