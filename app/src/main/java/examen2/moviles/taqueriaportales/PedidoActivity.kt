package examen2.moviles.taqueriaportales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TableLayout
import java.lang.reflect.Array

class Pedido : AppCompatActivity() {

    var pedido = ArrayList<Platillo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        agregarPedido()
        var adapter = AdaptadorPlatillos(this, pedido)
        var listview: ListView = findViewById(R.id.listpedidosview)
        listview.adapter= adapter

    }

    fun agregarPedido(){
        pedido.add(
            Platillo(1,
                R.string.tacoTradicional.toString(),R.string.tacoTradicionalDesc.toString(),R.string.tacos.toString(),
                2.35.toFloat(),R.drawable.tacostradicional)
        )
        pedido.add(
            Platillo(2,R.string.tacoPescado.toString(),R.string.tacoPescadoDesc.toString(),R.string.tacos.toString(),
                2.35.toFloat(),R.drawable.tacospescado
            )
        )
    }

    private class adaptadorPedido: BaseAdapter{
        var pedido = ArrayList()
    }
}