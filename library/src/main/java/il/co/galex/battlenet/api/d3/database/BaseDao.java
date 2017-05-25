package il.co.galex.battlenet.api.d3.database;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public interface BaseDao<T> {

    @Insert
    void insert(T data);

    @Insert
    void insert(List<T> data);

    @Update
    void update(T data);

    @Update
    void update(List<T> data);

    @Delete
    void delete(T data);

    @Delete
    void delete(List<T> data);
}
