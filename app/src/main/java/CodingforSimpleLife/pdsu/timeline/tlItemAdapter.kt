package CodingforSimpleLife.pdsu.timeline

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.VideoView
import androidx.recyclerview.widget.RecyclerView

class tlItemAdapter(val context: Context, val tlItems: List<tlItem>) :
    RecyclerView.Adapter<tlItemAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_db, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return tlItems.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(tlItems[position])
    }

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        val tvMemo = itemView?.findViewById<TextView>(R.id.tvMemo)
        val ivPhoto = itemView?.findViewById<ImageView>(R.id.ivPhoto)
        val btnAudioPlay = itemView?.findViewById<Button>(R.id.btnAudioPlay)
        val vvVideo = itemView?.findViewById<VideoView>(R.id.vvVideo)

        fun bind(mtlItem: tlItem) {
            tvMemo?.text = mtlItem.tlMemo
            //ivPhoto?.setImageURI("http://www.google.co.kr/title.png")
            btnAudioPlay?.setOnClickListener() {
                if(btnAudioPlay.text == "재생") {
                    btnAudioPlay.text = "정지"
                    // 여기에 오디오 링크 및 재생 등 설정
                }
            }
            //여기에 비디오뷰 관련 설정
        }
    }
}