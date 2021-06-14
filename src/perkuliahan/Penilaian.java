package perkuliahan;

public class Penilaian {

	public char hitungNilaiHuruf(int nilaiMat, int nilaiFisika, int nilaiKimia, int nilaiBiologi, int nilaiKomputer) {
		int totalSemuaNilai = nilaiMat + nilaiFisika + nilaiKimia + nilaiBiologi + nilaiKomputer;
		int jumlahMatKul = 5;
		double AvgNilai = totalSemuaNilai / 5;
		
		if(AvgNilai <= 100 && AvgNilai >= 59){
			if(AvgNilai <= 89 || AvgNilai >= 80){
				return 'B';
			}else if(AvgNilai <= 79 || AvgNilai >= 70){
				return 'C';
			}else if(AvgNilai <= 69 || AvgNilai >= 60){
				return 'D';
			}
			return 'A';
		}else{
			return 'E';
		}

	}
}
