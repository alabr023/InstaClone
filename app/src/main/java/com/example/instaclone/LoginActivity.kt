package com.example.instaclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.parse.ParseObject

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val firstObject = ParseObject("FirstClass")
        firstObject.put("message","Hey ! First message from android. Parse is now connected")
        firstObject.saveInBackground {
            if (it != null){
                it.localizedMessage?.let { message -> Log.e("MainActivity", message) }
            }else{
                Log.d("MainActivity","Object saved.")
            }
        }
    }
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_login)
//
//        findViewById<Button>(R.id.login_btn).setOnClickListener {
//            val username = findViewById<EditText>(R.id.et_username).text.toString()
//            val password = findViewById<EditText>(R.id.et_password).text.toString()
//            loginUser(username, password)
//            Log.i("LoginBtn", "btn pressed")
//        }
//    }
//
//    private fun loginUser(username: String, password: String) {
//
//    }
}

