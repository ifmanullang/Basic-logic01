package logic2;

public class Basic02Soal01 extends BasicLogic{
    public Basic02Soal01(int n) {
        super(n);
    }
    public void isiArray() {
        for (int i = 0; i < this.n; i++) {
            int angka = 1;
            for (int j = 0; j < this.n; j++) {
                if (i == j || i + j == this.n - 1 || i <= this.n && j == this.n-5) {
                    this.array[i][j] = String.valueOf(angka);
                }
                angka ++;
            }
        }
    }

        public void cetakArray() {
        this.isiArray();
        this.print();
    }
}
