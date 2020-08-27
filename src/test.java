import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedList;

public class test {

    @Test
    public void testMoka(){
        Order order = new Order(1);
        HashMap<String, String> pro = new HashMap<>();
        pro.put("type","中杯");
        pro.put("milk","燕麦");

        LinkedList<Ingredient> ingredients = new LinkedList<>();
        ingredients.add(new Ingredient(1,"摩卡淋酱"));
        order.addCoffee(new Coffee("摩卡",pro,ingredients));

        System.out.println(order.Calculate());
    }

    @Test
    public void testNatie(){
        Order order = new Order(1);
        HashMap<String, String> pro = new HashMap<>();
        pro.put("type","中杯");
        pro.put("milk","燕麦");

        LinkedList<Ingredient> ingredients = new LinkedList<>();
        order.addCoffee(new Coffee("拿铁",pro,ingredients));

        System.out.println(order.Calculate());

    }

    @Test
    public void testAddHerb(){
        Order order = new Order(1);
        HashMap<String, String> pro = new HashMap<>();
        pro.put("type","中杯");
        pro.put("milk","燕麦");

        LinkedList<Ingredient> ingredients = new LinkedList<>();
        ingredients.add(new Ingredient(1,"香草糖浆"));
        order.addCoffee(new Coffee("摩卡",pro,ingredients));

        System.out.println(order.Calculate());

    }

    @Test
    public void testAddMulpiIngredient(){
        Order order = new Order(1);
        HashMap<String, String> pro = new HashMap<>();
        pro.put("type","中杯");
        pro.put("milk","燕麦");

        LinkedList<Ingredient> ingredients = new LinkedList<>();
        ingredients.add(new Ingredient(1,"摩卡淋酱"));
        ingredients.add(new Ingredient(1,"香草糖浆"));
        order.addCoffee(new Coffee("摩卡",pro,ingredients));

        System.out.println(order.Calculate());

    }

    @Test
    public void testMulpiCoffee(){

        Order order = new Order(1);
        HashMap<String, String> pro = new HashMap<>();
        pro.put("type","中杯");
        pro.put("milk","燕麦");

        LinkedList<Ingredient> ingredients = new LinkedList<>();
        ingredients.add(new Ingredient(1,"摩卡淋酱"));
        ingredients.add(new Ingredient(1,"香草糖浆"));
        order.addCoffee(new Coffee("摩卡",pro,ingredients));

        order.addCoffee(new Coffee("馥芮白",pro,ingredients));

        System.out.println(order.Calculate());



    }

}
