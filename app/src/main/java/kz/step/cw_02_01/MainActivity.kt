package kz.step.cw_02_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    var name: EditText? = null
    var email: EditText? = null
    var password: EditText? = null
    var passwordConfirm: EditText? = null
    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun initializeViews(){
        name = findViewById(R.id.name)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        passwordConfirm = findViewById(R.id.password_confirm)
        button = findViewById(R.id.button_register)
    }

    fun initializeListeners(){
        button?.setOnClickListener {
            var isTrue: Boolean = true
            if (password?.text.toString() != passwordConfirm?.text.toString()){
                isTrue = false
            }

            if (email?.text.toString() == ""){
                isTrue = false
            }

            if (name?.text != null){
                var isNameHaveNumber: Boolean = false
                var isNameHaveSymb: Boolean = false
                var text: String = name?.text.toString()
                for (char in text){
                    if (char.toString().toInt() != null){
                        isNameHaveNumber = true
                    }
                    else{
                        isNameHaveSymb = true
                    }
                }

                if (!isNameHaveNumber || !isNameHaveSymb){
                    isTrue = false
                }
            }
            else{
                isTrue = false
            }
        }
    }

}