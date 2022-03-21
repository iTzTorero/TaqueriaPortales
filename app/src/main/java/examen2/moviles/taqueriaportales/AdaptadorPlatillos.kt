package examen2.moviles.taqueriaportales

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AdaptadorPlatillos:BaseAdapter{
    lateinit var context:Context
    var platillos:ArrayList<Platillo> = ArrayList()


    constructor(context: Context, platillos:ArrayList<Platillo>){
        this.context = context
        this.platillos = platillos
    }
    override fun getCount(): Int {
        return platillos.size
    }

    override fun getItem(p0: Int): Any {
        return platillos[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflador = LayoutInflater.from(context)
        var vista = inflador.inflate(R.layout.comida_view, null)

        var imagen :ImageView = vista.findViewById(R.id.comida_img)
        var nombre :TextView = vista.findViewById(R.id.comida_nombre)
        var desc :TextView = vista.findViewById(R.id.comida_desc)
        var precio :TextView = vista.findViewById(R.id.comida_precio)

        var platillo :Platillo = platillos[p0]

        return vista
    }

}