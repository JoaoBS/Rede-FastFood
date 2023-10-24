package sanduiche;

import enums.Extra;
import enums.Molho;
import enums.Recheio;
import enums.TipoPao;
import interfaces.Builder;

import java.util.List;

public class SanduicheBuilder implements Builder<SanduicheBuilder, Sanduiche> {

    private final TipoPao tipoPao;
    private Recheio recheio;
    private Extra extra;
    private List<Molho> molho;

    public SanduicheBuilder(TipoPao tipoPao) {
        this.tipoPao = tipoPao;
    }

    @Override
    public SanduicheBuilder recheio(Recheio recheio) {
        this.recheio = recheio;
        return this;
    }

    @Override
    public SanduicheBuilder molho(List<Molho> molho) {
        this.molho = molho;
        return this;
    }

    @Override
    public SanduicheBuilder extra(Extra extra) {
        this.extra = extra;
        return this;
    }

    @Override
    public Sanduiche create() {
        Sanduiche sanduiche = new Sanduiche();
        sanduiche.setTipoPao(this.tipoPao);
        sanduiche.setRecheio(this.recheio);
        sanduiche.setMolho(this.molho);
        sanduiche.setExtra(this.extra);
        return sanduiche;
    }

    @Override
    public String toString() {
        return "\nTipo de Pao: " + tipoPao +
                "\nRecheio: " + recheio +
                "\nExtras: " + extra +
                "\nMolhos: " + molho;
    }
}
