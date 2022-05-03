package Tree.ThreadedBT;

import java.util.Scanner;
import java.util.Stack;

class MyNode{
    private String Phone;
    private MyNode left;
    private MyNode right;
    private boolean rightThread;

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public MyNode getLeft() {
        return left;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public MyNode getRight() {
        return right;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public boolean isRightThread() {
        return rightThread;
    }

    public void setRightThread(boolean rightThread) {
        this.rightThread = rightThread;
    }

    public MyNode(String data){
        Phone = data;
    }
}

public class PhoneThreadedBinaryTree {
    public static String stringToNumber(String str){
        String res="";
        if(str.equalsIgnoreCase("one"))
            res = res + "1";
        else if(str.equalsIgnoreCase("two"))
            res = res + "2";
        else if(str.equalsIgnoreCase("three"))
            res = res + "3";
        else if(str.equalsIgnoreCase("four"))
            res = res + "4";
        else if(str.equalsIgnoreCase("five"))
            res = res + "5";
        else if(str.equalsIgnoreCase("six"))
            res = res + "6";
        else if(str.equalsIgnoreCase("seven"))
            res = res + "7";
        else if(str.equalsIgnoreCase("eight"))
            res = res + "8";
        else if(str.equalsIgnoreCase("nine"))
            res = res + "9";
        else if(str.equalsIgnoreCase("zero"))
            res = res + "0";
        return res;
    }
    public static String wordsToNumbers(String str) {
        String[] words = str.split(" ");
        String temp1, temp2, tempRes = "", res = "";
        Stack<String> sc = new Stack<>();
        for (int i = words.length-1; i>=0; i--) {
            sc.push(words[i]);
        }
        while (!sc.isEmpty()) {
            temp1 = sc.pop();
            if (temp1.equalsIgnoreCase("single")) {
                temp2 = stringToNumber(sc.pop());
                res = res + temp2;
            } else if (temp1.equalsIgnoreCase("double")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 2; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("triple")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 3; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("quad")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 4; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("pent")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 5; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("hex")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 6; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("sept")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 7; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("octa")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 8; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("nona")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 9; j++) {
                    res = res + temp2;
                }
            } else if (temp1.equalsIgnoreCase("deca")) {
                temp2 = stringToNumber(sc.pop());
                for (int j = 0; j < 10; j++) {
                    res = res + temp2;
                }
            } else {
                res = res + stringToNumber(temp1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(wordsToNumbers(str));
    }
}
