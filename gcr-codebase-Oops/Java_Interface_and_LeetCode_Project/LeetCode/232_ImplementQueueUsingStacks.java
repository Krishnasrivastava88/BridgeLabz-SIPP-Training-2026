import java.util.*;
class MyQueue{
 Stack<Integer> in=new Stack<>(),out=new Stack<>();
 public void push(int x){in.push(x);} private void move(){if(out.empty())while(!in.empty())out.push(in.pop());}
 public int pop(){move();return out.pop();}
 public int peek(){move();return out.peek();}
 public boolean empty(){return in.empty()&&out.empty();}
}