import java.util.Arrays;
/* ���ڸ� ���ڿ��� ��Ÿ�� ���������� substring or split ������ ���ڷ� ǥ���� �� �ֵ��� ���ڿ��� ������ �ִ� ���� �߿��ϴ�. */
/* ���� +, - ��ȣ�� �����ؾ� �� ��쿡�� split���� ���� �� �迭�� �������ν� ���Ŀ� ��ȣ�� ������� �ʵ��� ���ش�.         */

                    /* �ֿ� �޼ҵ� */       
/*          int -> String : Integer.toString         */
/*          String -> int : Integer.parseInt         */
/* Ư�� ���� �������� ���ڿ� ������  -> ���ڿ�.split("Ư������") */
/* ������ �迭 �������� ���� : Arrays.sort()               */

/* ���� */
/* ������ �迭 �������� ���� : Arrays.sort(arr,Collections.reverseOrder()); */

public class max_min {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        String[] s1 = s.split(" ");
        int[] num = new int[s1.length];
        String answer = "";

        for(int i = 0 ; i < s1.length ; i++){
            num[i] = Integer.parseInt(s1[i]);
        }

        Arrays.sort(num);
        answer = Integer.toString(num[0]) + " " + Integer.toString(num[num.length-1]);
        System.out.println(answer);
    }
}
