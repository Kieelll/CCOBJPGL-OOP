public class App {
    static boolean iWillBehave = true;
    static boolean iWillGraduate = true;
    public static void main(String[] args) throws Exception {

        //precondition
        assert iWillBehave == true: "Season 2 sa college";

        college();

        //postcondition
        assert iWillGraduate == true: "Repeat ka muna, napasarap pahinga mo eh";
    }

 static void college(){
    iWillGraduate = true;
    System.out.println("Nice, apply ka na trabaho!");
 }
}
