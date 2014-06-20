package tkm.org.crud;



	public class DBClient {

		public enum dbenum {mongodb, redis, cassandra }
		dbenum dbtype;
		
		public CRUD createObj(String dbname) {
			
			dbtype=dbenum.valueOf(dbname);
			CRUD dbclient; 
			switch(dbtype){
			
				case mongodb: dbclient=new cassandraCRUD();
				            break;
				case redis: dbclient=new cassandraCRUD();
							break;
			    case cassandra:dbclient=new cassandraCRUD();
	            			break;
			    	
			    default:dbclient=null;
			
			}
			return dbclient;		
		}
		public DBClient(){
			
		}
		
	}


