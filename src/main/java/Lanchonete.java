import enums.Extra;
import enums.Molho;
import enums.Recheio;
import enums.TipoPao;
import sanduiche.SanduicheBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lanchonete {

    Scanner ler = new Scanner(System.in);

    public SanduicheBuilder montarSanduiche(){
        TipoPao pao = adicionarPao();
        Recheio recheio = adicionarRecheio();
        Extra extra = adicionarExtra();
        List<Molho> molhos = adicionarMolhos();

        SanduicheBuilder sanduiche = new SanduicheBuilder(pao);

        if(recheio != null) {
            sanduiche.recheio(recheio);
        }
        if(extra != null) {
            sanduiche.extra(extra);
        }
        if(molhos != null){
            sanduiche.molho(molhos);
        }

        System.out.println(sanduiche);

        return sanduiche;
    }

    private TipoPao adicionarPao() {
        while (true) {
            System.out.println("\nTipo de Pão:\n1-Italiano\n2-Frances\n3-Americano");
            int opcao = ler.nextInt();

            if(opcao == 1) {
                return TipoPao.ITALIANO;
            }
            if(opcao == 2) {
                return TipoPao.FRANCES;
            }
            if(opcao == 3) {
                return TipoPao.AMERICANO;
            } else {
                System.out.println("\nDigite uma das opções");
            }
        }
    }

    private Recheio adicionarRecheio() {
        while (true) {
            System.out.println("\nTipo de Recheio:\n1-Frango" +
                    "\n2-Camarão\n3-Atum\n4-Sem recheio");
            int opcao = ler.nextInt();

            if(opcao == 1) {
                return Recheio.FRANGO;
            }
            if(opcao == 2) {
                return Recheio.CAMARAO;
            }
            if(opcao == 3) {
                return Recheio.ATUM;
            }
            if(opcao == 4) {
                return null;
            } else {
                System.out.println("\nDigite uma das opções");
            }
        }
    }

    private Extra adicionarExtra() {
        while (true) {
            System.out.println("\nExtras:\n1-Azeitonas\n2-Bacon\n3-Cheddar\n4-Sem extra");
            int opcao = ler.nextInt();

            if(opcao == 1) {
                return Extra.AZEITONAS;
            }
            if(opcao == 2) {
                return Extra.BACON;
            }
            if(opcao == 3) {
                return Extra.CHEDDAR;
            }
            if(opcao == 4) {
                return null;
            } else {
                System.out.println("\nDigite uma das opções");
            }
        }
    }

    private List<Molho> adicionarMolhos() {
        List<Molho> molhos = new ArrayList<>();

        while (true) {
            System.out.println("\nTipo de Molho (Selecione mais de 1):" +
                    "\n1-Maionese\n2-Mostarda\n3-Ketchup\n4-Sem molho");
            int opcao = ler.nextInt();

            if(opcao == 1) {
                molhos.add(Molho.MAIONESE);
            }else if(opcao == 2) {
                molhos.add(Molho.MOSTARDA);
            }else if(opcao == 3) {
                molhos.add(Molho.KETCHUP);
            }else if(opcao == 4) {
                return null;
            } else {
                System.out.println("\nDigite uma das opções");
            }

            if(molhos.size() == 3) {
                return molhos;
            }
        }
    }
}
