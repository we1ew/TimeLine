package CodingforSimpleLife.pdsu.timeline

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface tlDao {
    @Query("SELECT * FROM tlitem")
    fun getAll(): List<tlItem>

    /* import android.arch.persistence.room.OnConflictStrategy.REPLACE */
    @Insert(onConflict = REPLACE)
    fun insert(tlitem: tlItem)

    @Query("DELETE from tlitem")
    fun deleteAll()
}