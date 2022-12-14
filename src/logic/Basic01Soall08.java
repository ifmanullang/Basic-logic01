package logic;

public class Basic01Soall08 extends BasicLogic{
    public Basic01Soall08(int n) {
        super(n);
    }
    public void isiArray(){
        String[] deret = new String[n];
        char huruf = 'A';
        int angka = 2;
        // isi array
        for (int i = 0; i < n; i++) {
            // genap dulu
            if (i % 2 == 0) {
                deret[i] = String.valueOf(huruf);
            } else {
                deret[i] = String.valueOf(angka);
                angka += 2;
            }
            huruf++;
            this.array[0][i] = String.valueOf(deret[i]);
        }
    }
        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
