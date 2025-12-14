package com.example.iuca

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AlertDialog

class CountryAdapter(
    val countryName: List<String>,
    val countryDetail: List<String>,
    val countryFlag: List<Int>,
    val context: Context,
) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CountryViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.card_design, parent, false)

        return CountryViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: CountryViewHolder,
        position: Int
    ) {
        holder.countryNameTextView.text = countryName[position]
        holder.countryDetailTextView.text = countryDetail[position]
        holder.countryFlag.setImageResource(countryFlag[position])

        holder.cardView.setOnClickListener {
            when (position % 3) {
                0 -> {
                    Toast.makeText(
                        context,
                        "You've pressed ${countryName[position]}",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                1 -> {
                    com.google.android.material.snackbar.Snackbar.make(
                        holder.itemView,
                        "Snackbar: ${countryName[position]} selected",
                        com.google.android.material.snackbar.Snackbar.LENGTH_LONG
                    ).show()
                }
                2 -> {
                    androidx.appcompat.app.AlertDialog.Builder(context)
                        .setTitle(countryName[position])
                        .setMessage(countryDetail[position])
                        .setPositiveButton("OK", null)
                        .show()
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return countryName.size
    }


    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val countryNameTextView: TextView = itemView.findViewById(R.id.countryName)
        val countryDetailTextView: TextView = itemView.findViewById(R.id.countryDetail)
        val countryFlag: CircleImageView = itemView.findViewById(R.id.countryFlag)

        val cardView: CardView = itemView.findViewById(R.id.cardView)
    }
}