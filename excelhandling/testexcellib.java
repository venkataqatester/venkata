package excelhandling;

import utils.Excellib;

public class testexcellib {

	public static void main(String[] args) {
Excellib xl = new Excellib("./test data/data.xlsx");
int count=xl.getrowcount(0);
for(int i=0;i<count;i++)
{

String c0=xl.getcelldata(0, i, 0);
String c1=xl.getcelldata(0, i, 1);
String c2=xl.getcelldata(0, i, 2);
System.out.println(c0+" "+c1+" "+c2);
	}

}
}
