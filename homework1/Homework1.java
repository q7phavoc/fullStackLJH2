class Homework1 {
    public static void main(String[] args) {
        Nation nation = new Nation();   // 클래스 인스턴스화
        nation.setName("한국");         // 메소드 실행
        nation.setSize(10000);          // 메소드 실행
        nation.setPopulation(5000);     // 메소드 실행
    }
}


// 클래스 생성 코드
class Nation {
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