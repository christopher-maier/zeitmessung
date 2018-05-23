import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Result")
public class Results {

	@DatabaseField(canBeNull = false)
	private long beginDateTimeOfTest;
	
	@DatabaseField(canBeNull = false)
	private long endDateTimeOfTest;
	
	@DatabaseField(canBeNull = false, generatedId = true) //entsprich auto_increment
	private int userId;
	
	@DatabaseField(canBeNull = false)
	private double nrPairs;
	
	public long getBeginDateTimeOfTest() {
		return beginDateTimeOfTest;
	}

	public void setBeginDateTimeOfTest(long beginDateTimeOfTest) {
		this.beginDateTimeOfTest = beginDateTimeOfTest;
	}

	public long getEndDateTimeOfTest() {
		return endDateTimeOfTest;
	}

	public void setEndDateTimeOfTest(long endDateTimeOfTest) {
		this.endDateTimeOfTest = endDateTimeOfTest;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public double getNrPairs() {
		return nrPairs;
	}

	public void setNrPairs(double nrPairs) {
		this.nrPairs = nrPairs;
	}

	public double getNrTriples() {
		return nrTriples;
	}

	public void setNrTriples(double nrTriples) {
		this.nrTriples = nrTriples;
	}

	public double getNrPoker() {
		return nrPoker;
	}

	public void setNrPoker(double nrPoker) {
		this.nrPoker = nrPoker;
	}

	public double getNrTwoPairs() {
		return nrTwoPairs;
	}

	public void setNrTwoPairs(double nrTwoPairs) {
		this.nrTwoPairs = nrTwoPairs;
	}

	public double getNrFlush() {
		return nrFlush;
	}

	public void setNrFlush(double nrFlush) {
		this.nrFlush = nrFlush;
	}

	public double getNrStraightFlush() {
		return nrStraightFlush;
	}

	public void setNrStraightFlush(double nrStraightFlush) {
		this.nrStraightFlush = nrStraightFlush;
	}

	public double getNrRoyalFlush() {
		return nrRoyalFlush;
	}

	public void setNrRoyalFlush(double nrRoyalFlush) {
		this.nrRoyalFlush = nrRoyalFlush;
	}

	public double getNrFullHouse() {
		return nrFullHouse;
	}

	public void setNrFullHouse(double nrFullHouse) {
		this.nrFullHouse = nrFullHouse;
	}

	@DatabaseField(canBeNull = false)
	private double nrTriples;
	
	@DatabaseField(canBeNull = false)
	private double nrPoker;
	
	@DatabaseField(canBeNull = false)
	private double nrTwoPairs;
	
	@DatabaseField(canBeNull = false)
	private double nrFlush;
	
	@DatabaseField(canBeNull = false)
	private double nrStraightFlush;
	
	@DatabaseField(canBeNull = false)
	private double nrRoyalFlush;
	
	@DatabaseField(canBeNull = false)
	private double nrFullHouse;

}
