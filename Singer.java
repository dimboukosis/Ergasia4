
public class Singer {
	
	//metavlites stigmiotypou ths klashs Singer, me to onoma kai to id tou kathe tragoudisti
	//xrhsimopoioume thn statiki metavliti counter, h opoia gia kathe nea ekxwrisi tragoudisti 
	//auksanetai kata mia monada
	static Singer singers[] = new Singer [10];
	private String name;
	private int id;
	static int counter = 0;
	
	//Arxikopoihsh twn metavlitwn stigmiotypou, me to id na einai iso me to counter+1
	//to ++counter tha treksei swsta se sxesh me to counter++, giati prwta prosthetei sto 
	//counter +1, se sxesh me to counter++ pou prwta trexei thn entoli kai meta prosthetei 1
	public Singer(String name) {
		this.name = name;
		singers[counter]=this;
		id = ++counter;
	}
	
	//Get & Set methodoi gia kathe metavliti stigmiotypou
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id  = id;
	}
	
	//methodos to String gia emfanisi apotelesmatwn
	public String toString() {
		return "Singer [name = " + name + ",id = " + id +"]";
	}
}
