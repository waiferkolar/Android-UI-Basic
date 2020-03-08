package aa.bb.cc.dd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title = "Superman"

        button2.setOnClickListener {
            val email = editText.text.toString()
            val pass = editText2.text.toString()
            textView.text = String.format("Email is %s and Password is %s", email, pass);

            if (email.contentEquals("mgmg@gmail.com") && pass.contentEquals("123123")) {
                imageView.setImageResource(R.drawable.happy)
            } else {
                imageView.setImageResource(R.drawable.angry)
            }
            imageView.visibility = View.VISIBLE

        }

    }

}
