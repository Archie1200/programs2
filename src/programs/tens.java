package programs;

public class tens {
        public int a;
        public int digit(){
            int b=a/10;
            int c=b%10;
            return c;
        }
    }
    class Print{
        public static void main(String[] args) {
            tens obj = new tens();
            obj.a=Integer.parseInt(args[0]);
            System.out.println(obj.digit());
        }
    }

