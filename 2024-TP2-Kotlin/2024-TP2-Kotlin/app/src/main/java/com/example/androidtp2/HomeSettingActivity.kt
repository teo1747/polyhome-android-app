package com.example.androidtp2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomeSettingActivity : AppCompatActivity() {

    private var homeId: Int = -1
    private var token: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_setting)

        // Retrieve HOME_ID and TOKEN from intent
        homeId = intent.getIntExtra("HOME_ID", -1)
        token = intent.getStringExtra("TOKEN") ?: ""

        if (homeId == -1 || token.isEmpty()) {
            Toast.makeText(this, "Invalid Home ID or Token", Toast.LENGTH_SHORT).show()
            finish()
            return
        }

        // Lights Control
        findViewById<Button>(R.id.homeLightsOnButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Light 2.1", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.2", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.3", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.4", "TURN ON")
            sendDeviceCommand(homeId, token, "Light 2.5", "TURN ON")

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
        findViewById<Button>(R.id.homeLightsOffButton).setOnClickListener {
            sendDeviceCommand(homeId, token, "Light 1.1", "TURN ON")
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

            sendDeviceCommand(homeId, token, "Light 2.1", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.2", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.3", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.4", "TURN OFF")
            sendDeviceCommand(homeId, token, "Light 2.5", "TURN OFF")
        }

        // Shutter Controls
        findViewById<Button>(R.id.homeShuttersOpenButton).setOnClickListener {
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
        findViewById<Button>(R.id.homeShuttersCloseButton).setOnClickListener {
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
        findViewById<Button>(R.id.homeShuttersStopButton).setOnClickListener {
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

        // Specific Light Control by ID
        val lightIdInput = findViewById<EditText>(R.id.lightIdInput)
        findViewById<Button>(R.id.turnOnLightByIdButton).setOnClickListener {
            val lightId = lightIdInput.text.toString().trim()
            if (lightId.isNotEmpty()) {
                sendDeviceCommand(homeId, token, lightId, "TURN ON")
            } else {
                Toast.makeText(this, "Please enter a valid Light ID", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.turnOffLightByIdButton).setOnClickListener {
            val lightId = lightIdInput.text.toString().trim()
            if (lightId.isNotEmpty()) {
                sendDeviceCommand(homeId, token, lightId, "TURN OFF")
            } else {
                Toast.makeText(this, "Please enter a valid Light ID", Toast.LENGTH_SHORT).show()
            }
        }

        // Specific Shutter Control by ID
        val shutterIdInput = findViewById<EditText>(R.id.shutterIdInput)
        findViewById<Button>(R.id.openShutterByIdButton).setOnClickListener {
            val shutterId = shutterIdInput.text.toString().trim()
            if (shutterId.isNotEmpty()) {
                sendDeviceCommand(homeId, token, shutterId, "OPEN")
            } else {
                Toast.makeText(this, "Please enter a valid Shutter ID", Toast.LENGTH_SHORT).show()
            }
        }
        findViewById<Button>(R.id.closeShutterByIdButton).setOnClickListener {
            val shutterId = shutterIdInput.text.toString().trim()
            if (shutterId.isNotEmpty()) {
                sendDeviceCommand(homeId, token, shutterId, "CLOSE")
            } else {
                Toast.makeText(this, "Please enter a valid Shutter ID", Toast.LENGTH_SHORT).show()
            }
        }
        findViewById<Button>(R.id.stopShutterByIdButton).setOnClickListener {
            val shutterId = shutterIdInput.text.toString().trim()
            if (shutterId.isNotEmpty()) {
                sendDeviceCommand(homeId, token, shutterId, "STOP")
            } else {
                Toast.makeText(this, "Please enter a valid Shutter ID", Toast.LENGTH_SHORT).show()
            }
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
