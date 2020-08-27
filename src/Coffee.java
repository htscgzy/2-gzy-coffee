import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Coffee {

    private String name;
    private HashMap<String,String> properities;
    private LinkedList<Ingredient> ingredients;

    public Coffee(String name, HashMap<String, String> properities, LinkedList<Ingredient> ingredients) {
        this.name = name;
        this.properities = properities;
        this.ingredients = ingredients;
    }

    public double Calculate(){
        double totalPrice = AllPrice.COFFEE_VOL_PRICE.get(name).get(properities.get("type"));
        totalPrice += AllPrice.MILK_PRICE.get(properities.get("milk"));
        for(Ingredient i:ingredients){
            totalPrice += AllPrice.Ingredient_PRICE.get(i.getName())*i.getNum();
        }
        return totalPrice;
    }

}
