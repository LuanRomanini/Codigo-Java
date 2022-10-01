import java.io.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String path = "H:\\boletins-de-servicos.csv";
        File arq = new File(path);
        try {
            List<Entrada> lst = leitor(arq);
            for (Entrada cad : lst) {
                new EntradaBDD().insert(cad);
                System.out.println(cad);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }







    public static List<Entrada> leitor(File arq) throws IOException {
        List<Entrada> lst = new ArrayList<Entrada>();
        BufferedReader buffRead = Files.newBufferedReader(arq.toPath(), StandardCharsets.UTF_8);
        boolean primeiraLinha = true;








        String linha = buffRead.readLine();

        while (linha != null) {
            if (primeiraLinha) {
                primeiraLinha = false;
            } else {
                Entrada entrada = new Entrada();
                entrada.setboletim;
                entrada.settipo;
                entrada.setpublicado_em;
                entrada.setassunto;
                lst.add(entrada);
            }
            linha = buffRead.readLine();

        }

        return lst;
    }
}
