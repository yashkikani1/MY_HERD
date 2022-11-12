package com.example.my_herd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.util.Log
import android.widget.TextView
import androidx.core.view.WindowCompat
import com.example.my_herd.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setSupportActionBar(binding.toolbar)

        Log.d("TAG_TEST", "onCreate: Inside Login")


        val signup = findViewById<TextView>(R.id.signup)

        signup.setOnClickListener {

            Intent(this, RegistrationActivity::class.java).also {startActivity(it)}

            signup.movementMethod = LinkMovementMethod.getInstance();

        }

        binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
        binding.bottomNavigationView.setOnItemSelectedListener { it ->
            when (it.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}

/*lateinit var email: EditText
lateinit var password: EditText
val min_length = 6

override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
    super.onCreate(savedInstanceState, persistentState)
    WindowCompat.setDecorFitsSystemWindows(window, false)
    var binding = ActivityLoginBinding.inflate(layoutInflater)
    setContentView(binding.root)
    setSupportActionBar(binding.toolbar)

    Log.d("TAG_TEST", "onCreate: Inside Login")


    val signup = findViewById<TextView>(R.id.signup)

    signup.setOnClickListener {

        Intent(this, RegistrationActivity::class.java).also { startActivity(it) }

        signup.movementMethod = LinkMovementMethod.getInstance();

    }

    binding.bottomNavigationView.selectedItemId = R.id.bottom_nav_login
    binding.bottomNavigationView.setOnItemSelectedListener { it ->
        when (it.itemId) {
            R.id.bottom_nav_reg -> {
                Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
            }
        }
        return@setOnItemSelectedListener true
    }



    viewInitializations()
}

fun viewInitializations() {
    email = findViewById(R.id.email)
    password = findViewById(R.id.password)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

}

fun validateInput(): Boolean {
    if (email.text.toString() == "") {
        email.error = "Please Enter Email"
        return false
    }
    if (password.text.toString() == "") {
        password.error = "Please Enter Password"
        return false
    }
    if (!isEmailValid(email.text.toString())) {
        email.error = "Please Enter Valid Email"
        return false
    }
    if (password.text.length < min_length) {
        password.error = "Password Length must be more than " + min_length + "characters"
        return false
    }
    return true
}
fun isEmailValid(email: String?): Boolean {
    return Patterns.EMAIL_ADDRESS.matcher(email).matches()
}
fun performSignUp(v: View) {
    if (validateInput()) {

        // Input is valid, here send data to your server
        val email = email!!.text.toString()
        val password = password!!.text.toString()
        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

    }
}
fun goToSignup(v: View) {
    // Open your SignUp Activity if the user wants to signup
    // Visit this article to get SignupActivity code https://handyopinion.com/signup-activity-in-android-studio-kotlin-java/
    val intent = Intent(this,RegistrationActivity::class.java)
    startActivity(intent)
}
}*/