package lottery;

import java.util.Calendar;

public class DatePrinter {

    //캘린더 클래스를 파라미터로 전달받아,
    //그 객체가 포함하고 있는 시각을 출력하는 메서드
    public static void printDateTime(Calendar cal) {

        //년, 월, 일, 시, 분, 초 => 24시간제
        int yy = cal.get(Calendar.YEAR);

        //자바에서 월은 0월부터 시작!!
        int mm = cal.get(Calendar.MONTH) + 1 ;      // 월 추출
        int dd = cal.get(Calendar.DAY_OF_MONTH)  ;  // 일 추출
        int hh = cal.get(Calendar.HOUR_OF_DAY);     //시 추출
        int mi = cal.get(Calendar.MINUTE);          //분 추출
        int ss = cal.get(Calendar.SECOND);          //초 추출

    }
}
