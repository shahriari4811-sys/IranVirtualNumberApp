
package com.iran.virtualnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val helpText = """
        هشدار امنیتی:
        لطفاً بدانید استفاده از خطوط مخابراتی ایران قابل ردیابی است.
        حتماً با آگاهی از خطرات اقدام کنید.

        این برنامه به شما امکان ارسال پیامک و تماس با سازمان‌های حقوق بشری را می‌دهد.
        """

        findViewById<TextView>(R.id.txtHelp).text = helpText.trimIndent()
    }
}
