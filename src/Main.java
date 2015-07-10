public class Main {
    public static void main(String[] args){
        while (true){
            try {
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println("interrupted");
            }
        }
    }
}
