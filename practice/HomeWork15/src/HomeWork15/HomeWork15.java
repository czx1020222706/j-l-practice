package HomeWork15;
import java.util.Random;
public class HomeWork15 {
    public static void panduan(int num){
        int b=num/100;      //��λ��
        int s=num%100/10;   //ʮλ��
        int g=num%10;       //��λ��
        if(num%9==0){
            System.out.println(num+"�ܱ�9����");
            if((b+s+g)%9==0){
                System.out.println("ͬʱ"+num+"�ĸ���λ��֮��Ҳ�ܱ�9����");
            }
            else{
                System.out.println("����"+num+"�ĸ���λ��֮�Ͳ��ܱ�9����");
            }
        }
        else
            System.out.println("next test!");
         
    }
    public static void main(String[] args) {
        Random rd=new Random();
        int shu=10+rd.nextInt(90);
        shu =shu *9;
        panduan(shu);
    }
}