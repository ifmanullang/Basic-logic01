package logic;

public class Basic01Soall07 extends BasicLogic {
    public Basic01Soall07(int n) {
        super(n);
    }

    public void isiArray() {
        String[] deret = new String[n];
        char huruf = 'A';
        // isi array
        for (int i = 0; i < n; i++) {
            deret[i] = String.valueOf(huruf);
            huruf++;
            this.array[0][i] = String.valueOf(deret[i]);
        }

    }

        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
