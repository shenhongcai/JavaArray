
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Date newdate=new Date();
		SimpleDateFormat date=
				new SimpleDateFormat("yyyy.MM.dd ");
		
		Date wk=new Date();
		SimpleDateFormat week=
				new SimpleDateFormat("E");
		
		Date tm=new Date();
		
		SimpleDateFormat time=
				new SimpleDateFormat("hh:mm:ss");
		
		System.out.println("����:"+date.format(newdate));
		System.out.println("��    :"+week.format(wk));
		System.out.println("ʱ��:"+time.format(tm));
		
		
		
		
		
	}

}
