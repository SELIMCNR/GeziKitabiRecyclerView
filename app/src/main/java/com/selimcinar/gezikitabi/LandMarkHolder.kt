package com.selimcinar.gezikitabi

import android.content.Intent
import android.telecom.Call.Details
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.selimcinar.gezikitabi.databinding.RecyclerRowBinding


class LandMarkAdapter(val landMarkList:ArrayList<Landmark>) : RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder>() {
    class LandMarkHolder (val binding: RecyclerRowBinding ):RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): LandMarkHolder {
        TODO("Not yet implemented")
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  LandMarkHolder(binding)
    }

    override fun onBindViewHolder(holder: LandMarkHolder, position: Int) {
        TODO("Not yet implemented")
        holder.binding.rowtext.text=landMarkList.get(position).name // listede adları getir

        holder.itemView.setOnClickListener{
         val intent= Intent (holder.itemView.context,Details::class.java)
     //  choosenLandmark=landMarkList.get(position)
            //     intent.putExtra("Landmark",landMarkList.get(position))
        holder.itemView.context.startActivity(intent)
        }



    }

    override fun getItemCount(): Int {
        return landMarkList.size
    }


}