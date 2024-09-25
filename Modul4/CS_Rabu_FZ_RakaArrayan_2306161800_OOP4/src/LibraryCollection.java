import java.util.HashMap;

public class LibraryCollection<T> {

    private HashMap <String,T> items;

    public LibraryCollection(){
        items = new HashMap <String,T> ();
    }

    public void addItem(String key,T item){
        items.put(key,item);
    }

    public T getItem (String key){
        return items.get(key);
    }

    public HashMap<String, T> getAllItems() {
        return items;
    }
}
