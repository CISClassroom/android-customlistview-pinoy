# รายงานผลการทดลอง
นายอุทัยพันธ์  เที่ยงโคตร 603410073-5
นายวิวัฒน์ วงษ์พิชัย 603410217-7
นางสาวศศิธร พิมมะทา 603410156-1
นางสาวธิดารัตน์ ดานะพันธ์ 603410204-6
นางสาวศุภรัตน์ นพวัติ 603410219-3
## Custom Listview

แสดงคำสั่งสำหรับแสดงข้อมูลชื่อนักศึกษาภายในกลุ่ม กลุ่มละไม่เกิน 4 คน รายละเอียดข้อมูลประกอบด้วย

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- รูปภาพ

เมื่อทำการเลือกรายชื่อนักศึกษาจะทำการเปิดไปยังหน้าที่แสดงข้อมูลนักศึกษาเพิ่มเติม ข้อมูลนักศึกษาประกอบด้วย

- ชื่อ-นามสกุล
- รหัสนักศึกษา
- รูปภาพ
- สาขาวิชา
- อีเมล
- เบอร์โทรศัพท์
- Github

ให้นักศึกษาออกแบบ layout ได้ตามความเหมาสม

## Custom Listview Report

### ข้อมูล Array

```kotlin
var student:Student= Student("นายอุทัยพันธ์  เที่ยงโคตร","603410073-5",R.drawable.pro,R.drawable.bg)

        var students= mutableListOf<Student>()
        students.add(student)
        students.add(Student("นายวิวัฒน์ วงษ์พิชัย","603410217-7",R.drawable.toung,R.drawable.cis))
        students.add(Student("นางสาวศศิธร พิมมะทา","603410156-1",R.drawable.kung,R.drawable.cis))
        students.add(Student("นางสาวธิดารัตน์ ดานะพันธ์","603410204-6",R.drawable.nan,R.drawable.nanny))
        students.add(Student("นางสาวศุภรัตน์ นพวัติ","603410219-3",R.drawable.t,R.drawable.kat))
```

### Custom Listview Layout

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".CustomListActivity">

    <ListView
        android:id="@+id/customlistview"
        android:layout_width="409dp"
        android:layout_height="729dp"
        tools:layout_editor_absoluteX="1dp"
        tools:layout_editor_absoluteY="1dp" />
</LinearLayout>
```

### setOnItemClickListener และการส่งข้อมูลไปอีก Activity

```kotlin
<<<<<<< HEAD
  
        val id = intent.getStringExtra("id")
=======
  val id = intent.getStringExtra("id")
>>>>>>> e5ef12f5477382a48aa4ab43845058600d4ddb74
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
<<<<<<< HEAD
            val path: TextView = findViewById(R.id.textView8)
            path.text = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ"
            val tel: TextView = findViewById(R.id.textView9)
            tel.text = "0951688196"
            val email: TextView = findViewById(R.id.textView10)
            email.text = "uthaipan.aon@gmail.com"
            val githb: TextView = findViewById(R.id.textView11)
            githb.text = "github.com/aonza412"



=======
>>>>>>> e5ef12f5477382a48aa4ab43845058600d4ddb74

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
<<<<<<< HEAD
            val path: TextView = findViewById(R.id.textView8)
            path.text = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ"
            val tel: TextView = findViewById(R.id.textView9)
            tel.text = "0910425809"
            val email: TextView = findViewById(R.id.textView10)
            email.text = "Youqer5@gmail.com"
            val githb: TextView = findViewById(R.id.textView11)
            githb.text = "github.com/ToungGHOST"
=======
>>>>>>> e5ef12f5477382a48aa4ab43845058600d4ddb74

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
<<<<<<< HEAD
            val path: TextView = findViewById(R.id.textView8)
            path.text = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ"
            val tel: TextView = findViewById(R.id.textView9)
            tel.text = "0983265571"
            val email: TextView = findViewById(R.id.textView10)
            email.text = "sasithon_p@kkumail.com"
            val githb: TextView = findViewById(R.id.textView11)
            githb.text = "github.com/sasithon2541"
=======
>>>>>>> e5ef12f5477382a48aa4ab43845058600d4ddb74
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
<<<<<<< HEAD
                val path: TextView = findViewById(R.id.textView8)
                path.text = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ"
                val tel: TextView = findViewById(R.id.textView9)
                tel.text = "0982153049"
                val email: TextView = findViewById(R.id.textView10)
                email.text = "thidarat_d@kkumail.com"
                val githb: TextView = findViewById(R.id.textView11)
                githb.text = "github.com/thidarat"
=======
>>>>>>> e5ef12f5477382a48aa4ab43845058600d4ddb74
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
<<<<<<< HEAD
                val path: TextView = findViewById(R.id.textView8)
                path.text = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ"
                val tel: TextView = findViewById(R.id.textView9)
                tel.text = "0922923275"
                val email: TextView = findViewById(R.id.textView10)
                email.text = "supharat_n@kkumail.com"
                val githb: TextView = findViewById(R.id.textView11)
                githb.text = "github.com/supharatnop"

=======
>>>>>>> e5ef12f5477382a48aa4ab43845058600d4ddb74
            }
```

### การรับข้อมูลจากอีก Activity

```kotlin
public class StudentAdapter(val mCtx: Context,
                            var resource:Int,
                            var items:List<Student>) 
    : ArrayAdapter<Student> (mCtx,resource,items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        //return super.getView(position, convertView, parent)
        val layout:LayoutInflater = LayoutInflater.from(mCtx)

        val v:View = layout.inflate(resource,null)
        val icon : ImageView = v.findViewById(R.id.imageView)
        val name : TextView = v.findViewById(R.id.textView)
        val id:TextView = v.findViewById(R.id.textView2)

        val student:Student = items[position]

        name.text = student.name
        id.text = student.id
        try {
            icon.setImageDrawable(mCtx.getDrawable(student.icon))
        }
        catch (ex:Exception){

        }

        return v
    }
}
```
