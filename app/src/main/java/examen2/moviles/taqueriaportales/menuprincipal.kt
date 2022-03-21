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

        var btntacos:ImageButton = findViewById(R.id.button_tacos) as ImageButton
        var btnantojitos:ImageButton = findViewById(R.id.button_antojitos) as ImageButton
        var btnespecialidades:ImageButton = findViewById(R.id.button_especialidades) as ImageButton
        var btncaldos:ImageButton = findViewById(R.id.button_caldos) as ImageButton
        var btncombinations:ImageButton = findViewById(R.id.button_combinations) as ImageButton
        var btntortas:ImageButton = findViewById(R.id.button_tortas) as ImageButton
        var btnsopas:ImageButton = findViewById(R.id.button_sopas) as ImageButton
        var btnsideorders:ImageButton = findViewById(R.id.button_sideorders) as ImageButton
        var btnbebidas: ImageButton = findViewById(R.id.button_bebidas) as ImageButton

        btntacos.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btnantojitos.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btnespecialidades.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btncaldos.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btncombinations.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btntortas.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btnsopas.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btnsideorders.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }
        btnbebidas.setOnClickListener {
            var intent : Intent = Intent(this, ComidasActivity::class.java)
            startActivity(intent)
        }

    }
}