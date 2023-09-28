package com.example.mediator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Kirish
   Mediator patternni asosiy vazifasi, "ob'ektlar to'plamining o'zaro ta'sirini qamrab oladigan ob'ektni aniqlash".


Mediator pattern bir nechta ob'ektlar yoki sinflar o'rtasidagi aloqa murakkabligini kamaytirish uchun ishlatiladi.
Ushbu pattern odatda turli sinflar orasidagi barcha aloqalarni boshqaradigan vositachi sinfini taqdim etadi va bo'sh ulanish orqali kodni oson saqlashni qo'llab-quvvatlaydi.
    */

        //Mediatorning asosiy vazifasi bu bir nechta componentlarni bir-biri bilan bog'lab turishdan iborat.
        //Misol uchun samolyot boshqaruvini oladigan bo'lsan har bir uchib ketayotgan samolyotni dispetcher kuzatib turadi. Ya'ni samolyot komandiri har doim markaz ya'ni aeroprt bilan bog'lanib turishi kerak. Shunday samolyotlar esa bir nechta ularni barchasi shu aeroport bilan bog'lanib turadi. BU ham mediator patternga misol bo'la oladi.
        //hulosada Mediator patterni asosiy vazifasi boshqa komponentlarni o'zaro emas balki markazlashgan holatda aloqasini ta'minlab berish. BU ishni ancha ossonlashtiradi.
    }
}