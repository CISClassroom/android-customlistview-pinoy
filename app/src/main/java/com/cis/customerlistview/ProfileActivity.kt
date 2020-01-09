package com.cis.customerlistview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val id = intent.getStringExtra("id")
        Toast.makeText(this,id.toString(),Toast.LENGTH_SHORT).show()
        if (id == "0") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "นายอุทัยพันธ์ เที่ยงโคตร"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410073-5"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.pro)
            val bgimg: ImageView = findViewById(R.id.imageView5)
            bgimg.setImageResource(R.drawable.bg)

        }
        if (id == "1") {
            val textname: TextView = findViewById(R.id.textView6)
            textname.text = "วิวัฒน์ วงษ์พิชัย"
            val textid: TextView = findViewById(R.id.textView7)
            textid.text = "603410217-7"
            val iconimg: ImageView = findViewById(R.id.profile_image)
            iconimg.setImageResource(R.drawable.toung)
            val bgimg: ImageView = findViewById(R.id.imageView5)
            bgimg.setImageResource(R.drawable.cis)

        }
        if (id == "2") {
                val textname: TextView = findViewById(R.id.textView6)
                textname.text = "นางสาวศศิธร พิมมะทา"
                val textid: TextView = findViewById(R.id.textView7)
                textid.text = "603410156-1"
                val iconimg: ImageView = findViewById(R.id.profile_image)
                iconimg.setImageResource(R.drawable.kung)
                val bgimg: ImageView = findViewById(R.id.imageView5)
                bgimg.setImageResource(R.drawable.cis)
            }
            if (id == "3") {
                val textname: TextView = findViewById(R.id.textView6)
                textname.text = "นางสาวธิดารัตน์ ดานะพันธ์"
                val textid: TextView = findViewById(R.id.textView7)
                textid.text = "603410204-6"
                val iconimg: ImageView = findViewById(R.id.profile_image)
                iconimg.setImageResource(R.drawable.nan)
                val bgimg: ImageView = findViewById(R.id.imageView5)
                bgimg.setImageResource(R.drawable.nanny)
            }
            if (id == "4") {
                val textname: TextView = findViewById(R.id.textView6)
                textname.text = "นางสาวศุภรัตน์ นพวัติ"
                val textid: TextView = findViewById(R.id.textView7)
                textid.text = "603410219-3"
                val iconimg: ImageView = findViewById(R.id.profile_image)
                iconimg.setImageResource(R.drawable.t)
                val bgimg: ImageView = findViewById(R.id.imageView5)
                bgimg.setImageResource(R.drawable.kat)
            }
    }
}
