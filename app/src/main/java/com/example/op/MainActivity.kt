package com.example.op

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var ci = 0
    lateinit var image: ImageView
var arcs= arrayOf("EAST BLUE ARC","ENIES LOBBY ARC","MARINEFORD ARC","DRESSROSA ARC","WANO ARC")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next = findViewById<ImageButton>(R.id.bnext)
        val prev = findViewById<ImageButton>(R.id.bprev)
      val arcname=findViewById<TextView>(R.id.textView8)
        next.setOnClickListener {
            var idCurrentImageString = "pic$ci"
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            ci = (5 + ci + 1) % 5
            var idImageToShowString = "pic$ci"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            arcname.text=arcs[ci]
        }

        prev.setOnClickListener {
            var idCurrentImageString = "pic$ci"
            var idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)
            image = findViewById(idCurrentImageInt)
            image.alpha = 0f
            ci = (5 + ci - 1) % 5
            var idImageToShowString = "pic$ci"
            var idImageToShowInt = this.resources.getIdentifier(idImageToShowString, "id", packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            arcname.text=arcs[ci]
        }
    }
}
