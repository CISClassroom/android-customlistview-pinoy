package com.cis.customerlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import com.cis.customerlistview.Adapter.StudentAdapter
import com.cis.customerlistview.Model.Student
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_list)

        var student:Student= Student("นายอุทัยพันธ์  เที่ยงโคตร","603410073-5",R.drawable.pro,R.drawable.bg)

        var students= mutableListOf<Student>()
        students.add(student)
        students.add(Student("นายวิวัฒน์ วงษ์พิชัย","603410217-7",R.drawable.toung,R.drawable.cis))
        students.add(Student("นางสาวศศิธร พิมมะทา","603410156-1",R.drawable.kung,R.drawable.cis))
        students.add(Student("นางสาวธิดารัตน์ ดานะพันธ์","603410204-6",R.drawable.nan,R.drawable.nanny))
        students.add(Student("นางสาวศุภรัตน์ นพวัติ","603410219-3",R.drawable.t,R.drawable.kat))

        var listview: ListView = findViewById(R.id.ListView)
        listview.adapter=StudentAdapter(this,R.layout.listitem_student,students)

        listview.setOnItemClickListener { parent, view, position, id ->
//            Toast.makeText(this,position.toString(),Toast.LENGTH_LONG).show()
            val i = Intent(this,ProfileActivity::class.java)
            i.putExtra("id",position.toString())
            startActivity(i)
        }
    }
}
