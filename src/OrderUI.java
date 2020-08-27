import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderUI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Order order = new Order(1);
        while (true) {
            HashMap<String, String> pro = new HashMap<>();

            String[] coffeename = {"摩卡", "馥芮白", "拿铁"};
            String[] coffeetype = {"中杯", "大杯", "超大杯"};
            String[] milktype = {"全部牛奶", "燕麦", "脱脂牛奶", "豆奶"};
            String[] ingredienttype = {"摩卡淋酱", "焦糖风味酱", "香草糖浆", "榛果糖浆", ""};


            LinkedList<Ingredient> ingredients = new LinkedList<>();

            System.out.println("请输入咖啡类型：1 摩卡， 2 馥芮白， 3 拿铁");
            int coffeeinput = scanner.nextInt() - 1;

            System.out.println("请输入类型：1 中杯， 2 大杯， 3 超大杯");
            int coffeetypeinput = scanner.nextInt() - 1;
            pro.put("type", coffeetype[coffeetypeinput]);

            System.out.println("请输入牛奶类型：1 全部牛奶， 2 燕麦， 3 脱脂牛奶， 4 豆奶");
            int milkinput = scanner.nextInt() - 1;
            pro.put("milk", milktype[milkinput]);


            System.out.println("是否需要配料 1 需要， 2 不需要");
            int index = scanner.nextInt();
            if (index == 1) {
                while (true) {
                    System.out.println("请输入配料类型：1 摩卡淋酱， 2 焦糖风味酱， 3 香草糖浆， 4 榛果糖浆， 5 焦糖糖浆， 6 结束");
                    int ingredientinput = scanner.nextInt() - 1;
                    if (ingredientinput == 5)
                        break;
                    else{
                        ingredients.add(new Ingredient(1, ingredienttype[ingredientinput]));
                        continue;
                    }
                }

            }
            order.addCoffee(new Coffee(coffeename[coffeeinput], pro, ingredients));
            System.out.println("生成咖啡："+coffeename[coffeeinput]+coffeetype[coffeetypeinput]+milktype[milkinput]);
            System.out.println("是否需要继续点咖啡 1 需要 2 不需要");
            int index1 = scanner.nextInt();

            if (index1 == 1){

                continue;}
            else {
                break;
            }



        }
        System.out.println("总价为 " + order.Calculate());
    }
}
