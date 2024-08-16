public class CharTest {
    public static void main(String[] args) {

        char c = 'A';
        System.out.println("c = " + c); // A 출력이 됨

        int a = 'A';
        System.out.println("a = " + a); // 65

        int b = 'B'+1;
        System.out.println("b = " + b); // 66+1 = 67
        System.out.println("(char)b = " + (char)b); // C가 출력이 됨. 67이 출력되는게 아니고 char(b) 로 형 변환을 해서 C가 출력이 됨.


        //Q. 'A'라는 한글 한 문자를 변수에 저장하고 출력하시오.
        char han='가';
        System.out.println("han = " + han); // '가' 가 출력이 됨
        int hanD='가'; //44032
        System.out.println("hanD = " + hanD);

        //Q. 대문자 'A'를 문자 'a'로 변환하여 출력하시오(ASCII코드 표 참고)
        char upper ='A';
        char lower = (char)(upper + 32);
        System.out.println("lower = " + lower); //'a'

        char lower1='u'; //117
        int upper1 = lower1-32; //117-32=85(u)

        //Q. '1' + '2' = 3이 나오도록 프로그래밍 하시오
        int data = '1' + '2';
        System.out.println("data = " + data); // 99가 출력이 됨

        //'0' = 48
        char i = '1'; // 49-48 = 1
        char j = '2'; // 50-48 = 2
        int sum = (i-48)+(j-48);
        int sum1 = (i-'0')+(j-'0');

        System.out.println("sum = " + sum); // 99가 출력이 됨.
    }
}
