interface edu{
    void study();
}

interface sports{
    void play();
}

class students implements edu, sports{
    public void study(){
        System.out.println("Student is studying");
    }

    public void play(){
        System.out.println("Students play the games");
    }
}
public class multipleinterface {
    public static void main(String[] args) {
        //class obj
        students s = new students();
        s.study();
        s.play();
    }
    
}
