package test;
import perkuliahan.Penilaian;

public class TestRunner {
	public static void main(String[] args) {
		Penilaian penilain = new Penilaian();

		System.out.println(penilain.hitungNilaiHuruf(65, 100, 80, 95, 100));
		System.out.println(penilain.hitungNilaiHuruf(80 ,90 ,90 ,90 ,95));
		System.out.println(penilain.hitungNilaiHuruf(95 ,90 ,95 ,100 ,80));
		System.out.println(penilain.hitungNilaiHuruf(75 ,65 ,85 ,70 ,55));
		System.out.println(penilain.hitungNilaiHuruf(60 ,60 ,65 ,60 ,60));
		System.out.println(penilain.hitungNilaiHuruf(50 ,70 ,50 ,50 ,50));
	}                                                    
}




