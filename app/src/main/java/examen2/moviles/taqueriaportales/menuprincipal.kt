package examen2.moviles.taqueriaportales

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class menuprincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menuprincipal)

        var btnTacos:ImageButton = findViewById(R.id.button_tacos) as ImageButton

        btnTacos.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
    }
}