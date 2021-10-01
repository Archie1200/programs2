package programs;

public class shape {
    public String draw(){
        return ("Drawing Shape");
    }
    public String erase(){
        return ("Erasing Shape");
    }
}

class display{
    public static void main(String[] args) {
        shape obj = new shape();
        System.out.println(obj.draw());
        System.out.println(obj.erase());
    }
}