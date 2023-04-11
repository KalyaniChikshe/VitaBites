package com.zybooks.vitabites

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment

const val ARG_VITAMIN_ID = "vitamin_id"
class FoodFragment : Fragment() {
    private var vitamin: Vitamin? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var vitaminId = 1

        // Get the vitamin ID from the fragment arguments
        arguments?.let { vitaminId = it.getInt(ARG_VITAMIN_ID) }

        // Get the selected vitamin
        vitamin = VitaminRepository.getInstance(requireContext()).getVitamin(vitaminId)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.fragment_food, container, false)

        if (vitamin != null) {
            val nameTextView = rootView.findViewById<TextView>(R.id.vitamin_name)
            nameTextView.text = vitamin!!.name
            var vitaminId = 1
            arguments?.let { vitaminId = it.getInt(ARG_VITAMIN_ID) }

            when (vitaminId) {
                1 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminAFoodsArray = resources.getStringArray(R.array.vitamin_a_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminAFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                2 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_b12_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                3 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_c_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                4 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminAFoodsArray = resources.getStringArray(R.array.vitamin_d_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminAFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                5 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_e_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                6 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_k_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                7 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminAFoodsArray = resources.getStringArray(R.array.vitamin_b6_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminAFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                8 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_b9_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                9 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_b3_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                10 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminAFoodsArray = resources.getStringArray(R.array.vitamin_zn_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminAFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                11 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_mg_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                12 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_ca_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                13 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_fe_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                14 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_b7_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                15 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_omega_3_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }
                16 -> {
                    val descriptionListView = rootView.findViewById<ListView>(R.id.food_description)
                    val vitaminBFoodsArray = resources.getStringArray(R.array.vitamin_cr_foods)
                    val adapter = ArrayAdapter(
                        requireContext(),
                        android.R.layout.simple_list_item_1,
                        vitaminBFoodsArray
                    )
                    descriptionListView.adapter = adapter
                }

            }

        }

        return rootView
    }


}