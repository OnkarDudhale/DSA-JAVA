import java.util.*;
 
class StackAList {
    class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size()==0;//return true or false
        }

        void push(int data) {
            list.add(data);
        }

        int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }
    }

    public static void main(String arg[]) {
        Stack sl=new Stack();
        Scanner sc=new Scanner(System.in);

         System.out.println("Enter Limit for List:");
         int n=sc.nextInt();

         System.out.println("Enter Elements:");
         for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            sl.push(data);
        }

        while (!sl.isEmpty()) {
            int val = sl.pop();
            System.out.println(val);
        }
    }
}
