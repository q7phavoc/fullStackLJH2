import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// 과제7) ArrayList에 현재시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(기본)
// 과제8) ArrayList에 내일시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(심화)
// 과제9) ArrayList에 1년 이내의 날짜를 random하게 만들어서 입력하고, 현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.(심화)
// 과제10) 키보드 입력으로 오늘 이후 부터 7일 이내의 날짜를 5개 입력받아 Airplane 객체의 출발날짜로 입력한 배열을 만드시오. 도착날짜는 출발날짜 + 1
// 3명의 Human 객체배열을 만들고, 무작위로 speed(7 이내)와 direction(국내선, 국제선 중에 1개의 값)을 세팅하시오.
// 현재 시간을 기준으로 비행기편과 그 비행기편의 날짜가 사용가능한 Human의 정보를 출력하시오. speed는 1 = 1일로 가정
public class Collection {
    public static void main(String[] args) {
        ArrayList<Date> list = new ArrayList<>();
        list.add(new Date());
        print(list);

        list.add(new Date(System.currentTimeMillis() + 86400000));
        print(list);

        long year = (int) (Math.random() * 31536000000l);

        list.add(new Date(System.currentTimeMillis() + year));
        printDuration(list);

        Scanner scanner = new Scanner(System.in);
        ArrayList<Airplane> airplaneList = new ArrayList<>();

        // for (int i = 0; i < 2; i++) {
        // String date = scanner.nextLine();
        // Airplane airplane = new KoreanAir();
        // Calendar cal = Calendar.getInstance();
        // cal.set(Calendar.YEAR, Integer.parseInt(date.split("-")[0]));
        // cal.set(Calendar.MONTH, Integer.parseInt(date.split("-")[1]));
        // cal.set(Calendar.DATE, Integer.parseInt(date.split("-")[2]));
        // airplane.setDepartureDate(cal);

        // cal.add(Calendar.DATE, 1);
        // airplane.setArrivalDate(cal);
        // airplaneList.add(airplane);
        // }

        for (int i = 0; i < 60; i++) {
            Airplane airplane = new KoreanAir();
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, 2022);
            cal.set(Calendar.MONTH, 0);
            cal.set(Calendar.DATE, (int) (Math.random() * 3));
            airplane.setDepartureDate(cal);

            cal.add(Calendar.DATE, 1);
            airplane.setArrivalDate(cal);
            airplaneList.add(airplane);
        }

        scanner.close();

        for (Airplane airplane : airplaneList) {
            System.out.println(airplane.getDepartureDate());
        }

        ArrayList<Human> humanList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            Human human = new Human();
            human.speed((int) (Math.random() * 7));
            String direction = "";
            int num = (int) (Math.random() * 10);
            System.out.println(num);
            switch (num) {
                case 0:
                    direction = "김포";
                    break;
                case 1:
                    direction = "인천";
                    break;
                case 2:
                    direction = "김해";
                    break;
                case 3:
                    direction = "제주";
                    break;
                case 4:
                    direction = "울산";
                    break;
                case 5:
                    direction = "도쿄";
                    break;
                case 6:
                    direction = "상하이";
                    break;
                case 7:
                    direction = "홍콩";
                    break;
                case 8:
                    direction = "싱가폴";
                    break;
                case 9:
                    direction = "쿠알라룸푸르";
                    break;
            }
            human.run(direction);
            human.setName("이름" + i);
            humanList.add(human);
        }
        System.out.println(humanList.size());
        print(humanList, airplaneList);
    }

    static void print(ArrayList<Date> list) {
        for (Date date : list) {
            System.out.println(date.getTime());
        }
    }

    static void printDuration(ArrayList<Date> list) {
        for (Date date : list) {
            System.out.println(date.getTime() - System.currentTimeMillis());
        }
    }

    static void print(ArrayList<Human> humanList, ArrayList<Airplane> airplaneList) {
        System.out.println();
        System.out.println(humanList.size());
        System.out.println(airplaneList.size());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for (Airplane airplane : airplaneList) {
            for (Human human : humanList) {
                System.out.println(airplane.getDepartures() + " ===> " + human.getDirection());
                if (airplane.getDepartures().equals(human.getDirection())) {
                    Calendar cal = airplane.getDepartureDate();
                    if ((int) ((cal.getTimeInMillis() - System.currentTimeMillis()) / 86400000l) <= human.getSpeed()) {
                        System.out.println(human.getName() + "님은" + sdf.format(airplane.getDepartureDate().getTime()) + "에 탑승자입니다.");
                    } else {
                        System.out.println("시간이 일치하지 않습니다.");    
                    }
                } else {
                    System.out.println("탑승지가 일치하지 않습니다.");
                }
            }
        }
    }

}
// 과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
// 과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를 만드시오. location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
// 과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. Tiger class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화)
// 과제4) Airplane 추상 클래스를 만들고 출발날짜과 도착날짜을 Calendar 객체로 받는 setter를 만드시오.
// main에서 객체를 생서후 setter를 통해서 출발날짜 2022년 2월 1일, 도착날짜 2022년 2월 2일로 지정하시오.(기본)
// 과제5) 출발지와 도착지를 멤버변수로 만들고, 추상메소드로 국내선인지 국외선인지를 입력받는 메소드를 만드시오.
// 출발날짜와 도착날짜를 getter로 만들고, 02-01-2021 형식으로 출력하는 메소드를 만드시오.(심화)
// 국내선 : 1. 김포, 2. 인천, 3. 김해, 4. 제주, 5. 울산
// 국제선 : 1. 도쿄, 2. 상하이, 3. 홍콩, 4. 싱가폴, 5. 쿠알라룸푸르
// 과제6) Airplane 추상 클래스에 String flight() 추상 메소드를 구현하시오. 자식 클래스에서 도착지가 국내선 또는 국제선에 따라서
// Airplane 멤버변수 isDomestic 의 값을 변경하도록 구현하시오.(심화)
// 과제7) ArrayList에 현재시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(기본)
// 과제8) ArrayList에 내일시간의 Date 객체를 입력하고, ArrayList의 값을 차례대로 출력하시오.(심화)
// 과제9) ArrayList에 1년 이내의 날짜를 random하게 만들어서 입력하고, 현재 들어있는 3개의 값과 현재시간의 차이를 순차대로 출력하시오.(심화)
// 과제10) 키보드 입력으로 오늘 이후 부터 7일 이내의 날짜를 5개 입력받아 Airplane 객체의 출발날짜로 입력한 Arraylist를 만드시오. 도착날짜는 출발날짜 + 1
// 3명의 Human 객체 Arraylist를 만들고, 무작위로 speed(7 이내)와 direction(국내선, 국제선 중에 1개의 값)을 세팅하시오.
// 현재 시간을 기준으로 비행기편과 그 비행기편의 날짜가 사용가능한 Human의 정보를 출력하시오. speed는 1 = 1일로 가정
// + 비행기편은 1년 -> 3일로 변경
// + 입력은 Scanner가 아닌 자동생성코드도 괜찮음
