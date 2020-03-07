package aa.bb.cc.dd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportActionBar?.hide()
        supportActionBar?.title = "Superman"
    }

    fun showT(v:View) {
        toast("Hey Now")
    }
}
