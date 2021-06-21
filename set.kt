package com.example.bakirciezgi_celebquiz

import android.os.Build.ID

object set {
    const val score:String="score"

    fun getAnswer() : ArrayList<Data>{
        var list: ArrayList <Data> = arrayListOf()
        var a1 = Data(1, "Rihanna", "Taylor Swift","Adele", 3)
        var a2= Data( 2, "Beyonce", "Angelina Jolie", "Katy Perry", 2)
        var a3= Data( 3 , "Emilia Clarke","Kate Moss","Adele", 1)
        var a4= Data( 4, "Eminem", "Michael Buble", "Tom Cruise", 1)
        var a5=Data( 5, "Drake", "Michael Jackson", "Will Smith", 2)
        var a6=Data( 6, "Jennifer Lopez", "Taylor Swift", "Natalie Portman",3)
        var a7=Data( 7, "Robert Downey Jr.", "George Clooney", "Josh Radnor", 1 )
        var a8=Data( 8 , "Michael Jackson", "Will Smith", "Snoop Dog", 2 )

        list.add(a1)
        list.add(a2)
        list.add(a3)
        list.add(a4)
        list.add(a5)
        list.add(a6)
        list.add(a7)
        list.add(a8)


        return list
    }
}