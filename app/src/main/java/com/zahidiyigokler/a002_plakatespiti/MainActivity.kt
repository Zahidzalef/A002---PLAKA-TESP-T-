package com.zahidiyigokler.a002_plakatespiti

import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.zahidiyigokler.a002_plakatespiti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val a = ""
    var sehirr = ""
    var sehirrr = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }
    fun kod(view: View) {
        var kod = binding.editText2.text.toString()
        when(kod) {
            "1" -> sehirr = "Adana"
            "2" -> sehirr = a
            "3" -> sehirr = a
            "4" -> sehirr = a
            "5" -> sehirr = a
            "6" -> sehirr = a
            "7" -> sehirr = a
            "8" -> sehirr = a
            "9" -> sehirr = a
            "10" -> sehirr = a
            "11" -> sehirr = a
            "12" -> sehirr = a
            "13" -> sehirr = a
            "14" -> sehirr = a
            "15" -> sehirr = a
            "16" -> sehirr = a
            "17" -> sehirr = a
            "18" -> sehirr = a
            "19" -> sehirr = a
            "20" -> sehirr = a
            "21" -> sehirr = a
            "22" -> sehirr = a
            "23" -> sehirr = a
            "24" -> sehirr = a
            "25" -> sehirr = a
            "26" -> sehirr = a
            "27" -> sehirr = a
            "28" -> sehirr = a
            "29" -> sehirr = a
            "30" -> sehirr = a
            "31" -> sehirr = a
            "32" -> sehirr = a
            "33" -> sehirr = a
            "34" -> sehirr = a
            "35" -> sehirr = a
            "36" -> sehirr = a
            "37" -> sehirr = a
            "38" -> sehirr = a
            "39" -> sehirr = a
            "40" -> sehirr = a
            "41" -> sehirr = a
            "42" -> sehirr = a
            "43" -> sehirr = a
            "44" -> sehirr = a
            "45" -> sehirr = a
            "46" -> sehirr = a
            "47" -> sehirr = a
            "48" -> sehirr = a
            "49" -> sehirr = a
            "50" -> sehirr = a
            "51" -> sehirr = a
            "52" -> sehirr = a
            "53" -> sehirr = a
            "54" -> sehirr = a
            "55" -> sehirr = a
            "56" -> sehirr = a
            "57" -> sehirr = a
            "58" -> sehirr = a
            "59" -> sehirr = a
            "60" -> sehirr = a
            "61" -> sehirr = a
            "62" -> sehirr = a
            "63" -> sehirr = a
            "64" -> sehirr = a
            "65" -> sehirr = a
            "66" -> sehirr = a
            "67" -> sehirr = a
            "68" -> sehirr = a
            "69" -> sehirr = a
            "70" -> sehirr = a
            "71" -> sehirr = a
            "72" -> sehirr = a
            "73" -> sehirr = a
            "74" -> sehirr = a
            "75" -> sehirr = a
            "76" -> sehirr = a
            "77" -> sehirr = a
            "78" -> sehirr = a
            "79" -> sehirr = a
            "80" -> sehirr = a
            "81" -> sehirr = a
            else -> sehirr = a

        }
        binding.textView.text = sehirr

    }
    fun sehir(view: View) {
        var sehir = binding.editText1.text.toString()
        when (sehir) {
            "adana"  -> sehirrr = 1
            "Konaya" -> sehirrr = 2
            "Ko1nya" -> sehirrr = 3
            "Kaonya" -> sehirrr = 4
            "Kon2ya" -> sehirrr = 5
            "Konyda" -> sehirrr = 6
            "Ko3nya" -> sehirrr = 7
            "Konsya" -> sehirrr = 8
            "Kony4a" -> sehirrr = 9
            "Kony5a" -> sehirrr = 10
            "Kon8ya" -> sehirrr = 11
            "Keonsa" -> sehirrr = 12
            "Kon9ya" -> sehirrr = 13
            "Kon0ya" -> sehirrr = 14
            "Kon5ya" -> sehirrr = 15
            "Konfsa" -> sehirrr = 16
            "Kony2a" -> sehirrr = 17
            "Konwya" -> sehirrr = 18
            "Koqnya" -> sehirrr = 19
            "Koanya" -> sehirrr = 20
            "Konysa" -> sehirrr = 21
            "Keonya" -> sehirrr = 22
            "Konyxa" -> sehirrr = 23
            "Konyaa" -> sehirrr = 24
            "Kon1ys" -> sehirrr = 25
            "Kon11a" -> sehirrr = 26
            "Konya1" -> sehirrr = 27
            "Kqonya" -> sehirrr = 28
            "Konyqa" -> sehirrr = 29
            "Konqya" -> sehirrr = 30
            "Koqüya" -> sehirrr = 31
            "Koqnüa" -> sehirrr = 32
            "Koqqya" -> sehirrr = 33
            "K/onya" -> sehirrr = 34
            "Ko/nya" -> sehirrr = 35
            "Kon/ya" -> sehirrr = 36
            "/Konya" -> sehirrr = 37
            "K/n/ya" -> sehirrr = 38
            "Konppa" -> sehirrr = 39
            "Kon//a" -> sehirrr = 40
            "Konya/" -> sehirrr = 41
            "Konya"  -> sehirrr = 42
            "Konıya"  -> sehirrr = 43
            "Koınya"  -> sehirrr = 44
            "Konya*"  -> sehirrr = 45
            "Kony*a"  -> sehirrr = 46
            "Kon*ya"  -> sehirrr = 47
            "Ko*nya"  -> sehirrr = 48
            "K*onya"  -> sehirrr = 49
            "*Konya"  -> sehirrr = 50
            "+Konya"  -> sehirrr = 51
            "K+onya"  -> sehirrr = 52
            "Ko+nya"  -> sehirrr = 53
            "Kon+y+a"  -> sehirrr = 54
            "Konya+"  -> sehirrr = 55
            "Kony+a"  -> sehirrr = 56
            "Kon+ya"  -> sehirrr = 57
            "Kon-ya"  -> sehirrr = 58
            "Kon-y+a"  -> sehirrr = 59
            "K-onya"  -> sehirrr = 60
            "Ko+-nya"  -> sehirrr = 61
            "K-on-ya"  -> sehirrr = 62
            "K--"  -> sehirrr = 63
            "--ya"  -> sehirrr = 64
            "K-on--ya"  -> sehirrr = 65
            "ewt"  -> sehirrr = 66
            "tw"  -> sehirrr = 67
            "sf"  -> sehirrr = 68
            "wt"  -> sehirrr = 69
            "w5tt"  -> sehirrr = 70
            "Ktwnya"  -> sehirrr = 71
            "Ko5tnya"  -> sehirrr = 72
            "55Konya"  -> sehirrr = 73
            "K45tonya"  -> sehirrr = 74
            "Kon5tya"  -> sehirrr = 75
            "Kon53tya"  -> sehirrr = 76
            "Konw35tya"  -> sehirrr = 77
            "Konwtwya"  -> sehirrr = 78
            "Konwtya"  -> sehirrr = 79
            "eww5twt"  -> sehirrr = 80
            "Kottnya"  -> sehirrr = 81

        }
        binding.textView.text = "${sehirrr} "
    }
    fun main(sayi:Int,kelime:String){
        if (sayi == 1 || kelime =="Adana") {
            sehirr = "Adana"
        }
        binding.textView.text = sehirr
    }
}