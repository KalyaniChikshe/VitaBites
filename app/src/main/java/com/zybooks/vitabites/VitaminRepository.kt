package com.zybooks.vitabites

import android.content.Context

class VitaminRepository private constructor(context: Context) {

    var vitaminList: MutableList<Vitamin> = mutableListOf()

    companion object {
        private var instance: VitaminRepository? = null

        fun getInstance(context: Context): VitaminRepository {
            if (instance == null) {
                instance = VitaminRepository(context)
            }
            return instance!!
        }
    }

    init {
        val vitamins = context.resources.getStringArray(R.array.vitamins)
        val vitaminAFoodsArray = context.resources.getStringArray(R.array.vitamin_a_foods)
        val vitaminBFoodsArray = context.resources.getStringArray(R.array.vitamin_b12_foods)
        val vitaminCFoodsArray = context.resources.getStringArray(R.array.vitamin_c_foods)

        for (i in vitamins.indices) {
            val foods = when (i + 1) {
                1 -> vitaminAFoodsArray
                2 -> vitaminBFoodsArray
                3 -> vitaminCFoodsArray
                else -> emptyArray()
            }
            vitaminList.add(Vitamin(i + 1, vitamins[i], foods))
        }

        }
    fun getVitamin(vitaminId: Int): Vitamin? {
        return vitaminList.find { it.id == vitaminId }
    }
}



