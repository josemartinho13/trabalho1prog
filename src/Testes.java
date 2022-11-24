import java.util.Scanner;
public class Testes {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int tamMax=100;
		String [] linhas = new String[tamMax]; 
		int [] nPalavras = new int[tamMax];
		int [] nChars = new int[tamMax];
		boolean [] apagada = new boolean[tamMax];
		int nLinhas=0;
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
					+ "Apagar (l)inhas da posição n à posição m\n "
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
			
			
			switch (opcaoPrincipal) {
				
				case 'I': case 'i':
					System.out.println("case i");
					//falta codigo
					break;
					
				case 'L': case 'l':
					System.out.println("case l");
					// falta codigo
					break;
					
				case 'A': case 'a':
					System.out.println("case a");
					//falta codigo
					break;
					
				case 'E': case 'e':
					System.out.println("case e");
					//falta codigo
					break;
					
				case 'F': case 'f':
					System.out.println("case f");
					//falta codigo
					break;
					
				case 'S': case 's':
					break;
					
			}
			
			
			
		}
		while (opcaoPrincipal!='s' && opcaoPrincipal!='S');
		System.out.println("O programa terminou");
	}

}
