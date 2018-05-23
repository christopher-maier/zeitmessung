import java.sql.SQLException;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class ORM_Manager {
	//DAO- Entwurfsmuster damit wenn die Datenquelle(hier DB) gewechselt wird, nicht der 
	//Code geändert werden muss. Das DAO kapselt also den Zugriff auf die Quelle
	private static Dao<User, Integer> userDao;
	private static Dao<Results, Integer> resultDao;
	private static ConnectionSource con;
	private static String pfad = "localhost" + "/" + "PokersuiteStatistics" + "?user=root&password=";

	private static void start(User user, Results result) throws Exception {
		con = null;
		try {
			con = new JdbcConnectionSource(pfad);

			ORM_Manager.setupDatabase(con);

			ORM_Manager.insertIntoDB(user, result, con);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				con.close();
			}

		}
	}

	private static void insertIntoDB(User user1, Results result1, ConnectionSource con) {
		try {
			User user = user1;
			userDao.create(user);

			Results result = result1;
			resultDao.create(result);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void setupDatabase(ConnectionSource con) {
		try {
			userDao = DaoManager.createDao(con, User.class);
			resultDao = DaoManager.createDao(con, Results.class);

			TableUtils.createTableIfNotExists(con, User.class);
			TableUtils.createTableIfNotExists(con, Results.class);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
