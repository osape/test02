package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd hh:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String formatDate = sdf.format(new Date());
		System.out.println(formatDate);

	}

}
