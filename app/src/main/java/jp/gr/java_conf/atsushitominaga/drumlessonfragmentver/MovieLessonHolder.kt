package jp.gr.java_conf.atsushitominaga.drumlessonfragmentver

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MovieLessonHolder(view: View) : RecyclerView.ViewHolder(view) {

    val cardMovie : CardView
    val movieTitleText : TextView
    val movieImageView : ImageView
    val newIconImageView : ImageView

    init {
        cardMovie = view.findViewById(R.id.cardMovie)
        movieTitleText = view.findViewById(R.id.movieTitleText)
        movieImageView = view.findViewById(R.id.movieImageView)
        newIconImageView = view.findViewById(R.id.newIconImageView)
    }


}