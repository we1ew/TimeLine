package CodingforSimpleLife.pdsu.timeline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var mtlItemDB : tlItemDB? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // DB를 통해서 오늘 날짜 타임라인 정보가 있으면 불러옴
        mtlItemDB = tlItemDB.getInstance(this)

        val r = Runnable {

        }

        val thread = Thread(r)
        thread.start()
    }
}
