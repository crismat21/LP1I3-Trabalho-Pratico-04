/*
Cristiano Guimarães de Carvalho Fernandes Pinheiro  CB3013111
Patricia Jéssica Santos Fernandes Pinheiro          CB3013073
*/

package Data;

public class testeData {
    public static void main(String[] args) {
		
     var data = new Data();
	System.out.println(data.mostra1());
	System.out.println(data.mostra2());
	System.out.println("Dias transcorridos: " + data.diasTranscorridos());
	data.apresentaDataAtual();
	}

}