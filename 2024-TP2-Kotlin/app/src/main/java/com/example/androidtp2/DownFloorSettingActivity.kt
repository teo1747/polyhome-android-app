package com.example.androidtp2

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DownFloorSettingActivity : AppCompatActivity() {

    private var homeId: Int = -1
    private var token: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_down_floor_setting)

        // Retrieve HOME_ID and TOKEN from intent
        homeId = intent.getIntExtra("HOME_ID", -1)
        token = intent.getStringExtra("TOKEN") ?: ""

        if (homeId == -1 || token.isEmpty()) {
            Toast.makeText(this, "Invalid Home ID or Token", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Lights Control
        findViewById<Button>(R.id.downFloorLightsOnButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Light 1.1", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.2", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.3", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.4", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.5", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.6", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.7", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.8", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.9", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.10", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 1.11", "TURN ON")

        }
        findViewById<Button>(R.id.downFloorLightsOffButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Light 1.2", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.3", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.4", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.5", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.6", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.7", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.8", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.9", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.10", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 1.11", "TURN OFF")
        }

        // Shutter Controls
        findViewById<Button>(R.id.downFloorShuttersOpenButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Shutter 1.1", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.2", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.3", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.4", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.5", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.6", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.7", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.8", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.9", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.10", "OPEN")
            sendDeviceCommand(homeId, token, "Shutter 1.11", "OPEN")
        }
        findViewById<Button>(R.id.downFloorShuttersCloseButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Shutter 1.1", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.2", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.3", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.4", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.5", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.6", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.7", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.8", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.9", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.10", "CLOSE")
            sendDeviceCommand(homeId, token, "Shutter 1.11", "CLOSE")
        }
        findViewById<Button>(R.id.downFloorShuttersStopButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Shutter 1.1", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.2", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.3", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.4", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.5", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.6", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.7", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.8", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.9", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.10", "STOP")
            sendDeviceCommand(homeId, token, "Shutter 1.11", "STOP")
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