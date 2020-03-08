package CodingforSimpleLife.pdsu.timeline

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/* db 구조
*   아이디 / 시간    / 장소       / 메모    / 사진    / 녹음    / 영상
*   기본키 / Not Null/ Not NULL  /
*   id    / tlTime  / tlLocation / tlMemo / tlPhoto / tlAudio / tlVideo
* */

@Entity(tableName = "tlitem")
class tlItem(@PrimaryKey(autoGenerate = true) var id: Long?,
             @ColumnInfo(name = "tltime") var tlTime: String,
             @ColumnInfo(name = "tllocation") var tlLocation: String,
             @ColumnInfo(name = "tlmemo") var tlMemo: String?,
             @ColumnInfo(name = "tlphoto") var tlPhoto: String?,
             @ColumnInfo(name = "tlaudio") var tlAudio: String?,
             @ColumnInfo(name = "tlvideo") var tlVideo: String?
){
    constructor(): this(null,"","", "", "", "", "")
}