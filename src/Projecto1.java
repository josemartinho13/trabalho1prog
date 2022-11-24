import java.util.Scanner;
public class Projecto1 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int tamMax=100;
		String [] linhas = new String[tamMax]; 
		int [] nPalavras = new int[tamMax];
		int [] nChars = new int[tamMax];
		boolean [] apagada = new boolean[tamMax];
		for(int i=0;i<apagada.length;i++) { 		//um ciclo para igualar todo o array a true
			apagada[i]=true;
		}
		int nLinhas=0, ultimaLinha=0;
		
		char opcaoPrincipal=0,opcaoEditar=0,opcaoFerramentas=0;
		
		do {
			String menuPrincipal=("Escolha a respectiva letra para a opção pretendida\n"
					+ "(I)nserir linhas no fim (termine com uma linha vazia)\n"
					+ "(L)istar linhas\n"
					+ "(A)pagar última linha\n"
					+ "(E)ditar\n"
					+ "(F)erramentas\n"
					+ "(S)air\n");
			
			String menuEditar=("Escolha a respectiva letra para a opção pretendida\n"
					+ "(I)nserir linha na posição n\n"
					+ "(A)pagar linha na posição n\n"
					+ "Apagar (l)inhas da posição n à posição m\n"
					+ "(R)ecuperar linha\n"
					+ "(E)liminar linhas apagadas\n"
					+ "(V)oltar\n");
			
			String menuFerramentas=("Escolha a respectiva letra para a opção pretendida\n"
					+ "(M)ostrar linhas onde ocorre a palavra p.\n"
					+ "(S)ubstituir a palavra p na linha n.\n"
					+ "Mostrar número de (l)inhas.\n"
					+ "Mostrar número de (p)palavras.\n"
					+ "Mostrar número de (c)aracteres. (V)oltar.");
			System.out.print(menuPrincipal);
			opcaoPrincipal=teclado.next().charAt(0);
			teclado.nextLine();
			
			
			switch (opcaoPrincipal) {
				
				case 'I': case 'i':
					System.out.println("Pode escrever as suas linhas, quando quiser sair coloque uma linha fazia");
					
					do { 										//ciclo que enquanto a linha nao for vazia vai registar novas linhas	
						linhas[nLinhas]=teclado.nextLine();  	//ler as linhas do utilizador e escrever no array
						apagada[nLinhas]=false;					//colocar a respectiva posiçao do array de booleans a false
						
						
						//falta actualizar o nPalavras e nCaracteres
						
						
						
						nLinhas++;								//incrementar o contador de linhas escritas
														
					}
					
					while (linhas[nLinhas-1]!=(""));
					nLinhas--;
					apagada[nLinhas]=true;	
					ultimaLinha=nLinhas;						//a variavel ultimaLinha vai guardar a ultima posição alterada do array
					System.out.printf("Adicionou %d linhas\n",nLinhas);
					break;
					
				case 'L': case 'l':
					for (int i=0;i<linhas.length;i++) { 		//ciclo para mostrar todas as linhas a false (apagadas)
						if(apagada[i]==false) {					
						System.out.println(linhas[i]);
					} }
					break;
					
				case 'A': case 'a':
					apagada[ultimaLinha]=true;					//colocar a ultima linha inserida a true (apagado)
					System.out.printf("A ultima linha que inseriu foi apagada. Foi a linha %d\n",ultimaLinha);
					break;
					
				case 'E': case 'e':
					do {								//ciclo do menu editar
					System.out.print(menuEditar);
					opcaoEditar=teclado.next().charAt(0);
					switch (opcaoEditar) {
						case'I': case 'i':
							System.out.println("caso i no menu editar");
							//falta codigo
							break;
						case'A': case'a':
							System.out.println("caso a no menu editar");
							//falta codigo
							break;
						case'L': case'l':
							System.out.println("caso l no menu editar");
							//falta codigo
							break;
						case'R': case'r':
							System.out.println("caso r no menu editar");
							//falta codigo
							break;
						case'E': case'e':
							System.out.println("caso e no menu editar");
							//falta codigo
							break;
						case'V': case'v':
							break;
						default:
							System.out.println("Colocou uma letra errada");
							break;
						
							
					}}
					
						
					while (opcaoEditar!='V' && opcaoEditar!='v');
					break;
					
				case 'F': case 'f':
					System.out.println("case f");
					//falta codigo
					break;
					
				case 'S': case 's':
					break;
					
				default:
					System.out.println("Colocou uma letra errada");
					break;
			}
			
			
			
		}
		while (opcaoPrincipal!='s' && opcaoPrincipal!='S');
		System.out.println("O programa terminou");
	}

}
