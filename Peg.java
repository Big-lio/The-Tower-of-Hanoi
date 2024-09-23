import java.util.Stack;

public class Peg {
    char name;
    Peg next;
    
    private Stack<Integer> disks;

    public Peg() {
        this.disks = new Stack<>();
    }

    public void pushDisk(int disk) {
        disks.push(disk);
    }

    public int popDisk() {
        return disks.pop();
    }

    public int peekDisk() {
        return disks.peek();
    }

    public boolean isEmpty() {
        return disks.isEmpty();
    }


    public int getSize(){
        return disks.size() ;
    }
    
    public void setName(char name){
        this.name = name;
    }
    
    public char getName(){
        return name;
    }
    
    public void setNext(Peg next){
        this.next=next;
    }
    
    public Peg getNext(){
        return next;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0 ; i <= disks.size() - 1; i++) {
            sb.append(disks.get(i));
            if (i < disks.size()-1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}

