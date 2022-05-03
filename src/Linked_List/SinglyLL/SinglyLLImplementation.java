package Linked_List.SinglyLL;

import java.util.Scanner;

public class SinglyLLImplementation {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLinkedList Operations\n\n1. Insert\n2. Traverse/Print\n3. Delete\n4. Access by position\n5. Access by Data\n6. Size\n7. Exit");
        lp: while (true) {
            System.out.print("\nEnter a choice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.println("\nInsert Operations\n\n1. Insert at Start\n2. Insert at End\n3. Insert at Position\n4. Exit Insertion");
                    lq: while (true) {
                        System.out.print("\nEnter a choice: ");
                        switch (sc.nextInt()) {
                            case 1 -> {
                                System.out.print("Enter the data: ");
                                list.insertAtStart(sc.nextInt());
                            }
                            case 2 -> {
                                System.out.print("Enter the data: ");
                                list.insertAtLast(sc.nextInt());
                            }
                            case 3 -> {
                                System.out.print("Enter data and position of the node respectively: ");
                                list.insertAtPosition(sc.nextInt(), sc.nextInt());
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
                    list.display();
                }
                case 3 -> {
                    System.out.println("\nDelete Operations\n\n1. Delete from Start\n2. Delete from End\n3. Delete from Position\n4. Exit Deletion");
                    lq:
                    while (true) {
                        System.out.print("\nEnter a choice: ");
                        switch (sc.nextInt()) {
                            case 1 -> list.deletionFromStart();
                            case 2 -> list.deletionFromLast();
                            case 3 -> {
                                System.out.print("Enter position of the node: ");
                                list.DeleteFromPosition(sc.nextInt());
                            }
                            case 4 -> {
                                break lq;
                            }
                            default -> System.out.println("Invalid Choice!");
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Enter the position: ");
                    System.out.println(list.positionAccess(sc.nextInt()));
                }
                case 5 -> {
                    System.out.print("Enter the Roll No.: ");
                    list.dataAccess(sc.nextInt());
                }
                case 6 -> {
                    System.out.println("Size of linked list = "+list.count());
                }
                case 7 -> {
                    break lp;
                }
                default -> System.out.println("!Invalid Choice!");
            }
        }
    }
}
