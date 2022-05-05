public class Node {
    int value;
    Node left;
    Node right;
    Node parent;
    public Node(int value, Node parent){
        this.value = value;
        this.parent = parent;
    }
    public String toString(){
        return "{"+Integer.toString(value) + " Left :" + left + " Right :" + right+"}";
    }
    public String display(int generation){
        String display = value + "";
        if(left != null){
            display += "\n";
            for(int i = 0; i<generation; i++){
                display += "  ";
            }
            display += "Left: " + left.display(generation+1);
        }
        if(right != null){
            display += "\n";
            for(int i = 0; i<generation; i++){
                display += "  ";
            }
            display += "Right: " + right.display(generation+1);
        }
        return display;
    }
}