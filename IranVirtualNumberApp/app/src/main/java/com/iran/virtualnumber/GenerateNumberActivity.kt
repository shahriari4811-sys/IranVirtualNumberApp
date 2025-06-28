
package com.iran.virtualnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GenerateNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_generate_number)

        val number = "+98" + (1000000000..9999999999).random().toString()
        findViewById<TextView>(R.id.txtGeneratedNumber).text = "شماره مجازی: $number"
    }
}
