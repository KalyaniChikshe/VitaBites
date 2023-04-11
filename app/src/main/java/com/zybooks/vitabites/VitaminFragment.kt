package com.zybooks.vitabites



import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView



class VitaminFragment : Fragment() {
    private lateinit var adapter: VitaminAdapter

        override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                                  savedInstanceState: Bundle?): View {
            val rootView = inflater.inflate(R.layout.fragment_vitamin, container, false)

            // Click listener for the RecyclerView
            val onClickListener = View.OnClickListener { itemView: View ->

                // Create fragment arguments containing the selected vitamin ID
                val selectedVitaminId = itemView.tag as Int
                val args = Bundle()
                args.putInt(ARG_VITAMIN_ID, selectedVitaminId)


                Navigation.findNavController(itemView).navigate(R.id.show_food, args)
            }

            // Send vitamins to RecyclerView
            val recyclerView = rootView.findViewById<RecyclerView>(R.id.vitamin_list)
            val vitamins = VitaminRepository.getInstance(requireContext()).vitaminList
            val divider = DividerItemDecoration(recyclerView.context, DividerItemDecoration.VERTICAL)
            recyclerView.addItemDecoration(divider)
            recyclerView.adapter = VitaminAdapter(vitamins, onClickListener)

            return rootView
        }


        private class VitaminAdapter(private val vitaminList: List<Vitamin>,
                                     private val onClickListener: View.OnClickListener) :
            RecyclerView.Adapter<VitaminHolder>() {
            private var textSize = 30f

            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VitaminHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                return VitaminHolder(layoutInflater, parent)
            }

            override fun onBindViewHolder(holder: VitaminHolder, position: Int) {
                val vitamin = vitaminList[position]
                holder.bind(vitamin, textSize)
                holder.itemView.tag = vitamin.id
                holder.itemView.setOnClickListener(onClickListener)
            }

            override fun getItemCount(): Int {
                return vitaminList.size
            }

        }

            class VitaminHolder(inflater: LayoutInflater, parent: ViewGroup?) :
            RecyclerView.ViewHolder(inflater.inflate(R.layout.vitamin_list, parent, false)) {

            private val nameTextView: TextView


            init {
                nameTextView = itemView.findViewById(R.id.vitamin_name)
            }


            fun bind(vitamin: Vitamin, textSize: Float) {
                nameTextView.text = vitamin.name
                nameTextView.textSize = textSize
                itemView.tag = vitamin
            }

        }

}