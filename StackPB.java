import java.util.Stack;
//push at bottom of stack
class StackPB
{
    static void pushAtBottom(int data,Stack<Integer> s)
    {
        if(s.isEmpty())
        {         
        s.push(data);
        return;         
        }                
        int top=s.pop();
        pushAtBottom(data,s);//call function recursivaly for only one data(50)
        s.push(top);

    }
    public static void main(String arg[])
    {

        Stack<Integer> s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushAtBottom(50,s);
        
        while(!s.isEmpty())
        {
        System.out.println(s.peek());
        s.pop();
        }
    }
} 
/*
| 30 |   pop element recursively one by one  |--|50|              |30|         
| 20 |                                       |10|10|              |20|
| 10 |                                       |20|20|              |10|
|_--_|                                       |30|30|              |50|
                                                |--|              |--|
stack                                    recursive stack       final stack
*/