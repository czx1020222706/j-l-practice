package HomeWork01;
import java.util.Scanner;

public class HomeWork01 {
    static int number=4;        //����4���������������                   
    static int[] t1 = new int[number];           
    public static void main(String[] args) {
        HomeWork01 jiejie=new HomeWork01();
        jiejie.shunxun();
    }
    void shunxun(){
                System.out.println("������4������");
                Scanner in_t1 = new Scanner(System.in);//ѭ����������
                for(int i=0;i<number;i++){
                    t1[i]=in_t1.nextInt();}       
                for (int i = 0; i < t1.length; i++) {
                    int pos = i;
                    for (int j = i + 1; j < t1.length; j++) {
                        if (t1[pos] > t1[j])
                            pos = j;
                    }
                    if (pos != i) {
                        t1[i] = t1[i] + t1[pos];
                        t1[pos] = t1[i] - t1[pos];
                        t1[i] = t1[i] - t1[pos];
                    }
                }
                     
                for (int i = t1.length - 1; i >= 0; i--)
                    System.out.print(t1[i] + "\t");
    }
}