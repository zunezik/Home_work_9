public class Dog extends Pet {
    public void createDog(String name){
        this.name = name;
    }
    public String  say(){
        if (Math.random() > 0.5)
            return "gav ";
        else return "wooo";
    }
}
