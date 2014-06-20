package tkm.org.crud;

import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.cassandraclient.beans.Device;



public class Main {
	   
	 static Logger log = Logger.getLogger(Main.class.getName());
	
	public static void main ( String[] args ) throws IOException
	    {
	Device d=new Device();
	String Mystring;
	objectInput o=new objectInput();
	 //PropertyConfigurator.configure("log4j.properties");
	//	BasicConfigurator.configure();
		
			
			Scanner s=new Scanner(System.in);
			System.out.println("Select db type");
			System.out.println("1.MongoDB 2.Redis 3.Casandra");
//			log.info("Select db type");
//			log.info("1.MongoDB 2.Redis 3.Casandra");
			int dbchoice=s.nextInt();
			DBClient dbclient=new DBClient();
			CRUD db=null;
			switch(dbchoice){
			case 1:db=dbclient.createObj("mongodb");
				   break;
			
			case 2:db=dbclient.createObj("redis");
			       break;
			      
			case 3:db=dbclient.createObj("cassandra");
				   break;
			       
			}
			int crudchoice;
			do{
			System.out.println("1.Create 2.Read 3.Update 4.Delete 5.Exit");
			//log.info("1.Create 2.Read 3.Update 4.Delete 5.Exit");	
			db.createconn();
			crudchoice=s.nextInt();
			switch(crudchoice){
			case 1:Input ins=new Input();
			       ins.fileinput(db);
			       break;
				   
			case 2://Mystring=o.inputR();
				  long l1=System.currentTimeMillis(),l2,l3;
				   for(int i=0 ;i<10000;++i)
				   db.read(Integer.toString(i));
				   l2=System.currentTimeMillis();
				   l3=l2-l1;
			  System.out.println("Time Elapsed="+l3);
				//   log.info("Time Elapsed="+l3);
				   break;
			case 3:d=o.inputU();
				   db.update(d);
				   break;
			case 4:Mystring=o.inputD();
				   db.delete(Mystring);
				   break;
			case 5://log.debug("Hello this is an debug message");
		           log.info("Exiting!!!");
				   break;	   
			}
			}while(crudchoice!=5);
			s.close();
			 
	    }
	
}
