
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Date newdate=new Date();
		SimpleDateFormat date=
				new SimpleDateFormat("yyyy.MM.dd ");
		
		Date wk=new Date();
		SimpleDateFormat week=
				new SimpleDateFormat("E");
		
		Date tm=new Date();
		
		SimpleDateFormat time=
				new SimpleDateFormat("hh:mm:ss");
		
		System.out.println("日期:"+date.format(newdate));
		System.out.println("周    :"+week.format(wk));
		System.out.println("时间:"+time.format(tm));
		
		
		
		
		
	}

}
