package logic;

public class Basic01Soall09 extends BasicLogic{
    public Basic01Soall09(int n) {
        super(n);
    }
    public void isiArray(){
        int deret[] = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int) Math.pow(3, i);
            this.array[0][i] = String.valueOf(deret[i]);
        }
    }
        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}
