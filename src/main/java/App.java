import enums.Extra;
import enums.Molho;
import enums.Recheio;
import enums.TipoPao;
import sanduiche.SanduicheBuilder;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

       Lanchonete lanchonete = new Lanchonete();

       lanchonete.montarSanduiche();
    }
}
