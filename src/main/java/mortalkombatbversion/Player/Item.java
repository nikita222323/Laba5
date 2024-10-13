package mortalkombatbversion.Player;

public class Item {

    private String name;
    private int count;

    public Item(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public void setCount(int count) {
        this.count += count;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
    public int newGameItem(){
        return this.count = 0;
    }
}
