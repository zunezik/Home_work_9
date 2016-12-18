public class Cat extends Pet {
    public void createCat(String name) {
        this.name = name;
    }

    public String  say() {
        if (Math.random() > 0.5)
        return "mur ";
        else return "mya mrrr ";
    }

}
