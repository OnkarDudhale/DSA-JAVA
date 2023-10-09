import java.util.Stack;
//iterative approach
class StackReverse
{
    public static void main(String arg[])
    {
        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        
        int arr[]=new int[4];;;
        int i=0;
        while(!s.isEmpty())
        {
          arr[i]=s.pop();
          i++;
        }
        for(int j=0;j<arr.length;j++)
        s.push(arr[j]);

        while(!s.isEmpty())
        {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
