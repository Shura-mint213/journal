package interfaces;

import java.util.ArrayList;

/**Class for object actions*/
public interface Actions {
    public <T> T getById(T object, int id);

    public <T> T create();

    public <T> ArrayList<T> delete();
}
