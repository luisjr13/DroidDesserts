package dev.mids.droiddesserts

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity () {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

       val imageId = intent.getIntExtra(MainActivity.KEY_IMAGE, R.drawable.ic_launcher_background)
        val imageName= intent.getStringExtra(MainActivity.KEY_IMAGE_NAME).orEmpty()
        val ivimage = findViewById<ImageView>(R.id.ivDroidVersion)
        val tvImageName: TextView = findViewById(R.id.tvNameImagem)

        ivimage.setImageResource(imageId)
        tvImageName.text= imageName
    }

}
