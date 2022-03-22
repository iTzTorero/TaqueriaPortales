package examen2.moviles.taqueriaportales

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TableLayout
import android.widget.TextView
import java.lang.reflect.Array

class PedidoActivity : AppCompatActivity() {

    var pedido = ArrayList<Platillo>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        agregarPedido()

        var listview: ListView = findViewById(R.id.listpedidosview)
        var adapter = AdaptadorPlatillos(this, pedido)
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
        var pedido = ArrayList<Platillo>()
        var contexto: Context?= null

        constructor(contexto: Context, pedido:ArrayList<Platillo>){
            this.pedido=pedido
            this.contexto=contexto
        }
        override fun getCount(): Int {
            return pedido.size
        }

        override fun getItem(p0: Int): Any {
            return pedido[0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var ped = pedido[p0]
            var inflador=LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.pedido_view,null)

            var nombre = vista.findViewById(R.id.comida_nombre) as TextView
            var cantidad = vista.findViewById(R.id.tv_cant) as TextView
            var precio = vista.findViewById(R.id.comida_precio) as TextView

            nombre.setText(ped.nombre)
            cantidad.setText(0)
            precio.setText("$${ped.costo}")
            return vista
        }
    }
}