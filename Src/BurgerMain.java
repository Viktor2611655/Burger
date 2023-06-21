public class BurgerMain {
    private String loaf;
    private String meat;
    private String cheese;
    private String greens;
    private boolean mayo;


    public BurgerMain(String loaf, String meat, String cheese, String greens, boolean mayo) {
        this.loaf = loaf;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        displayBurgerMain();
    }

    public BurgerMain(String loaf, String meat, String cheese,String greens){
        this(loaf, meat, cheese, greens, false);
    }
    public BurgerMain(String loaf, String meat){
        this(loaf, meat, "", "");
    }
    public void displayBurgerMain() {
        String mayoText = mayo ? "Yes" : "No";
        System.out.println("Бургер состоит из: " + loaf +  meat + cheese + greens + "майонез " + mayoText);
        System.out.println();
    }

    @Override
    public String toString() {
        return "BurgerMain{" +
                "loaf='" + loaf + '\'' +
                ", meat='" + meat + '\'' +
                ", cheese='" + cheese + '\'' +
                ", greens='" + greens + '\'' +
                ", mayo=" + mayo +
                '}';
    }
}
