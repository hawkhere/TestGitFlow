Changs by dev-waqas
Online edit
git flow edit
package com.gymbes.android

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreateWorkoutStepTwoActivity: AppCompatActivity() {

    var tv_complete: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_workout_step_two)
//      val binding: LoginActivityBinding =
        tv_complete = findViewById(R.id.tv_complete)
        tv_complete?.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
