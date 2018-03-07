package app.kosher.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        iv_user.loadImage("https://s3.amazonaws.com/appsdeveloperblog/Micky.jpg")

        var amount = 10000.getFormattedNumber()
        val trippleValue = 20.triple()
    }


   private fun ImageView.loadImage(url: String) {

       Glide.with(this).load(url).into(this)
    }

    private fun Int.getFormattedNumber(): String {

        val formatter = DecimalFormat("#,##0.00")

        return  formatter.format(this)
    }

    private fun Int.triple(): Int {
        return this * 3
    }


}