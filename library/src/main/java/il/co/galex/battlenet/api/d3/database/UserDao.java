package il.co.galex.battlenet.api.d3.database;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

import il.co.galex.battlenet.api.d3.model.account.User;
import retrofit2.http.QueryMap;

/**
 * @author Alexander Gherschon
 */

@Dao
public interface UserDao extends BaseDao<User> {

    @Query("select * from user where uid = :userId")
    User findUser(String userId);

    @Query("select * from user where :current = 1")
    User getCurrentUser(boolean value);
}
