package sanduiche;

import enums.Extra;
import enums.Molho;
import enums.Recheio;
import enums.TipoPao;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Sanduiche {

    private TipoPao tipoPao;
    private Recheio recheio;
    private Extra extra;
    private List<Molho> molho;
}
