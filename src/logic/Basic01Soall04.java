package logic;

public class Basic01Soall04 extends BasicLogic {
    public Basic01Soall04(int n) {
        super(n);
    }

    public void isiArray() {
        int deret[] = new int[n];
        // 1  1  2  3  5  8 13  21
        for (int i = 0; i < deret.length; i++) {
            if (i == 0 || i == 1) {
                // deret ke i => 0, 1
                deret[i] = 1;
            } else {
                deret[i] = deret[i - 1] + deret[i - 2];
            }
            this.array[0][i] = String.valueOf(deret[i]);
        }

    }

        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
