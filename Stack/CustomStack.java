public class CustomStack {
    int data[];
    int size=10;
    int ptr =-1;
    public CustomStack(){
        this(10);
    }

    public CustomStack(int size ){
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isfull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop(){
        if(isempty()){
            System.out.println("stack is empty");
            return -1;
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public int peek(){
        if(isempty()){
            System.out.println("empty stack");
        }
        return data[ptr];
    }

    public boolean isfull(){
        return ptr == data.length;
    }
    public boolean isempty(){
        return ptr == -1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.push(20);
        stack.push(40);
        stack.push(30);

        stack.peek();
        
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }

}
