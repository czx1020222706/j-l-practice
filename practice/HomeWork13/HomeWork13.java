package HomeWork13;
import java.util.Random;;
public class HomeWork13 {
    public static void main(String[] args) {
        /*
         * ��֤����Ȳ��롱����������Ȼ��������������
         * �Ͷ�������3�ټ�1������ ż�����Ͷ�������2��
         * �����õ�һ��������
         * �ٰ��������������м��㣬
         * һֱ�� ����ȥ�����ձ�Ȼ�õ�1�� */
        int num;
        Random rd=new Random();
        //Integer.MAX_VALUEΪ��������
        num=1+rd.nextInt(Integer.MAX_VALUE);//�������ķ�Χ-2[31]----2[31]-1
        //System.err.println(rd.nextInt(100));//������>=0��<100
        System.out.println("ԭ������Ϊ"+num);
        while(num!=1){
            System.out.println("������������"+num);
            if(num%2==0){
                //ż��
                num=num/2;
            }
            else{
                num=num*3+1;
            }
        }
        System.out.println(num);
    }
}
