package date;

import java.util.Date;
public class Eval {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		Date date1=new Date();
		
		String year=String.format("%tY", date1); //格式化年 _xxxx
		String month=String.format("%tm", date1);	//格式化月_xx
		String day=String.format("%te", date1);		//格式化日_x 
		String hour=String.format("%tH",date1);
		String minute=String.format("%tM", date1);
		String second=String.format("%tS", date1);
		int year1=Integer.valueOf(year).intValue();//将年份从字符串类型转换成整数类型

        
		
		
		System.out.println("今天是:"+year+"年"+month+"月"+day+"日");
		System.out.println("现在是北京时间:"+hour+":"+minute+":"+second);
		if(year1%4==0&&year1%100!=0||year1%400==0){  
            System.out.println(year+"年是闰年");  
        }else{  
            System.out.println(year+"年是平年");  
              }  
	
		
		  
   }  
		
		
		
		
		
		
		
		
		
	

}
