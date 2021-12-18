package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        System.out.println(example1(5,10));
        example2(-5);
        System.out.println(example3(15));
        example4("ляляля", 3);

    }

    public static boolean example1(int a, int b){  // 1 задание
        if(a + b >= 10 && a + b <= 20){
            return true;
        }else {
            return false;
        }
    }

    public static void example2(int a){ // 2 задание
        if(a >= 0){
            System.out.println("Число положительное!");
        }else {
            System.out.println("Число отрицательное!");
        }
    }

    public static boolean example3(int a){ // 3 задание
        if(a >= 0){
            return false;
        }else {
            return true;
        }
    }

    public static void example4(String string, int x){ // 4 задание
        for(int i = 0; i < x; i++){
            System.out.println(string);
        }
    }
}
