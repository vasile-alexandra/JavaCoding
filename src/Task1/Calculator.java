package Task1;

public class Calculator {
    private float termenUnu;
    private float termenDoi;

    public Calculator(float termenUnu, float termenDoi) {
        this.termenUnu = termenUnu;
        this.termenDoi = termenDoi;
    }

    public Calculator() {
    }

    public float getTermenUnu() {
        return termenUnu;
    }

    public void setTermenUnu(float termenUnu) {
        this.termenUnu = termenUnu;
    }

    public float getTermenDoi() {
        return termenDoi;
    }

    public void setTermenDoi(float termenDoi) {
        this.termenDoi = termenDoi;
    }

    public float adunare() {
        return termenUnu + termenDoi;
    }

    public float scadere() {
        return termenUnu - termenDoi;
    }

    public String numereImpare() {
        StringBuilder rezultat = new StringBuilder();
        for (float i = termenUnu; i <= termenDoi; i++) {
            if (i % 2 != 0) {
                rezultat.append(i);
                if (i != termenDoi) {
                    rezultat.append(", ");
                }
            }
        }
        return rezultat.toString();
    }
}
