package Linked_List.SinglyGLL;

import java.util.Scanner;

public class GenericLLImplementation {
    public static void main(String[] args) {
        GenericLL<Item> linkedList=new GenericLL<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nGeneric LinkedList Operations\n\n1. Insert\n2. Traverse/Print\n3. Access by position\n4. Size\n5. Exit");
        lp: while (true) {
            System.out.print("\nEnter a choice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("\nInsert Operations\n\n1. Insert at Start\n2. Insert at End\n3. Insert at Position\n4. Exit Insertion");
                    lq: while (true) {
                        System.out.print("\nEnter a choice: ");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.print("Enter the Item ID, Item Name, and Item Price(in double datatype): ");
                                linkedList.addAtFirst(new Item(sc.nextInt(), sc.nextLine(), sc.nextDouble()));
                            }
                            case 2 -> {
                                System.out.print("Enter the Item ID, Item Name, and Item Price(in double datatype): ");
                                linkedList.addAtLast(new Item(sc.nextInt(), sc.nextLine(), sc.nextDouble()));
                            }
                            case 3 -> {
                                System.out.print("Enter the position, Item ID, Item Name, and Item Price(in double datatype): ");
                                linkedList.addAtPos(sc.nextInt(), new Item(sc.nextInt(), sc.nextLine(), sc.nextDouble()));
                            }
                            case 4 -> {
                                break lq;
                            }
                            default -> System.out.println("Invalid Choice!");
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Linked List => ");
                    System.out.print(linkedList.toString());
                }
                case 3 -> {
                    System.out.print("Enter the position: ");
                    System.out.println(linkedList.getNode(sc.nextInt()-1));
                }
                case 4 -> {
                    System.out.println("Size of linked list = "+linkedList.size());
                }
                case 5 -> {
                    break lp;
                }
                default -> System.out.println("!Invalid Choice!");
            }
        }

    }
}
