package 亨元模式;

public class Client {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Usage: java Main dgits");
            System.out.println("Example: java Mian 1212123");
            System.exit(0);
        }
        BigString bs=new BigString(args[0]);
        bs.print();
    }
}
