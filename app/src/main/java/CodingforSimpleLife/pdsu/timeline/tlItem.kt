package CodingforSimpleLife.pdsu.timeline

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/* db 구조
*   아이디 / 시간    / 장소       / 메모    / 사진    / 녹음    / 영상
*   기본키 / Not Null/ Not NULL  /
*   id    / tlTime  / tlLocation / tlMemo / tlPhoto / tlAudio / tlVideo
* */

@Entity(tableName = "tlItem")
class tlItem(@PrimaryKey(autoGenerate = true) var id: Long?,
             @ColumnInfo(name = "tlTime") var tlTime: String,
             @ColumnInfo(name = "tlLocation") var tlLocation: String,
             @ColumnInfo(name = "tlMemo") var tlMemo: String?,
             @ColumnInfo(name = "tlPhoto") var tlPhoto: String?,
             @ColumnInfo(name = "tlAudio") var tlAudio: String?,
             @ColumnInfo(name = "tlVideo") var tlVideo: String?
){
    constructor(): this(null,"","", "", "", "", "")
}