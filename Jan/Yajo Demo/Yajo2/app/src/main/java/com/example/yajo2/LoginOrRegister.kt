package com.example.yajo2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginOrRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_or_register)


        var userNameField = findViewById<EditText>(R.id.userNameField)
        var editPasswordField = findViewById<EditText>(R.id.editPasswordField)
        var loginButton = findViewById<Button>(R.id.button2)
        var checkButton = findViewById<Button>(R.id.button4)

        checkButton.setOnClickListener {
            var status=if (userNameField.text.toString().equals("gebruiker1")
                &&editPasswordField.text.equals("wachtwoord")) "succesfull login" else "Login Succesfull"
            Toast.makeText(this, status,Toast.LENGTH_SHORT).show()
        }
        loginButton.setOnClickListener {
            val intent = Intent(this, uploadOrRetrieve::class.java)
            startActivity(intent)
        }
    }
}