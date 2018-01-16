import java.util.Scanner;



public class SongTest {
	public static void main(String args[]) {
		
		//object scanner gia na mporesoume na diavasoume apo to xrhsth mesw ths klasis
		//Scanner
		Scanner scanner = new Scanner (System.in);
		
		//pinakes singers kai songs 10 thesewn gia na topothetisoume mesa tragoudistes kai tragoudia
		//Singer[] singers = new Singer[10];
		//Song[] songs = new Song[10];
		
		//Ekxwrish stous pinakes twn tragoudistwn kai tragoudiwn mesw ths klashs Singer kai Song 
		Singer frank = new Singer("Frank Sinatra");
		Singer wham = new Singer("Wham!");
		Singer mariah = new Singer("Mariah Carey");
		Singer chris = new Singer("Chris Rea");
		Singer sia = new Singer("Sia");
		
		new Song("All I Want for Christmas Is You", sia, "https://www.youtube.com/watch?v=yXQViqx6GMY");
		new Song("White Christmas", frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA");
		new Song("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI");
		new Song("Driving home for christmas", mariah, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		new Song("Santa's Coming For Us", chris, "https://www.youtube.com/watch?v=V3EYjVPRClU");
		new Song("Let It Snow! Let It Snow! Let It Snow!", frank,"https://www.youtube.com/watch?v=vGRC2LYmHfU");
		
		//trexontas thn epanalipsi gia panta
		while (true){
			
			//Typwsh tou menu
			System.out.println("\n------ Welcome to our DMST Christmas Music Application ------");
			System.out.println("Menu:");
			System.out.println("Type 1 to display singers' list");
			System.out.println("Type 2 to display Frank's Sinatra available songs");
			
			//diavazoume apo to xrhsth thn epilogi tou
			int ch = scanner.nextInt();
			
			//An thelei thn typwsh tou synolikou menu, to typwnoume apo to toString
			//Pointer s typou Singer gia na anatreksoume ton pinaka
			if (ch == 1){
				for (Singer s: Singer.singers){
					if (s != null)
						System.out.println(s.toString());
				}
				System.out.println("---------------------------------------------------------------");
			}
			
			
			//An thelei na dei ta tragoudia tou Frank Sinatra
			else if (ch == 2 ){
				
				//Psaxnoume na vroume posa enai ta tragoudia tou Sinatra ston pinaka
				//To kappa einai pointer typou Song gia na anatreksoume ton pinaka 
				int sinatra_songs=0;
				for(Song kappa:Song.songs) {
					if(kappa != null)
						if(kappa.getSinger() == frank)
							sinatra_songs++;
					}
				System.out.println("We found "+sinatra_songs+" Sinatra songs.");
				
				//Ektypwsh Tragoudiwn kai url tou Frank Sinatra
				for(Song kappa:Song.songs) {
					if(kappa != null)
						if(kappa.getSinger() == frank)
							System.out.println(kappa.toString());
					
					}
				System.out.println("------------------------------------------------------------------------------------");
				}
			
			//An den mas valei o xrhsths 1 h 2, ton rwtame na ksanavalei kapoia epilogh
			else {
					System.out.println("There is no such option, you should enter 1 or 2 from the menu\n");
				}
			
		}
		
	}
}
