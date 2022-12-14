package logic;

public class Basic01Soall03 extends BasicLogic{
    public Basic01Soall03(int n) {
        super(n);
    }
    public void isiArray(){
        int deret[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                deret[i] = 0;
            }else{
                deret[i] = i*2;
            }
            this.array[0][i] = String.valueOf(deret[i]);
        }
    }

        public void cetakArray() {
        this.isiArray();
        this.printSingle();
    }
}


