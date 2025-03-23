import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeitorArquivo {

    public static void lerArquivo() throws IOException {

        String caminhoArquivo = "C:/Users/douglas/IdeaProjects/gestao_de_veiculos/src/veiculos.txt";
        String linha = "";
        List<String> veiculos = new ArrayList<String>();

        BufferedReader lerArq = new BufferedReader(new FileReader(caminhoArquivo));

        while((linha = lerArq.readLine()) != null){
            String[] vetor = linha.split(",");
            System.out.println(vetor[0]);
            System.out.println(vetor[1]);
            System.out.println(vetor[2]);
            System.out.println(vetor[3]);
            System.out.println(vetor[4]);

            if (vetor.length ){

            }
        }
    }
}
