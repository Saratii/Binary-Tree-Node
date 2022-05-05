public class Tree {
    Node root;
    int size;
    public Tree(){
        size = 0;
        root = null;
    }
    public void add(int value){
        if(root == null){
            root = new Node(value, null);
        } else {
            Node currentNode = root;
            while(true){
                if(value>currentNode.value){
                    if(currentNode.right == null){
                        currentNode.right = new Node(value, currentNode);
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                } else if(value<currentNode.value){
                    if(currentNode.left == null){
                        currentNode.left = new Node(value, currentNode); 
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {break;}
            }
        }
    }
    public String toString(){
        return "Root: " + root.display(1);
    }
    public boolean binarySearch(double value){
        Node currentNode;
        if(root != null){
            currentNode = root;
            while(true){
                if(value == currentNode.value){
                    return true;
                } else if(value > currentNode.value){
                    if(currentNode.right != null){
                        currentNode = currentNode.right;
                    } else {return false;}
                } else if(value < currentNode.value){
                    if(currentNode.left != null){
                        currentNode = currentNode.left;
                    } else {return false;}
                }
            }
            
        } else { 
            System.out.println("ERROR Root does not exist.");
            return false;
        }

    }
    public void remove(int value){
        if(binarySearch(value)){
            Node currentNode = root;
            while(true){
                if(currentNode.value > value){
                    currentNode = currentNode.right;
                } else if(currentNode.value < value){
                    currentNode = currentNode.left;
                } else if(currentNode.value == value){
                   if(currentNode.left == null && currentNode.value < currentNode.parent.value){
                       currentNode.parent.left = currentNode.right;
                       break;
                   } else if(currentNode.left == null && currentNode.value > currentNode.parent.value){
                       currentNode.parent.right = currentNode.right;
                       break;
                   } else if(currentNode.right == null && currentNode.value < currentNode.parent.value){
                       currentNode.parent.left = currentNode.left;
                       break;
                   } else if(currentNode.right == null && currentNode.value > currentNode.parent.value){
                       currentNode.parent.right = currentNode.left; 
                       break; 
                   } else {
                       currentNode.parent.value = currentNode.value;
                       currentNode = currentNode.right;
                       break;
                   }
                } 
            }
        }
    }
 }