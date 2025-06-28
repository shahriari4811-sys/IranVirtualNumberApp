
package com.iran.virtualnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnGenerateNumber).setOnClickListener {
            startActivity(Intent(this, GenerateNumberActivity::class.java))
        }
        findViewById<Button>(R.id.btnSendSMS).setOnClickListener {
            startActivity(Intent(this, SendSMSActivity::class.java))
        }
        findViewById<Button>(R.id.btnCall).setOnClickListener {
            startActivity(Intent(this, CallActivity::class.java))
        }
        findViewById<Button>(R.id.btnOrganizations).setOnClickListener {
            startActivity(Intent(this, OrganizationListActivity::class.java))
        }
        findViewById<Button>(R.id.btnHelp).setOnClickListener {
            startActivity(Intent(this, HelpActivity::class.java))
        }
    }
}
