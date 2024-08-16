import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void Task_1(){
        Scanner in = new Scanner(System.in);

        System.out.print(" Введите число a: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();

        if (a>b){
            System.out.print("a>b");
        }else if (a==b){
            System.out.print("a=b");
        }else if(a<b){System.out.print("a<b");}


    }
    public static void Task_2(){
        Scanner in = new Scanner(System.in);

        System.out.print(" Введите строку a: ");
        String a = in.nextLine();

        System.out.print(" Введите строку b: ");
        String b = in.nextLine();

        if (a.equals(b)){
            System.out.print("Строки идентичны");
        }else {System.out.print("Строки не идентичны");}

    }

    public static void Task_3(){
        Scanner in = new Scanner(System.in);
        System.out.print(" В этом задании вы сможете ввести массив в ручную ");
        System.out.print(" Введите количество вводимых символов: ");
       int n = in.nextInt();
    int mas[] = new int[n] ;
        int z;
    for(int i=0; i<mas.length; i++){
        z = i + 1;
        System.out.print("Введите символ " + z + " : ");
        mas[i] = in.nextInt();

    }

    System.out.println("Выдаем все четные ...");
        for(int i=0; i<mas.length; i++){
           if (mas[i]%2 == 0){
               System.out.println(mas[i]);
           }

        }

    }
    public static void main(String[] args) {






        System.out.print("Какое задание хотите проверить: ");
        Scanner in = new Scanner(System.in);
        int numberTask = in.nextInt();

        switch (numberTask){
            case 1:
                Task_1();

                break;

            case 2:
                Task_2();
                break;


            case 3:
                Task_3();
                break;

            default: System.out.println("Error, try again!");
        }

    }
}