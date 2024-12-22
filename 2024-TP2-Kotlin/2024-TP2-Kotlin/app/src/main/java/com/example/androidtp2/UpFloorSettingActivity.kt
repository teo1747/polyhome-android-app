package com.example.androidtp2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class UpFloorSettingActivity : AppCompatActivity() {

    private var homeId: Int = -1
    private var token: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_up_floor_setting)

        // Retrieve HOME_ID and TOKEN from intent
        homeId = intent.getIntExtra("HOME_ID", -1)
        token = intent.getStringExtra("TOKEN") ?: ""

        if (homeId == -1 || token.isEmpty()) {
            Toast.makeText(this, "Invalid Home ID or Token", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Lights Control
        findViewById<Button>(R.id.upFloorLightsOnButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Light 2.1", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.2", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.3", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.4", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.5", "TURN ON")
        }
        findViewById<Button>(R.id.upFloorLightsOffButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Light 2.1", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.2", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.3", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.4", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.5", "TURN OFF")
        }

        // Shutter Controls
        findViewById<Button>(R.id.upFloorShuttersOpenButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Shutter 2.1", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.2", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.3", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.4", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.5", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.6", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.7", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.8", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.9", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 2.10", "OPEN")

        }
        findViewById<Button>(R.id.upFloorShuttersCloseButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Shutter 2.1", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.2", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.3", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.4", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.5", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.6", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.7", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.8", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.9", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 2.10", "CLOSE")
        }
        findViewById<Button>(R.id.upFloorShuttersStopButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Shutter 2.1", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.2", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.3", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.4", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.5", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.6", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.7", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.8", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.9", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 2.10", "STOP")
        }
    }

    private fun sendDeviceCommand(homeId: Int, token: String, deviceId: String, command: String) {
        Api().post(
            path = "https://polyhome.lesmoulinsdudev.com/api/houses/$homeId/devices/$deviceId/command",
            data = mapOf("command" to command),
            onSuccess = { responseCode ->
                runOnUiThread {
                    if (responseCode == 200) {
                        Toast.makeText(this, "Command sent successfully", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Failed to send command", Toast.LENGTH_SHORT).show()
                    }
                }
            },
            securityToken = token
        )
    }
}
