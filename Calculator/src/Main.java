import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count;
        int ip;
        char ch;

        Adder add = new Adder();
        Minus mi = new Minus();
        Devide de = new Devide();
        Multi mu = new Multi();

        while(true){
            Scanner c = new Scanner(System.in);
            ch = c.next().charAt(0);
            count = c.nextInt();
            ip = c.nextInt();
            if(ip == 0){
                //프로그램이 꺼지게
                return;
            }
            if(ch == '+') {
                System.out.println(add.add(count,ip));
            }
            else if(ch =='-'){
                System.out.println(mi.minus(count,ip));
            }
            else if(ch == '*'){
                System.out.println(de.devide(count,ip));
            }
            else if(ch == '/'){
                System.out.println(mu.multi(count,ip));
            }
            else{
                System.out.println("입력한 방식이 잘못되었음");
            }
        }

    }
}
