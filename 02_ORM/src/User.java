import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Users")
public class User {
	
	@DatabaseField(generatedId = true) //entspricht auto_increment
	private int userId;
	@DatabaseField(columnName = "userName", canBeNull = false)
	private String userName;
	@DatabaseField(canBeNull = false)
	private long userRegistrationDate;
	
	public User(){
	}
	
	public User(int userId, String userName, long userRegistrationDate) {
		this.userId = userId;
		this.userName = userName;
		this.userRegistrationDate = userRegistrationDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserRegistrationDate() {
		return userRegistrationDate;
	}

	public void setUserRegistrationDate(long userRegistrationDate) {
		this.userRegistrationDate = userRegistrationDate;
	}

}
