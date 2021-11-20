package com.example.myfashion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveJualan2: Button = findViewById(R.id.btn_move_jualan_ke2)
        btnMoveJualan2.setOnClickListener(this)

        val btnMoveJualan1: Button = findViewById(R.id.btn_move_jualan1)
        btnMoveJualan1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_move_jualan1 -> {
                val moveJualan1 = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(moveJualan1)
            }
            R.id.btn_move_jualan_ke2 -> {
                val moveJualan2 = Intent(this@MainActivity, MainActivity3::class.java)
                startActivity(moveJualan2)
            }

        }
    }
}