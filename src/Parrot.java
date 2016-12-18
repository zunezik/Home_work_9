public class Parrot extends Pet {
    public void createParrot(String name){
        this.name = name;
    }
    public String  say(){
        if (Math.random() > 0.5)
            return "tutz ";
        else return "karr ";
    }
}
