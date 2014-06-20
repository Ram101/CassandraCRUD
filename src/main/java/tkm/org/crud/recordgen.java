package tkm.org.crud;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.kohsuke.randname.RandomNameGenerator;

import com.cassandraclient.beans.*;
import com.google.gson.Gson;

public class recordgen {

	public static void main(String arg[]) {
		
		Gson g = new Gson();
		Device d = new Device();
		int i, gen = 10000000;
		Random r = new Random();
		RandomNameGenerator rnd = new RandomNameGenerator(0);
		Date D = new Date();
		try {
			PrintWriter writer;
			try {
				writer = new PrintWriter("E:/inputdata1.json", "UTF-8");
				for (i = 0; i < 1000000; ++i) {
					d.setUdid(Integer.toString(i));
					d.setFriendlyname(rnd.next());
					d.setSerialnum(r.nextInt(gen));
					d.setManidate(D.toString());
					writer.println(g.toJson(d));

				}
				writer.close();

			} catch (Exception O) {
				System.out.println(O.getMessage());
			}
		} catch (Exception E) {
			System.out.println(E.getMessage());
		}
	}

}
