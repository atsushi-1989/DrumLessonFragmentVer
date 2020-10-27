package jp.gr.java_conf.atsushitominaga.drumlessonfragmentver

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        monthTextView.text = SimpleDateFormat("MM月").format(Date())

        supportFragmentManager.beginTransaction()
            .add(R.id.contener,CalendarFragment()).commit()


        movieLessonBtn.setOnClickListener {
            val intent = Intent(this@MainActivity, MovieLessonActivity::class.java)
            startActivity(intent)

        }


    }


}
