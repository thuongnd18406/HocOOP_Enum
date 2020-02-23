package dangthuongngo.com.model;

public enum XepLoai {
	Gioi("Gioi"), 
	Kha("Kha"), 
	TrungBinh("TrungBinh"), 
	Yeu("Yeu");
	private String msg;
	XepLoai(String msg){
		this.msg=msg;
	}
	public String description()
	{
		return this.msg;
	}
}
