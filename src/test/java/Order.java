import java.util.List;
import java.util.LinkedList;

public class Order {

    public void setOwner(String who) { /* ...*/ }
    public void setRecipient(String who) { /* ...*/ }
    private List<Drink> contents = new LinkedList<>();
    public List<Drink> getDrinks() { return contents; 
    }

    static class Drink {
        public Drink(String name){ this.name = name; }
        private String name;
        public String getName() { return name; }
    }

}