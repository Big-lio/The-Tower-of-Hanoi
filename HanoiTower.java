import java.util.Stack;

public class HanoiTower {
    static void iterativeProcess(int numberOfDisks) {
        Peg A = new Peg();
        Peg B = new Peg();
        Peg C = new Peg();
        
        A.setName('A');
        B.setName('B');
        C.setName('C');
        
        String wise;
        Peg current = new Peg();

        current = A;

        int totalMoves = (int) Math.pow(2, numberOfDisks) - 1;

        for (int i = numberOfDisks; i >= 1; i--)
            A.pushDisk(i);

        if (numberOfDisks % 2 == 0) {
            wise="Moving: Clockwise";
            A.setNext(B);
            B.setNext(C);
            C.setNext(A);
        } else {
            wise="Moving: Counter-clockwise ";
            A.setNext(C);
            B.setNext(A);
            C.setNext(B);
        }

        System.out.println("   Initial state:");
        System.out.println();
        System.out.println("        A" + A.toString() + ", "
            + "B" + B.toString() + ", "
            + "C" + C.toString() );

        System.out.println();

        moveDisk(current,totalMoves,A,B,C,wise);
        
    }


    static void moveDisk(Peg current,int totalMoves, Peg A, Peg B, Peg C, String wise) {
        int disk=0;
        Peg last= new Peg();
        System.err.println("   "+wise);
        for (int i = 1; i <= totalMoves; i++){
        
            if (!current.isEmpty()) {

                disk = current.popDisk();
                
                if (current.getNext().isEmpty()){
                        current.getNext().pushDisk(disk);
                        last = current.getNext();
                } 

                else if (!current.getNext().isEmpty() && disk < current.getNext().peekDisk()){
                        current.getNext().pushDisk(disk);
                        last = current.getNext();
                } 


                else if (!current.getNext().isEmpty() && disk > current.getNext().peekDisk()){
                    current.getNext().getNext().pushDisk(disk);
                    last= current.getNext().getNext();
                }
                
                else {
                    current.getNext().getNext().pushDisk(disk);
                    last= current.getNext().getNext().getNext();

                }
                
            } 
            
            System.out.println();
            System.out.printf("%4d. Move disk %d from %s to %s%n", i, disk, current.getName(), last.getName());
            System.out.println();
            System.out.println("        A" + A.toString() + ", "
            + "B" + B.toString() + ", "
            + "C" + C.toString() );
            
            System.out.println();
            
            if (current.getNext().getNext()==last) {
                if ((!current.isEmpty() && current.peekDisk()>current.getNext().peekDisk()) || current.isEmpty()){
                    current=current.getNext();
                    
                }


            }

            if (current.getNext()==last){
                if (current.isEmpty() ||(!current.getNext().getNext().isEmpty() && current.peekDisk()>current.getNext().getNext().peekDisk())){
                    current=current.getNext().getNext();
                }
            }
        }
    }


    
}
