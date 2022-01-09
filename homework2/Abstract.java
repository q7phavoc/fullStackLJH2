import java.util.Calendar;

public class Abstract {
    public static void main(String[] args) {

    }
}

// 과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
// main에서 객체를 생서후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)
// 과제5) 출발지와 도착지를 멤버변수로 만들고, 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
// 출발날짜와 도착날짜를 getter로 만들고, 02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화)
// 국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산
// 국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르
abstract class Airplane {
    private String departures;
    private String arrivals;
    private Calendar departureDate;
    private Calendar arrivalDate;
    private boolean isDomestic;

    Airplane() {
        this.departures = "김포";
    }

    public void domesticFlight(String arrivals) {
        this.arrivals = arrivals;
        this.isDomestic = true;
    }

    public void internationalFlight(String arrivals) {
        this.arrivals = arrivals;
        this.isDomestic = false;
    }

    abstract String flight(String arrivals);

    public String getDepartures() {
        return departures;
    }

    public Calendar getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Calendar departureDate) {
        this.departureDate = departureDate;
    }

    public Calendar getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Calendar arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setArrivals(String arrivals) {
        this.arrivals = arrivals;
    }

    public void setDepartures(String departures) {
        this.departures = departures;
    }

}

// 과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는
// 국제선에 따라서 Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)
class KoreanAir extends Airplane {

    @Override
    String flight(String arrivals) {
        if (arrivals.equals("김포") || arrivals.equals("인천") || arrivals.equals("김해")
                || arrivals.equals("제주") || arrivals.equals("울산")) {
            domesticFlight(arrivals);
            return arrivals;
        } else if (arrivals.equals("도쿄") || arrivals.equals("상하이") || arrivals.equals("홍콩")
                || arrivals.equals("싱가폴") || arrivals.equals("쿠알라룸푸르")) {
            internationalFlight(arrivals);
            return arrivals;
        }
        return "운항하지 않습니다.";
    }

}
