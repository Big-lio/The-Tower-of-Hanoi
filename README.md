# The-Tower-of-Hanoi


The puzzle begins with the disks stacked on one rod in order of decreasing size, the smallest at the top, thus approximating a conical shape.
The objective of the puzzle is to move the entire stack to one of the other rods, obeying the following rules:

1. Only one disk may be moved at a time.
2. Each move consists of taking the upper disk from one of the stacks and placing it on top of another stack or on an empty rod.
3. No disk may be placed on top of a disk that is smaller than it. With three disks, the puzzle can be solved in seven moves. The minimal number of moves
   required to solve a Tower of Hanoi puzzle is exponential, 2n– 1, where n is the number of disks.
   
Finding a sequence of moves is an intelligent task. Intelligence is hidden in the recursive algorithm below:
  1. Move n – 1 disks from A to B.
  2. Move disk n from A to C.
  3. Move n – 1 disks from B to C.

The sequence of moves for n=3:
Initial state A=(3,2,1), B=(), C=().
1. Move disk 1 from A to C. A=(3,2), B=(), C=(1).
2. Move disk 2 from A to B. A=(3), B=(2), C=(1).
3. Move disk 1 from C to B. A=(3), B=(2,1), C=().
4. Move disk 3 from A to C. A=(), B=(2,1), C=(3).
5. Move disk 1 from B to A. A=(1), B=(2), C=(3).
6. Move disk 2 from B to C. A=(1), B=(), C=(3,2).
7. Move disk 1 from A to C. A=(), B=(), C=(3,2,1).
