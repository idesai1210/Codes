
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexMatcher {
		public static void main(String[] args) {
			
			String text = "";
			try
			{
				BufferedReader br = new BufferedReader(new FileReader("Sample2.txt"));
				String CurrentLine;

				while ((CurrentLine = br.readLine()) != null) {
					text += CurrentLine;
				}
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			
			final String regex = "(\\d{4}-\\d{2}-\\d{2}|\\d{2}\\/\\d{2}\\/\\d{4})";
			final String string = "\"this is an example in itself that was created on 01/23/2016, but\n\n"
				 + "subject to change without notice!\"\n\n"
				 + "\"this is an example in itself that was created on 2016-01-23, but\n\n"
				 + "subject to change without notice!\"";

			final Pattern pattern = Pattern.compile(regex);
			final Matcher matcher = pattern.matcher(text);

			while(matcher.find()) {
				//System.out.println(matcher.groupCount());
			    System.out.println("Full match: " + matcher.group(0));
			    for (int i = 1; i <= matcher.groupCount(); i++) {
			        System.out.println("Group " + i + ": " + matcher.group(i));
			    }
			}
		}
}
