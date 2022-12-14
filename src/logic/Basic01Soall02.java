package logic;

public class Basic01Soall02 extends BasicLogic {
    public Basic01Soall02(int n) {
        super(n);
    }

    public void isiArray() {
        int deret [] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                deret[i] = 1;
            } else if (i == 1) {
                deret[i] = 3;
            } else if (i % 2 == 0) {
                deret[i] = deret[i - 2] + 1;
            } else {
                deret[i] = deret[i - 2] + 3;
            }
            this.array[0][i] = String.valueOf(deret[i]);
        }


    }

        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}

