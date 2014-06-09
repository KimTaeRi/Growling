package growling;

import com.google.appengine.api.datastore.Key;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable
public class DataStore {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;
	
	@Persistent
	private String id;
	
	@Persistent
	private String content;
	
	//임의로 계속 추가!_!
	
	public DataStore(String id, String content){
		this.id=id;
		this.content=content;
	}
	
	public Key getKey(){
		return key;
	}
	
	public String getId(){
		return id;
	}
	
	public String getContent(){
		return content;
	}
	
	public void setId(String id){
		this.id=id;
	}
	
	public void setContent(String content){
		this.content=content;
	}

}

