package com.smartherd.globofly.activities

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.aditya.travelguid.R
import com.aditya.travelguid.activities.DestinationCreateActivity
import com.aditya.travelguid.helpers.SampleData

import com.smartherd.globofly.helpers.DestinationAdapter

import kotlinx.android.synthetic.main.activity_destiny_list.*

class DestinationListActivity : AppCompatActivity() {

	@RequiresApi(Build.VERSION_CODES.O)
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_destiny_list)

		setSupportActionBar(toolbar as Toolbar?)
		toolbar.tooltipText = title

		fab.setOnClickListener {
			val intent = Intent(this@DestinationListActivity, DestinationCreateActivity::class.java)
			startActivity(intent)
		}
	}

	override fun onResume() {
		super.onResume()

		loadDestinations()
	}

	private fun loadDestinations() {

        // To be replaced by retrofit code
		destiny_recycler_view.adapter = DestinationAdapter(SampleData.DESTINATIONS)
    }
}
