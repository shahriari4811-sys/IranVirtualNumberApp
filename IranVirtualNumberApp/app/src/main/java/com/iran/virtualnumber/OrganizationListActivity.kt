
package com.iran.virtualnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class OrganizationListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_organization_list)

        val orgs = """
        سازمان عفو بین‌الملل: +441234567890
        دیدبان حقوق بشر: +441112223334
        سازمان گزارشگران بدون مرز: +33987654321
        """

        findViewById<TextView>(R.id.txtOrganizations).text = orgs.trimIndent()
    }
}
