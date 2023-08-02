package com.samra.alarmdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Toast  2.AlertDialog  3.Snack bar
        //Context
        // Activity Context - this
        // Application Context - applicationContext

        Toast.makeText(this , "welcome" , Toast.LENGTH_LONG).show()

    }

    fun save(view:View){
        var alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("save")
        alert.setMessage("Are u sure?")

        alert.setPositiveButton("Yes" , object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
                Toast.makeText(this@MainActivity,"Saved!" , Toast.LENGTH_LONG).show()
            }
        })
        // lambda expression
        // p0 dialogun ozunu p1 de hansi buttondursa onu verir , biz bunlari almaliyiq  istifade elemesek bele mutleq alinmalidir
        alert.setNegativeButton("NO"){p0 , p1 ->
            Toast.makeText(this@MainActivity,"NOT Saved!" , Toast.LENGTH_LONG).show()

        }
    }
}