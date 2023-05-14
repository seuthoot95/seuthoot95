package study5_0511;

import java.util.Calendar;

public class CalendarTest3 {
	public static void calView(String a) {
		Calendar cal = Calendar.getInstance();
		String[] array = a.split("-"); 
		int y = Integer.parseInt(array[0]);
		int m = Integer.parseInt(array[1])-1;
		cal.set(y, m, 1);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int lastDay=cal.getActualMaximum(Calendar.DATE);		//이달 마지막 날짜
		int ln=0;
		int m1 = m+1;
		System.out.println("\t\t      "+y+"년 "+m1+"월");
		for(int w=1; w<week; w++) {
			
			System.out.print("\t");
			ln++;
		}
		for(int d=1; d<=lastDay; d++) {
			if(d<10) {
				System.out.print(" "+d+"일\t");
				ln++;
			}else {
			
			System.out.print(d+"일\t");
			ln++;
			}
			if(ln==7) {
				System.out.println("");
				ln=0;
				}
			}
	}

	public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.set(2023, 3, 1);
	int week = cal.get(Calendar.DAY_OF_WEEK);
	int lastDay=cal.getActualMaximum(Calendar.DATE);		//이달 마지막 날짜
	int ln=0;
	
	for(int w=1; w<week; w++) {
		
		System.out.print("\t");
		ln++;
	}
	for(int d=1; d<=lastDay; d++) {
		
		System.out.print(d+"일\t");
		ln++;
		
		if(ln==7) {
			System.out.println("");
			ln=0;
			}
		}
	//[5][7]
	System.out.println("");
	System.out.println("");

	System.out.println("");
/*	String[][] table = new String[5][7];
	int qwe = 1;
	for(int i=0; i<5; i++) {
		for(int j=0; j<7; j++) {
			
			table[i][j] = String.valueOf(qwe);
			qwe++;
			
		}
	}

    
    // Print the table
    for (int i = 0; i < table.length; i++) {
        for (int j = 0; j < table[0].length; j++) {
            System.out.print("\t"+table[i][j]);
        }
        System.out.println();
    }
*/

    
    calView("2023-05");

	}

}
