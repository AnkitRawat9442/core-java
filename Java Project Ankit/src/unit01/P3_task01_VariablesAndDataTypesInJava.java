package unit01;

public class P3_task01_VariablesAndDataTypesInJava {

	public static void main(String[] args) {
		
		DataType obj = new DataType();
		obj.Integer();
		obj.Long();
		obj.Boolean();
        obj.Character();
        obj.Float();
        obj.Double();
	}

}

class DataType {
	
	void Integer() {
		int a = 5;
		System.out.println("this is integar value : " + a); // 5;
	}
	void Long() {
		long a = 567654l;
		System.out.println("this is long value : " + a); // 5;
	}
	
	void Boolean() {
		boolean a =true;
		System.out.println("this is Boolean value : " + a); // true
	}
	void Character () {
		char a = 'a';
		System.out.println("this is Character value : " + a);
	}
	void Float () {
		float f = 4.5f;
		System.out.println("this is float value : " + f);
	}
	void Double() {
		double d = 5555.67d;
		System.out.println("this is double value : " + d);
	}
}