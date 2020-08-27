import java.util.HashMap;

public class AllPrice {

    public static final HashMap<String, HashMap<String,Double>> COFFEE_VOL_PRICE = new HashMap<String,HashMap<String,Double>>(){{
        put("摩卡",new HashMap<String,Double>(){{
            put("中杯",15d);
            put("大杯",20d);
            put("超大杯",25d);
        }});
        put("馥芮白",new HashMap<String,Double>(){{
            put("中杯",16d);
            put("大杯",21d);
            put("超大杯",26d);
        }});
        put("拿铁",new HashMap<String,Double>(){{
            put("中杯",17d);
            put("大杯",22d);
            put("超大杯",27d);
        }});
    }};
    public static final HashMap<String,Double> MILK_PRICE = new HashMap<String,Double>(){{
        put("全部牛奶",5d);
        put("燕麦",7d);
        put("脱脂牛奶",6d);
        put("豆奶",4d);
    }};

    public static final HashMap<String,Double> Ingredient_PRICE = new HashMap<String,Double>(){{
        put("摩卡淋酱",3d);
        put("焦糖风味酱",4d);
        put("香草糖浆",3d);
        put("榛果糖浆",4d);
        put("焦糖糖浆",4d);
    }};



}

