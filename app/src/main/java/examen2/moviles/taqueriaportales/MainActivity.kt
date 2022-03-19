package examen2.moviles.taqueriaportales

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var platillos: ArrayList<Platillo> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun llenarPlatillos() {
        platillos.add(
            Platillo(
                1,
                R.string.tacoTradicional.toString(),
                R.string.tacoTradicionalDesc.toString(),
                R.string.tacos.toString(),
                2.35.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                2,
                R.string.tacoPescado.toString(),
                R.string.tacoPescadoDesc.toString(),
                R.string.tacos.toString(),
                2.35.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                3,
                R.string.quesadillas.toString(),
                R.string.quesadillas.toString(),
                R.string.antojitos.toString(),
                4.75.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                4,
                R.string.huaraches.toString(),
                R.string.huarachesdesc.toString(),
                R.string.antojitos.toString(),
                9.87.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                5,
                R.string.gringas.toString(),
                R.string.gringasdesc.toString(),
                R.string.antojitos.toString(),
                6.47.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                6,
                R.string.sincronizadas.toString(),
                R.string.sincronizadasdesc.toString(),
                R.string.antojitos.toString(),
                6.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                7,
                R.string.sopes.toString(),
                R.string.sopesdesc.toString(),
                R.string.antojitos.toString(),
                3.39.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                8,
                R.string.tostadas.toString(),
                R.string.tostadasdesc.toString(),
                R.string.antojitos.toString(),
                3.55.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                9,
                R.string.mojarrafrita.toString(),
                R.string.mojarradesc.toString(),
                R.string.especialidades.toString(),
                14.79.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                10,
                R.string.tostadasceviche.toString(),
                R.string.tostadasdesc.toString(),
                R.string.especialidades.toString(),
                2.99.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                11,
                R.string.fajitaburrito.toString(),
                R.string.fajitaburritodesc.toString(),
                R.string.especialidades.toString(),
                11.79.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                12,
                R.string.botanadecamarones.toString(),
                R.string.botanadecamaronesdesc.toString(),
                R.string.especialidades.toString(),
                17.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                13,
                R.string.coctelcamaron.toString(),
                R.string.coctelcamarondesc.toString(),
                R.string.especialidades.toString(),
                14.79.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                14,
                R.string.larger.toString(),
                R.string.largerdesc.toString(),
                R.string.caldos.toString(),
                10.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                15,
                R.string.camaron.toString(),
                R.string.caldocamarondesc.toString(),
                R.string.especialidades.toString(),
                11.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                16,
                R.string.tacocombo.toString(),
                R.string.tacocombodesc.toString(),
                R.string.combinations.toString(),
                6.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                17,
                R.string.mexicanburritos.toString(),
                R.string.mexicanburritosdesc.toString(),
                R.string.combinations.toString(),
                10.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                18,
                R.string.losportalesburrito.toString(),
                R.string.losportalesburritodesc.toString(),
                R.string.combinations.toString(),
                11.79.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                19,
                R.string.cinco.toString(),
                R.string.cincodesc.toString(),
                R.string.combinations.toString(),
                7.67.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                20,
                R.string.dosamigos.toString(),
                R.string.dosamigosdesc.toString(),
                R.string.combinations.toString(),
                8.25.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                21,
                R.string.burritopepe.toString(),
                R.string.burritopepedesc.toString(),
                R.string.combinations.toString(),
                6.89.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                22,
                R.string.tortaregular.toString(),
                R.string.tortaregulardesc.toString(),
                R.string.tortas.toString(),
                10.95.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                23,
                R.string.tortamilanesa.toString(),
                R.string.tortamilanesadesc.toString(),
                R.string.tortas.toString(),
                11.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                24,
                R.string.tortacubana.toString(),
                R.string.tortacubanadesc.toString(),
                R.string.tortas.toString(),
                12.35.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                25,
                R.string.tortamixta.toString(),
                R.string.tortamixtadesc.toString(),
                R.string.tortas.toString(),
                11.99.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                26,
                R.string.smallmexicantorta.toString(),
                R.string.smallmexicantortadesc.toString(),
                R.string.tortas.toString(),
                10.95.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                27,
                R.string.pozole.toString(),
                R.string.pozoledesc.toString(),
                R.string.sopas.toString(),
                5.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                28,
                R.string.menudo.toString(),
                R.string.menudodesc.toString(),
                R.string.sopas.toString(),
                5.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                29,
                R.string.caldores.toString(),
                R.string.caldoresdesc.toString(),
                R.string.sopas.toString(),
                5.99.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                30,
                R.string.caldocamaron.toString(),
                R.string.caldocamarondesc.toString(),
                R.string.sopas.toString(),
                10.69.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                31,
                R.string.sopamariscos.toString(),
                R.string.sopamariscosdesc.toString(),
                R.string.sopas.toString(),
                15.75.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                32,
                R.string.coctelcamaron.toString(),
                R.string.coctelcamarondesc.toString(),
                R.string.sopas.toString(),
                13.50.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                33,
                R.string.sideguacamole.toString(),
                R.string.sideguacamoledesc.toString(),
                R.string.sideorders.toString(),
                3.75.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                34,
                R.string.siderice.toString(),
                R.string.sidericedesc.toString(),
                R.string.sideorders.toString(),
                1.99.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                35,
                R.string.sidebeans.toString(),
                R.string.sidebeansdesc.toString(),
                R.string.sideorders.toString(),
                1.99.toFloat(),
                R.drawable.fondoInicio
            )
        )
        platillos.add(
            Platillo(
                36,
                R.string.chipssalsa.toString(),
                R.string.chipssalsadesc.toString(),
                R.string.sideorders.toString(),
                2.25.toFloat(),
                R.drawable.fondoInicio
            )
        )

        platillos.add(
            Platillo(
                33,
                R.string.flourtacos.toString(),
                R.string.flourtacosdesc.toString(),
                R.string.sideorders.toString(),
                2.99.toFloat(),
                R.drawable.fondoInicio
            )
        )





    }
}