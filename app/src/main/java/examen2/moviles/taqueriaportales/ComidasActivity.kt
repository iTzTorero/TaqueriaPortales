package examen2.moviles.taqueriaportales

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class ComidasActivity : AppCompatActivity() {

    var tacos = ArrayList<Comida>()
    var antojitos = ArrayList<Comida>()
    var especialidades = ArrayList<Comida>()
    var caldos = ArrayList<Comida>()
    var combinations = ArrayList<Comida>()
    var tortas = ArrayList<Comida>()
    var sopas = ArrayList<Comida>()
    var sideorders = ArrayList<Comida>()
    var drinks = ArrayList<Comida>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comidas)

        var btnCarrito = findViewById(R.id.btnCarrito) as ImageButton
        var btnQuitarCantidad = findViewById(R.id.btnQuitarCantidad) as Button
        var btnAgregarCantidad = findViewById(R.id.btnAgregarCantidad) as Button
        var cantidadComidaView = findViewById(R.id.tv_cantidadComidaView) as TextView
        var btnAgregarCarrito = findViewById(R.id.btnAgregarCarrito) as Button

        agregarComidas()

        var listview : ListView = findViewById(R.id.litview) as ListView
        var adaptador: AdaptadorComidas = AdaptadorComidas(this,tacos)
        listview.adapter = adaptador

        btnCarrito.setOnClickListener{
            var intent: Intent = Intent(this,PedidoActivity::class.java)
            startActivity(intent)
        }

        btnAgregarCantidad.setOnClickListener{
            var cantString: String = cantidadComidaView.text.toString()
            var cant: Int = cantString.toInt()
            cant += 1
            cantidadComidaView.setText(cant)
        }

        btnQuitarCantidad.setOnClickListener{
            quitarCantidad(cantidadComidaView)
        }

        
    }

    fun quitarCantidad(cantidadComidaView: TextView){
        var cantString: String = cantidadComidaView.text.toString()
        var cant: Int = cantString.toInt()
        if (cant > 0){
            cant -= 1
        }
    }

    fun agregarComidas(){
        tacos.add(Comida("Taco Tradicional", R.drawable.tacostradicional, "Traditional taco",2.35))
        tacos.add(Comida("Taco de Pescado", R.drawable.tacospescado, "Fish taco",2.35))

        antojitos.add(Comida("Quesadillas", R.drawable.quesadillas, "Rellenas con su carne favorita, servidas con ensalada. Filled with your choice of meat, served with salad.", 4.75))
        antojitos.add(Comida("Huaraches", R.drawable.huarache, "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema. Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream", 9.87))
        antojitos.add(Comida("Gringas", R.drawable.gringas,"Tortilla de harina con queso, carne al pastor y piña Flour tortilla with cheese marinated pork and pineapple", 6.47))
        antojitos.add(Comida("Sincronizadas", R.drawable.sincronizadas, "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.", 6.99))
        antojitos.add(Comida("Sopes", R.drawable.sopes,"Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes",3.39))
        antojitos.add(Comida("Tostadas", R.drawable.tostadas,"Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes",3.55))

        especialidades.add(Comida("Mojarra Frita - Fried Fish", R.drawable.mojarra, "Tilapia frita servida con lechiga, cebolla, jitomate, aguacate y tortillas. Agregue arroz y frijoles por \$1.50 adicinales Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas. Add rice and beans for \$1.50 extra.",14.49))
        especialidades.add(Comida("Tostada de Ceviche", R.drawable.tostadaceviche, "Tilapia, camarones y pico de gallo servido en una crujiente tostada Tilapia, Shrimp and pico de gallo, served on a crispy shell", 2.99))
        especialidades.add(Comida("Fajita Burrito",R.drawable.fajitaburrito, "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.",11.79))
        especialidades.add(Comida("Fajita Quesadilla", R.drawable.fajitaquesadilla,"Quesadilla extra grande, rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada Extra large quesadilla with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.",12.49))
        especialidades.add(Comida("Botana de Camarones", R.drawable.botanacamarones, "",17.99))
        especialidades.add(Comida("Coctel Camaron", R.drawable.coctelcamaron,"",14.50))

        caldos.add(Comida("Larger", R.drawable.caldolargo, "",10.99))
        caldos.add(Comida("Camaron", R.drawable.caldocamaron,"", 11.99))

        combinations.add(Comida("Traditional Taco Combo", 0,"Tortilla de Maiz, tu carne favorita, servido con arroz y frijoles Corn tortilla taco, your choice of meat, served with rice and beans",6.99))
        combinations.add((Comida("Mexican Burritos", 0, "Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.", 10.99)))
        combinations.add(Comida("Los Portales Burrito",0, "A flour tortilla wrapped around grilled cactus, steak, pastor, (Seasoned Pork) grilled onions, rice and beans. Served a side of lettuce salad, tomatoes, sour cream and guacamole.",11.79))
        combinations.add(Comida("Cinco", 0, "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.",7.67))
        combinations.add(Comida("Dos Amigos", 0, "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans",8.25))
        combinations.add(Comida("Burrito Pepe", 0,"A flour tortilla wrapped around your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.",6.89))

        tortas.add(Comida("Torta Regular", 0,"All tortas come with lettuce, onions, tomatoes, avocado do, sour cream, mayo, jalapeno pepper and your choice of meat. ", 10.95))
        tortas.add(Comida("Torta -Milanesa de Res o Pollo", 0, "Breaded Steak or Chicken", 11.99))
        tortas.add(Comida("Torta Cubana", 0, "Chorizo, asada, jamon, pastor y queso Mexican sausage, steak, marinated pork, ham, and cheese", 12.35))
        tortas.add(Comida("Torta Mixta", 0, "Chorizo, asada y pastor Mexican sausage, steak and marinated pork", 11.99))
        tortas.add(Comida("Small Mexican Torta", R.drawable.mexicantorta, "Bolillo bread sandwich with your choice of filling. Topped with Lettuce, tomatoes, onions, and avocado.",6.89))

        sopas.add(Comida("Pozole", R.drawable.pozole, "Weekends only", 5.99))
        sopas.add(Comida("Menudo", R.drawable.menudo, "Wednesday to Sunday",5.99))
        sopas.add(Comida("Caldo de Res", R.drawable.caldores, "", 5.99))
        sopas.add(Comida("Caldo de Camaron", R.drawable.caldocamaron, "Shrimp soup", 10.69))
        sopas.add(Comida("Sopa de Mariscos", R.drawable.sopamariscos, "Seafood soup", 15.75))

        sideorders.add(Comida("Side Of Guacamole", R.drawable.guacamole, "", 3.75))
        sideorders.add(Comida("Side Of Rice", 0, "", 1.99))
        sideorders.add(Comida("Side Of Beans", 0, "", 1.99))
        sideorders.add(Comida("Chips And Salsa", 0, "", 2.25))
        sideorders.add(Comida("Flour Tacos", 0, "", 2.99))

        drinks.add(Comida("Sodas 20oz.", 0, "", 2.75))
        drinks.add(Comida("Jarritos",0, "", 2.35))
        drinks.add(Comida("Aguas Frescas",0, "", 2.75))
        drinks.add(Comida("Domestic Beer", 0, "",3.55))
        drinks.add(Comida("Mexican Beer",0,"",3.99))
        drinks.add(Comida("Micheladas", R.drawable.michelada,"",6.75))
        drinks.add(Comida("Caguama",0,"", 7.99))
        drinks.add(Comida("Caguama Michelada",0,"",10.99))
        drinks.add((Comida("Cubetazos",0,"",19.99)))
        drinks.add(Comida("Lata Beer",0,"", 2.99))
        drinks.add(Comida("Charolazo", 0, "", 15.75))
        drinks.add(Comida("Charolazo con Camarones",0,"",21.99))
        drinks.add(Comida("La Mamalona", 0,"(Michelada 2 cervezas", 12.99))
        drinks.add(Comida("La Mamalona con Camarones", 0,"",14.99))
        drinks.add(Comida("Cubetazo (6 cervezas)",0,"",21.99))

    }

    private class AdaptadorComidas:BaseAdapter{
        var comidas = ArrayList<Comida>()
        var contexto: Context?=null

        constructor(contexto:Context, comidas:ArrayList<Comida>){
            this.comidas = comidas
            this.contexto = contexto
        }

        override fun getCount(): Int {
            return comidas.size
        }

        override fun getItem(p0: Int): Any {
            return comidas[p0]
        }

        override fun getItemId(p0: Int): Long {
           return p0.toLong()
        }

        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            var com = comidas[p0]
            var inflador = LayoutInflater.from(contexto)
            var vista = inflador.inflate(R.layout.comida_view,null)

            var imagen = vista.findViewById(R.id.comida_img) as ImageView
            var nombre = vista.findViewById(R.id.comida_nombre) as TextView
            var desc = vista.findViewById(R.id.comida_desc) as TextView
            var precio = vista.findViewById(R.id.comida_precio) as TextView

            imagen.setImageResource(com.image)
            nombre.setText(com.name)
            desc.setText(com.description)
            precio.setText("$${com.price}")
            return vista
        }


    }
}