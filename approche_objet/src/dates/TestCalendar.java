package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {
		// Créer un calendrier avec "Calendar" et ajoute les valeurs
		Calendar calendrier = Calendar.getInstance();
		calendrier.set(Calendar.YEAR, 2016);
		calendrier.set(Calendar.MONTH, Calendar.MAY);
		calendrier.set(Calendar.DAY_OF_MONTH, 19);
		calendrier.set(Calendar.HOUR_OF_DAY, 23);
		calendrier.set(Calendar.MINUTE, 59);
		calendrier.set(Calendar.SECOND, 30);

		// Dit que "date" à les information mise dans "calendrier"
		Date date = calendrier.getTime();

		// Créer un formatage d'affichage
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		// Dit que la date est formater avec le formatage précédent
		String formattedDate = formatter.format(date);
		// Print la date formaté
		System.out.println(formattedDate);

		/*
		 * -----------------------------------------------------------------------------
		 */

		Calendar aujourdhui = Calendar.getInstance();
		aujourdhui.get(Calendar.YEAR);
		aujourdhui.get(Calendar.MONTH);
		aujourdhui.get(Calendar.DAY_OF_MONTH);
		aujourdhui.get(Calendar.HOUR_OF_DAY);
		aujourdhui.get(Calendar.MINUTE);
		aujourdhui.get(Calendar.SECOND);

		// Convertit l'objet Calendar "aujourdhui" en objet Date.
		Date dateaujourdhuiformat = aujourdhui.getTime();

		// Crée un objet SimpleDateFormat avec le format de date "yyyy/MM/dd hh:mm:ss".
		SimpleDateFormat formateurdatetoday = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");

		// Formate la date "dateaujourdhuiformat" en utilisant le format spécifié par
		// "formateurdatetoday".
		String dateaujourdhuiformate = formateurdatetoday.format(dateaujourdhuiformat);

		// Affiche la date formatée "dateaujourdhuiformate" sur la console.
		System.out.println(dateaujourdhuiformate);


		// Formate la date en utilisant les différents formateurs de date avec des
		// locales différentes
		SimpleDateFormat formateurfrancais = new SimpleDateFormat("EEEE dd MMMM yyyy 'à' HH:mm:ss", new Locale("fr"));
		SimpleDateFormat formateurrusse = new SimpleDateFormat("EEEE dd MMMM yyyy 'г.' HH:mm:ss", new Locale("ru"));
		SimpleDateFormat formateurchinois = new SimpleDateFormat("yyyy年MM月dd日 EEEE HH:mm:ss", new Locale("zh"));
		SimpleDateFormat formateurallemand = new SimpleDateFormat("EEEE, dd. MMMM yyyy 'um' HH:mm:ss",
				new Locale("de"));

		// Affiche la date formatée en utilisant les différents formateurs de date avec
		// des locales différentes
		System.out.println("Date en français : " + formateurfrancais.format(dateaujourdhuiformat));
		System.out.println("Date en russe : " + formateurrusse.format(dateaujourdhuiformat));
		System.out.println("Date en chinois : " + formateurchinois.format(dateaujourdhuiformat));
		System.out.println("Date en allemand : " + formateurallemand.format(dateaujourdhuiformat));

	}

}
