package interfaces;

import enums.Extra;
import enums.Molho;
import enums.Recheio;

import java.util.List;

public interface Builder <K, T> {

    public K recheio(Recheio recheio);
    public K molho(List<Molho> molho);
    public K extra(Extra extra);
    public T create();
}
