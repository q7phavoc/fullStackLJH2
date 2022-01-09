public class Interface {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal animal = new Tiger();
    }
}

// 과제1) Runnable 인터페이스를 상속받은 Human 클래스를 만드시오. (기본)
interface Runnable {
    void run(String direction);

    void speed(int speed);
}

class Human extends Animal implements Runnable, Speak {

    private String direction;
    private int speed;

    @Override
    public void speed(int speed) {
    }

    @Override
    public void run(String direction) {
        this.direction = direction;
    }

    @Override
    public void silent() {
    }

    @Override
    public int loud() {
        return 0;
    }

    public String getDirection() {
        return this.direction;
    }

    public int getSpeed() {
        return this.speed;
    }
}

// 과제2) class Animal 을 만들고 멤버변수 name과 location을 private로 지정하고 getter와 setter를
// 만드시오. location 은 land, sea, air 만 입력 할 수 있도록 하시오.(심화)
class Animal {
    private String name;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location.equals("land") || location.equals("sea") || location.equals("air"))
            this.location = location;
        System.out.println("land, sea, air 외에는 입력 할 수 없습니다.");
    }

}

// 과제3) Speak 인터페이스에 silent와 loud 기능을 만들고 Human class에 implements 하시오. Tiger
// class를 만들고 객체를 생성한 후 부모 클래스인 Animal class로 변수를 받으시오.(심화)
interface Speak {
    void silent();

    int loud();
}

class Tiger extends Animal {

}
