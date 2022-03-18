abstract class Abstract {
    abstract int getInterestRate();
}

class SBI extends Abstract {
    int getInterestRate() {
        return 7;
    }
}

class PNB extends Abstract {
    int getInterestRate() {
        return 8;
    }
}

class TestBank {
    public static void main(String[] args) {
        Abstract b;
        b = new SBI();
        System.out.println("Rate of Interest is: " + b.getInterestRate() + " %");

        b = new PNB();
        System.out.println("Rate of Interest is: " + b.getInterestRate() + " %");
    }
}
