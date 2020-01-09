package com.cis.customerlistview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.cis.customerlistview.Model.Student
import com.cis.customerlistview.R
import kotlinx.android.synthetic.main.listitem_student.view.*

public class StudentAdapter (var mCtx:Context,
                             var resource:Int,
                             var item:List<Student>)
    :ArrayAdapter<Student>(mCtx,resource,item){
    override fun getView(position: Int,
                         convertView: View?,
                         parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout:LayoutInflater= LayoutInflater.from(mCtx)
        val v:View=layout.inflate(resource,null)
        val icon:ImageView=v.findViewById(R.id.profile_image)
        val name:TextView=v.findViewById(R.id.textView)
        val id:TextView=v.findViewById(R.id.textView2)

        val student:Student=item[position]
        name.text=student.name
        id.text=student.id
        icon.setImageDrawable(mCtx.getDrawable(student.icon))
        return v
    }
}