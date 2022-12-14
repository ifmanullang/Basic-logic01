package logic;

public class Basic01Soall05 extends BasicLogic{
    public Basic01Soall05(int n) {
        super(n);
    }
    public void isiArray(){
        int deret[] = new int[n];
        // 1  1  1  3  5  9  17  31  57
        for (int i = 0; i < deret.length; i++) {
            if (i == 0 || i == 1 || i == 2) {
                // deret ke i => 0, 1
                deret[i] = 1;
            } else {
                deret[i] = deret[i - 1] + deret[i - 2] + deret[i - 3];
            }
            this.array[0][i] = String.valueOf(deret[i]);
        }
    }
        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
