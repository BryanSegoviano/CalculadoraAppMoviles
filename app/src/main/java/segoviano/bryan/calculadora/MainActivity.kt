package segoviano.bryan.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtAbajo:TextView = findViewById(R.id.txtAbajo)
        val txtArriba:TextView = findViewById(R.id.txtArriba)

        val btnSuma: Button = findViewById(R.id.btnSuma)
        val btnResta: Button = findViewById(R.id.btnResta)
        val btnMultiplicar: Button = findViewById(R.id.btnMultiplicar)
        val btnDividir: Button = findViewById(R.id.btnDividir)

        val btnResultado: Button = findViewById(R.id.btnResultado)
        val btnBorrar: Button = findViewById(R.id.btnBorrar)
        val btnPunto: Button = findViewById(R.id.btnPunto)

        val btnCero: Button = findViewById(R.id.btn0)
        val btnUno: Button = findViewById(R.id.btn1)
        val btnDos: Button = findViewById(R.id.btn2)
        val btnTres: Button = findViewById(R.id.btn3)
        val btnCuatro: Button = findViewById(R.id.btn4)
        val btnCinco: Button = findViewById(R.id.btn5)
        val btnSeis: Button = findViewById(R.id.btn6)
        val btnSiete: Button = findViewById(R.id.btn7)
        val btnOcho: Button = findViewById(R.id.btn8)
        val btnNueve: Button = findViewById(R.id.btn9)

        var numAbajo: String = ""
        var numArriba: String = ""
        var tipoOperacion: String = ""

        btnPunto.setOnClickListener(){
            var validar: Boolean = false
            for (i in 0..numAbajo.length-1){
                val c = numAbajo[i]
                if (c == '.'){
                    validar = true
                }
            }
            if(!validar){
                numAbajo += "."
                txtAbajo.setText(numAbajo)
            }

        }

        btnCero.setOnClickListener(){
            numAbajo += "0"
            txtAbajo.setText(numAbajo)
        }

        btnUno.setOnClickListener(){
            numAbajo += "1"
            txtAbajo.setText(numAbajo)
        }

        btnDos.setOnClickListener(){
            numAbajo += "2"
            txtAbajo.setText(numAbajo)
        }

        btnTres.setOnClickListener(){
            numAbajo += "3"
            txtAbajo.setText(numAbajo)
        }

        btnCuatro.setOnClickListener(){
            numAbajo += "4"
            txtAbajo.setText(numAbajo)
        }

        btnCinco.setOnClickListener(){
            numAbajo += "5"
            txtAbajo.setText(numAbajo)
        }

        btnSeis.setOnClickListener(){
            numAbajo += "6"
            txtAbajo.setText(numAbajo)
        }

        btnSiete.setOnClickListener(){
            numAbajo += "7"
            txtAbajo.setText(numAbajo)
        }

        btnOcho.setOnClickListener(){
            numAbajo += "8"
            txtAbajo.setText(numAbajo)
        }

        btnNueve.setOnClickListener(){
            numAbajo += "9"
            txtAbajo.setText(numAbajo)
        }

//////////////////////////////////////////////////////////

        btnSuma.setOnClickListener(){
            tipoOperacion = "+"
            numArriba = numAbajo
            numAbajo = ""
            txtArriba.setText("$numArriba + ")
            txtAbajo.setText("0.0")
        }

        btnResta.setOnClickListener(){
            tipoOperacion = "-"
            numArriba = numAbajo
            numAbajo = ""
            txtArriba.setText("$numArriba - ")
            txtAbajo.setText("0.0")
        }

        btnMultiplicar.setOnClickListener(){
            tipoOperacion = "*"
            numArriba = numAbajo
            numAbajo = ""
            txtArriba.setText("$numArriba *")
            txtAbajo.setText("0.0")
        }

        btnDividir.setOnClickListener(){
            tipoOperacion = "/"
            numArriba = numAbajo
            numAbajo = ""
            txtArriba.setText("$numArriba / ")
            txtAbajo.setText("0.0")
        }

//////////////////////////////////////////////////////////

        btnResultado.setOnClickListener(){
            if(!(numArriba.isEmpty()) && !(numAbajo.isEmpty())){
                val numArribaConvertido: Float = numArriba.toFloat()
                val numAbajoConvertido: Float = numAbajo.toFloat()
                var resultado: Float = 0f

                if (tipoOperacion == ""){

                }

                if (tipoOperacion == "+"){
                    resultado = numArribaConvertido + numAbajoConvertido
                }

                if (tipoOperacion == "-"){
                    resultado = numArribaConvertido - numAbajoConvertido
                }

                if (tipoOperacion == "*"){
                    resultado = numArribaConvertido * numAbajoConvertido
                }

                if (tipoOperacion == "/"){
                    resultado = numArribaConvertido / numAbajoConvertido
                }


                txtArriba.setText("$numArriba $tipoOperacion $numAbajo")
                numArriba = ""
                numAbajo = resultado.toString()
                txtAbajo.setText("$resultado")
            }

        }

        btnBorrar.setOnClickListener(){
            numAbajo = ""
            txtAbajo.setText("0.0")
            txtArriba.setText("0.0")
        }


    }
}