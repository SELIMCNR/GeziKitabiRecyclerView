package com.selimcinar.gezikitabi

import android.content.Intent
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.selimcinar.gezikitabi.Landmark
import com.selimcinar.gezikitabi.R
import com.selimcinar.gezikitabi.databinding.ActivityMainBinding

//var choosenLandmark : Landmark? =null
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList:ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        landmarkList = ArrayList<Landmark>()

        //Data
        val konya = Landmark("Konya","Türkiye", R.drawable.simge)
        val nevşehir= Landmark("Nevşehir","Türkiye",R.drawable.simge2)
        val antalya = Landmark("Antalya","Türkiye",R.drawable.simge3)
        val ankara = Landmark("Ankara","Türkiye",R.drawable.simge4)

        landmarkList.add(konya)
        landmarkList.add(nevşehir)
        landmarkList.add(antalya)
        landmarkList.add(ankara)

        binding.recyclerView.layoutManager= LinearLayoutManager(this)
        val landmarkAdapter = LandMarkAdapter(landmarkList) // adapter ile liste bağlandı
        binding.recyclerView.adapter = landmarkAdapter

    }
}