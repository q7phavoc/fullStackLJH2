public class Homework2 {
    public static void main(String[] args) {
        USA usa = new USA();   // 클래스 인스턴스화
        usa.setState("캘리포니아");         // 메소드 실행

        UK uk = new UK();   // 클래스 인스턴스화
        uk.setColony(true);         // 메소드 실행

        Korea korea = new Korea();   // 클래스 인스턴스화
        korea.setNumOfSubway(100);         // 메소드 실행
    }
}

// 클래스 생성 코드
class Nation2 {
    String name;
    int size;
    int population;

    void setName(String name) {
        this.name = name;
        System.out.println("나라 이름 : " + this.name);
    }

    void setSize(int size) {
        this.size = size;
        System.out.println("면적 : " + this.size);
    }

    void setPopulation(int population) {
        this.population = population;
        System.out.println("인구수 : " + this.population);
    }

}

class USA extends Nation2 {
    String state;

    void setState(String state) {
        this.state = state;
        System.out.println(this.name + " 의 state는 " + this.state + "이 있다.");
    }
}


class UK extends Nation2 {
    boolean isColony;

    void setColony(Boolean isColony) {
        this.isColony = isColony;
        if(this.isColony){
            System.out.println(this.name + " 는 과거에 식민지가 있었습니다. ");
        } else {
            System.out.println(this.name + " 는 과거에 식민지가 없었습니다. ");
        }
        
    }
}

class Korea extends Nation2 {
    int numOfSubway;

    void setNumOfSubway(int numOfSubway) {
        this.numOfSubway = numOfSubway;
        System.out.println("지하철의 수는 " + numOfSubway + "개 입니다.");
    }
}