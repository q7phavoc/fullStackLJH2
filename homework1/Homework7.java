public class Homework7 {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.genarateLottoNumbers();
        lotto.showNumbers();
    }
}

class Lotto {
    public int number1;
    public int number2;
    public int number3;
    public int number4;
    public int number5;
    public int number6;

    public void genarateLottoNumber1() {
        this.number1 = ((int) (Math.random() * 45)) + 1;
    }

    public void genarateLottoNumber2() {
        this.number2 = ((int) (Math.random() * 45)) + 1;
        while (this.number1 == this.number2) {
            this.number2 = ((int) (Math.random() * 45)) + 1;
        }
    }

    public void genarateLottoNumber3() {
        this.number3 = ((int) (Math.random() * 45)) + 1;
        while (this.number1 == this.number3
                || this.number2 == this.number3) {
            this.number2 = ((int) (Math.random() * 45)) + 1;
        }
    }

    public void genarateLottoNumber4() {
        this.number4 = ((int) (Math.random() * 45)) + 1;
        while (this.number1 == this.number4
                || this.number2 == this.number4
                || this.number3 == this.number4) {
            this.number4 = ((int) (Math.random() * 45)) + 1;
        }
    }

    public void genarateLottoNumber5() {
        this.number5 = ((int) (Math.random() * 45)) + 1;
        while (this.number1 == this.number5
                || this.number2 == this.number5
                || this.number3 == this.number5
                || this.number4 == this.number5) {
            this.number5 = ((int) (Math.random() * 45)) + 1;
        }
    }

    public void genarateLottoNumber6() {
        this.number6 = ((int) (Math.random() * 45)) + 1;
        while (this.number1 == this.number6
                || this.number2 == this.number6
                || this.number3 == this.number6
                || this.number4 == this.number6
                || this.number5 == this.number6) {
            this.number6 = ((int) (Math.random() * 45)) + 1;
        }
    }

    public void genarateLottoNumbers() {
        genarateLottoNumber1();
        genarateLottoNumber2();
        genarateLottoNumber3();
        genarateLottoNumber4();
        genarateLottoNumber5();
        genarateLottoNumber6();
    }

    public void showNumbers() {
        System.out.println(this.number1);
        System.out.println(this.number2);
        System.out.println(this.number3);
        System.out.println(this.number4);
        System.out.println(this.number5);
        System.out.println(this.number6);
    }

}