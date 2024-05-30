import java.util.Scanner;
public class Main1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans;
        System.out.println("b");
        System.out.println("c");
        System.out.println("ans=");
        ans=in.nextInt();
        switch (ans) {
            case 1:
                int a, b, c, d = 0;
                System.out.println("введите число элементов:");
                a = in.nextInt();
                System.out.println("Введите число А:");
                c = in.nextInt();
                for (; a > 0; a--) {
                    System.out.println("введите число:");
                    b = in.nextInt();
                    if ((b < c) & Math.sqrt(b) % 1 == 0) {
                        System.out.println("число не превосходящее A и имеющ. цел. корень:" + b);
                        d++;
                    } else {
                        System.out.println("число больше либо равно А или не явл. квадратами некоторого натур. числа.");
                    }
                }
                System.out.println("количество чисел, которые не превосходят числа A и являются\n" +
                        "полными квадратами некоторого натурального числа.:" + d);
            case 2:
                int z=0,count=0,count1=0;
                System.out.println("введите число элементов: ");
                z = in.nextInt();
                for (;z>0;z-= 1) {
                    boolean f = true;
                    int flag = 1;
                    double elem;
                    System.out.println("enter the num: ");
                    elem = in.nextDouble();
                    double elem1=elem;
                    do {
                        elem = elem / 10;
                    }
                    while (elem > 10);
                    if (Math.floor(elem)%2==0)

                    {
                        f = false;
                    }
                    do {
                        if (Math.floor(elem) %2 != 0){
                            if (f == false)
                                flag = 0;
                            else {
                                f = false;
                                flag = 1;
                            }
                        }
                        else if (Math.floor(elem) %2==0){
                            if (f == true)
                                flag = 0;
                            else {
                                f = true;
                                flag = 1;
                            }
                        }
                        elem = elem * 10;
                    }
                    while (elem <= elem1);
                    if (flag == 1) {
                        System.out.println("success");
                        count += 1;
                    }
                    else {
                        System.out.println("not success");
                        if (count>count1) {
                            count1 = count;
                            System.out.println("count=" + count1);
                        }
                        count=0;
                    }
                }
                System.out.print("count= "+count);
        }
        while (ans!=2);
    }

}
