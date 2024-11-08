public class CustomQueue {
    int end = -1; // Points to the last element in the queue
    int size;
    int arr[];

    // Default constructor with a queue size of 10
    CustomQueue() {
        this.size = 10; 
        this.arr = new int[size];
    }

    // Constructor with a custom queue size
    CustomQueue(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return end == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return end == size - 1;
    }

    // Insert an element into the queue
    public boolean insert(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        end++;
        arr[end] = data;
        return true;
    }

    // Delete an element from the queue and return it
    public int delete() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE; // Returns a marker for an empty queue
        }
        int start = arr[0];
        // Shift elements to the left to fill the gap
        for (int i = 1; i <= end; i++) {
            arr[i - 1] = arr[i];
        }
        end--; // Adjust end to reflect the new queue end
        return start;
    }

    // Get the first element without removing it
    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE; // Indicator for empty queue
        }
        return arr[0];
    }

    // Main method to test the queue
    public static void main(String[] args) {
        CustomQueue q = new CustomQueue();
        q.insert(1);
        q.insert(2);
        q.insert(3);
        q.insert(4);
        q.insert(5);

        System.out.println("Peek: " + q.peek()); // Peek at the front element
        System.out.println("Deleted: " + q.delete()); // Delete first element
        System.out.println("Deleted: " + q.delete()); // Delete next element
        System.out.println("Peek after deletes: " + q.peek()); // Peek again
    }
}
