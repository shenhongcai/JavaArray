package date;

import java.util.Date;
public class Eval {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������

		Date date1=new Date();
		
		String year=String.format("%tY", date1); //��ʽ���� _xxxx
		String month=String.format("%tm", date1);	//��ʽ����_xx
		String day=String.format("%te", date1);		//��ʽ����_x 
		String hour=String.format("%tH",date1);
		String minute=String.format("%tM", date1);
		String second=String.format("%tS", date1);
		int year1=Integer.valueOf(year).intValue();//����ݴ��ַ�������ת������������

        
		
		
		System.out.println("������:"+year+"��"+month+"��"+day+"��");
		System.out.println("�����Ǳ���ʱ��:"+hour+":"+minute+":"+second);
		if(year1%4==0&&year1%100!=0||year1%400==0){  
            System.out.println(year+"��������");  
        }else{  
            System.out.println(year+"����ƽ��");  
              }  
	
		
		  
   }  
		
		
		
		
		
		
		
		
		
	

}
