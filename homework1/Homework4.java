public class Homework4 {
    public static void main(String[] args) {
        Nation4 nation = new Nation4();   // 클래스 인스턴스화
        // nation.name = "한국"; // 에러 : private이기 때문에 에러 발생
        nation.population = 123;
        nation.setName("한국");         // 메소드 실행
        nation.setSize(10000);          // 메소드 실행
        nation.setPopulation(5000);     // 메소드 실행

        nation.showPlanetName();
        nation.setPlanetName("지구");

        Nation4 nation2 = new Nation4();   // 클래스 인스턴스화
        Nation4 nation3 = new Nation4();   // 클래스 인스턴스화

        nation2.showPlanetName();
        nation3.showPlanetName();

        nation.setPlanetName("화성");
        
        nation.showPlanetName();
        nation2.showPlanetName();
        nation3.showPlanetName();
    }
}

// 클래스 생성 코드
class Nation4 {
    static private String planetName;
    private String name;
    public int size;
    public int population;

    void showPlanetName() {
        System.out.println(this.planetName);
    }

    void setPlanetName(String planetName) {
        this.planetName = planetName;
        System.out.println(this.planetName);
    }

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