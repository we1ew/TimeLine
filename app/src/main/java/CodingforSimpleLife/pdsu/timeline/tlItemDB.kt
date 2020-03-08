package CodingforSimpleLife.pdsu.timeline

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [tlItem::class], version = 1)
abstract class tlItemDB: RoomDatabase() {
    abstract fun mtlDao(): tlDao

    companion object {
        private var INSTANCE: tlItemDB? = null

        fun getInstance(context: Context): tlItemDB? {
            if (INSTANCE == null) {
               synchronized(tlItemDB::class) {
                   INSTANCE = Room.databaseBuilder(context.applicationContext,
                       tlItemDB::class.java, "tlitem.db")
                       .fallbackToDestructiveMigration()
                       .build()
               }
            }
            return INSTANCE
        }

        fun destroyInstance() {
            INSTANCE = null
        }
    }
}