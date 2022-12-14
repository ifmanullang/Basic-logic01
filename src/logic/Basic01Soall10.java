package logic;

public class Basic01Soall10 extends BasicLogic{
    public Basic01Soall10(int n) {
        super(n);
    }
    public void isiArray(){
        int deret[] = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int) Math.pow(i, 3);
            this.array[0][i] = String.valueOf(deret[i]);
        }
    }
        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
