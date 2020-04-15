package com.example.billyforteacher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bully_report.*

class BullyReportActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bully_report)

        back.setOnClickListener {
            this.finish()
        }

        bt_cancel.setOnClickListener {
            this.finish()
        }

        bt_submit.setOnClickListener {
            this.finish()
        }

        supportActionBar?.hide()
    }
}
