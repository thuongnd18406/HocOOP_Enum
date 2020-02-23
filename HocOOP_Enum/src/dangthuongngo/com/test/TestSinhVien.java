package dangthuongngo.com.test;

import java.util.ArrayList;

import dangthuongngo.com.model.SinhVIen;

public class TestSinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<SinhVIen>dsSV=new ArrayList<SinhVIen>();
		dsSV.add(new SinhVIen(1, "Teo", 6));
		dsSV.add(new SinhVIen(2, "Meo", 2));
		dsSV.add(new SinhVIen(3, "Dan", 7));
		dsSV.add(new SinhVIen(4, "Suu", 8));
		System.out.println("Danh SachSinh VIen");
		for(SinhVIen sv: dsSV)
		{
			System.out.println(sv);
		}
			
	}

}
