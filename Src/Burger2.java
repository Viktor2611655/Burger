public class Burger2 {
    public static void main(String[] args){
        BurgerMain burger1 = new BurgerMain("Обычная булочка, ","Говядина, ",
                "Cир Голландский, ","капуста, ",true);
        BurgerMain burger2 = new BurgerMain("Булка обыкновенная, ",
                "Телятина, ", "Сыр, ","зелень, ");
        BurgerMain burger3 = new BurgerMain("Булочка пушечка, ","Двойное мясо");

        System.out.println(burger1);
        System.out.println(burger2);
        System.out.println(burger3);
    }
}
