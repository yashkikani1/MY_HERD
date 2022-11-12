package com.example.my_herd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.TextView
import androidx.core.view.WindowCompat
import com.example.my_herd.databinding.ActivityRegistrationBinding

class RegistrationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding =ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setSupportActionBar(binding.toolbar)

        val login = findViewById<TextView>(R.id.logins)

        login.setOnClickListener {

            Intent(this, LoginActivity::class.java).also {startActivity(it)}

            login.movementMethod = LinkMovementMethod.getInstance();

        }
        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_reg
        binding.bottomNavigationView.setOnItemSelectedListener { it ->
            when (it.itemId) {
                R.id.bottom_nav_login -> {
                    Intent(this, LoginActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }

}
/*private lateinit var binding: ActivityRegistrationBinding

lateinit var Username: EditText
lateinit var Phoneno:EditText
lateinit var Email: EditText
lateinit var Password:EditText
lateinit var confirmPassword:EditText
val MIN_PASSWORD_LENGTH = 6;

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_registration)

    viewInitializations()
}
fun viewInitializations() {
    Username = findViewById(R.id.username)
    Phoneno = findViewById(R.id.phone)
    Email = findViewById(R.id.email)
    Password = findViewById(R.id.pass)
    confirmPassword = findViewById(R.id.confirmpasss)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
}

fun isEmailValid(email: String): Boolean {
return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}
fun performSignUp (view: View) {
if(validateInput())
{
    // Input is valid, here send data to your server

    val Username =Username.text.toString()
    val phoneno = Phoneno.text.toString()
    val email = Email.text.toString()
    val password = Password.text.toString()
    val repeatPassword = confirmPassword.text.toString()

    Toast.makeText(this,"Login Success", Toast.LENGTH_SHORT).show()

}
}


    fun validateInput(): Boolean {

        run {
            if (Username.text.toString().equals("")) {
              Username.setError("Please Enter User Name")
                return false
            }
            if (Phoneno.text.toString().equals("")) {
                Phoneno.setError("Please Enter Phone no:")
                return false
            }
            if (Email.text.toString().equals("")) {
                Email.setError("Please Enter Email")
                return false
            }
            if (Password.text.toString().equals("")) {
                Password.setError("Please Enter Password")
                return false
            }
            if (confirmPassword.text.toString().equals("")) {
                confirmPassword.setError("Please Enter Repeat Password")
            }
            return false
        }

}

}

*/