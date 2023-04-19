package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		Date dateAujourdhui = new Date();
        SimpleDateFormat formatJourMoisAnnee = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormateeAujourdhui = formatJourMoisAnnee.format(dateAujourdhui);
        System.out.println("Date d'aujourd'hui : " + dateFormateeAujourdhui);

		Date dateAncienne = new Date(116, 4, 19, 23, 59, 30);
		SimpleDateFormat formatageold = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String olDate = formatageold.format(dateAncienne);
		System.out.println("Date ancienne : " + olDate);

		String newDate = formatageold.format(dateAujourdhui);
		System.out.println("Date d'aujourd'hui : " + newDate);

	}

}
