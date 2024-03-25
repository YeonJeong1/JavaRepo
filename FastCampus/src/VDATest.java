public class VDATest {
    public static void main(String[] args) {
        //Q. [정수 : int] 한 개를 저장하기 위해서 [변수를 선언] 하시오.
        int v ; // 변수선언 -> 기억공간을 만듬(확보) 
        v = 10;
        System.out.println("v = " + v);

        //Q. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수b에 10을 곱하여 변수c엦 저장하시오. 
        int a = 10; //변수 초기화
        int b  = a;
        int c = b*10;
        System.out.println("c = " + c);

        //Q. sum이라는 변수에 1부터 5까지의 수를 누적(accumlate)해서 출력 하시오.
        int sum = 0; // main변수 안에서 만들어지는 변수를 지역변수라고 하는데 지역변수는 초기화를 해야한다. 초기화를 하지 않으면 값이 쓰레기 값이 들어가기 때문에 연산을 할 수 없음.
        sum= sum+1; // 0+1
        sum= sum+2; // 1+2
        sum= sum+3; //3+3
        sum= sum+4; //6+4
        sum= sum+5; //10+5

        System.out.println("sum = " + sum ); //15
        //sum + i 이 규칙이 생겨서 반복문으로 바꿔서 for문이나 while문으로 만들어줄 수 있음.

        //Q. x = 10, y=20을 저장하고 변수의 값을 서로 교환(swap)하여 출력하시오.
        int x = 10;
        int y = 20;

        System.out.println("x = " + x +":" + "y=" +y);
        //교환(swap)

        int tmp;
        tmp=y;
        y=x;
        x=tmp;
        System.out.println("x = " + x+":"+"y="+y);
    }

}
