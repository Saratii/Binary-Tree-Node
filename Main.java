import java.util.Random;
public class Main {
    public static void main(String args[]){
        Tree tree = new Tree();
        tree.add(0);
        Random randomMachine = new Random();
        for(int i=0; i<100;i++){
            tree.add(randomMachine.nextInt(100));
            //tree.add(i);
        }
        System.out.println(tree);
    }
}
