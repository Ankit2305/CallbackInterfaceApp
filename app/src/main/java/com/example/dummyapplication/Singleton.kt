package com.example.dummyapplication

object Singleton {
    var myInterface: TestInterface? = null
    val cart = arrayListOf<String>(
            "Item1",
            "Item2",
            "Item3"
        )

    fun deleteItem(deleteItem: String) {
        cart.remove(deleteItem)
        myInterface?.notifyDelete(deleteItem)
    }


}