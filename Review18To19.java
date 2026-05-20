import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Review18To19 {
	public static void main(String[] args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate start = LocalDate.parse("2026/05/01", fmt);
		LocalDate today = LocalDate.parse("2026/05/08", fmt);
		LocalDate deadline = start.plusDays(10);
		
		long remain = ChronoUnit.DAYS.between(today, deadline);
		System.out.println("締め切りまであと" + remain + "日です");
		System.out.println("絶対値表示" + Math.abs(remain));
	}
}
