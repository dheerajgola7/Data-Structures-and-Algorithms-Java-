package Queue;

public class DEQueueUsingArray {
    // In Double Ended Queue insertion and deletion can be performed at both end.
    int arr[];
    int rear;
    int front;

    // parameterised Constructor to create queue
    DEQueueUsingArray(int size)
    {
        rear = -1;
        front = -1;
        arr=new int [size];
    }

    // method to check queue is empty or not
    public boolean isempty()
    {
        return (rear == -1 && front== -1);
    }

    // Method to check queue is full from rear end or not
    public boolean isfullrear()
    {
        boolean response;
        if(rear == arr.length-1)
        {
            response = true;
        }
        else
        {
            response = false;
        }
        return response;
    }

    // Method to check the queue is full from front
    public boolean isfullfront()
    {
        if(front ==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    // Insertion of new element at rear end
    public void insertFromRear(int data)
    {
        if(isfullrear())
        {
            System.out.println("overflow");
        }
        else {
            if (front == -1 && rear == -1) {
                rear = front = 0;
                arr[rear] = data;
            } else {
                rear++;
                arr[rear] = data;
            }
        }
    }

    // insertion of new element at front end
    public void insertFromFront(int data)
    {
        if(isfullfront())
        {
            System.out.println("overflow");
        }
        else
        {
            if(front == -1 && rear ==-1)
            {
                rear= front =0;
                arr[front] = data;
            }
            else
            {
                front--;
                arr[front] = data;
            }
        }
    }

    // deletion of new element at rear end
    public void removeFromRear()
    {
        if(isempty())
        {
            System.out.println("underflow");
        }
        else
        {
            if(rear == front)
            {
                System.out.println(arr[rear]);
                rear = front = -1;
            }
            else
            {
                System.out.println(arr[rear]);
                rear--;
            }
        }
    }

    // deletion of new record at frontend only
    public void removeFromFront() {
        if (isempty()) {
            System.out.println("underflow");
        }
        else
        {
            if (front == rear) {
                System.out.println(arr[front]);
                rear = front = -1;
            } else {
                System.out.println(arr[front]);
                front++;
            }
        }
    }

    // display all the data from the queue
    public void display()
    {
        for(int i =front; i<=rear;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        DEQueueUsingArray obj = new DEQueueUsingArray(5);
        obj.insertFromFront(10);
        // obj.insertfront(14);
        obj.insertFromRear(20);
        obj.insertFromRear(30);
        obj.insertFromRear(40);
        obj.insertFromRear(50);
        //obj.insertFromRear(60);
        //obj.insertFromFront(15);
        System.out.println("print all the data ");
        obj.display();
        System.out.println("delete from front");
        obj.removeFromFront();
        obj.removeFromFront();
        System.out.println("delete from rear");
        obj.removeFromRear();
        System.out.println("insert new value at rear ");
        obj.insertFromRear(90);
        System.out.println("print the data");
        obj.display();
    }
}
