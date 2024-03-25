public class CarTest {
    public static void main(String[] args) {
        //자동차의 정보를 저장 하려고 한다. 변수를 만들어 보자

        String model = "BMW528i";
        System.out.println("model = " + model);
        long distance = 100000L; // L을 붙이면 long형으로 인식을 해서 더 많은 숫자를 인식할 수 있도록 함.
        System.out.println("distance  = " + distance + "km");
        int price =9000000;
        System.out.println("price = " + price);
        String company = "BMW";
        System.out.println("company = " + company);
        char type = 'A';
        System.out.println("type+ \"TYpe\" = " + type+ "TYpe");
        boolean auto = true;
        System.out.println("auto = " + auto);
        int year = 2000;
        System.out.println("year = " + year);
        float gasmi=12.5f; //f형 인지 인식하기 위해서 f를 써줘야함
        System.out.println("gasmi = " + gasmi+ "l");


    }
}
