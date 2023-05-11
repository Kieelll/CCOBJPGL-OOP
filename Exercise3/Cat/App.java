package Cat;
public class App {
    public static void main(String[] args) throws Exception {
        Pet myCat = new Pet();
        
        myCat.bark();
        System.out.println(myCat.eyeColor);
        System.out.println(myCat.height);
    }
}