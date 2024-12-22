package com.example.androidtp2

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment

class SettingsFragment : Fragment() {

    private var homeId: Int = -1
    private var token: String = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_settings, container, false)

        homeId = arguments?.getInt("HOME_ID", -1) ?: -1
        token = arguments?.getString("TOKEN") ?: ""

        if (homeId == -1 || token.isEmpty()) {
            Toast.makeText(requireContext(), "Missing Home ID or Token", Toast.LENGTH_SHORT).show()
            return view
        }

        // Bind icons
        val upFloorSettingIcon = view.findViewById<ImageView>(R.id.upFloorSettingIcon)
        val downFloorSettingIcon = view.findViewById<ImageView>(R.id.downFloorSettingIcon)
        val homeSettingIcon = view.findViewById<ImageView>(R.id.homeSettingIcon)

        // Set click listeners
        upFloorSettingIcon.setOnClickListener {
            val intent = Intent(requireContext(), UpFloorSettingActivity::class.java)
            intent.putExtra("HOME_ID", homeId)
            intent.putExtra("TOKEN", token)
            startActivity(intent)
        }

        downFloorSettingIcon.setOnClickListener {
            val intent = Intent(requireContext(), DownFloorSettingActivity::class.java)
            intent.putExtra("HOME_ID", homeId)
            intent.putExtra("TOKEN", token)
            startActivity(intent)
        }


        homeSettingIcon.setOnClickListener {
            val intent = Intent(requireContext(), HomeSettingActivity::class.java)
            intent.putExtra("HOME_ID", homeId)
            intent.putExtra("TOKEN", token)
            startActivity(intent)
        }

        return view
    }
}
