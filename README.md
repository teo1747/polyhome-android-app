# PolyHome Android app

My House, an Android app in Kotlin that controls a simulated smart home on the PolyHome platform: sign in, pick a house, then switch its lights and move its shutters room by room, floor by floor or all at once, and choose who else may control it. An Android lab project (TP2, December 2024).

- **Account**: create an account and sign in; the server's token authorises every other request.
- **Houses**: the houses the user owns or has been given access to.
- **Access**: the owner lists, adds and removes the users who may control a house.
- **Rooms**: downstairs and upstairs, each room with its lights (on, off) and shutters (open, close, stop), the garage door among them.
- **Floor and house controls**: every light or shutter of a floor or of the house at once, or one device by its ID.

## PolyHome API

The app talks to `https://polyhome.lesmoulinsdudev.com` in JSON, with the token as a bearer token after sign-in.

| Request | Used for |
|---|---|
| `POST /api/users/register` | Creating an account |
| `POST /api/users/auth` | Signing in; returns the token |
| `GET /api/houses` | The user's houses |
| `GET`, `POST /api/houses/{houseId}/users` | Listing and adding the users with access |
| `DELETE /api/houses/{houseId}/users/{username}` | Removing a user's access |
| `POST /api/houses/{houseId}/devices/{deviceId}/command` | Sending `TURN ON`, `TURN OFF`, `OPEN`, `CLOSE` or `STOP` |

## Code

The project is in [2024-TP2-Kotlin](2024-TP2-Kotlin/), package `com.example.androidtp2`.

| File | Screen or role |
|---|---|
| [Api.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/Api.kt) | HTTP requests on `HttpURLConnection` in coroutines, JSON with Gson |
| [LoginActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/LoginActivity.kt), [RegisterActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/RegisterActivity.kt) | Sign-in and account creation |
| [HomeActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/HomeActivity.kt) | The user's houses |
| [MainHouseAccessActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/MainHouseAccessActivity.kt) | Users with access to a house |
| [HomePropertyActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/HomePropertyActivity.kt) | A house, with a bottom bar for the downstairs, upstairs and settings fragments |
| [RoomDeviceActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/RoomDeviceActivity.kt), [UpFloorDeviceActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/UpFloorDeviceActivity.kt) | A room's lights and shutters, downstairs and upstairs |
| [DownFloorSettingActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/DownFloorSettingActivity.kt), [UpFloorSettingActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/UpFloorSettingActivity.kt) | A whole floor's devices |
| [HomeSettingActivity.kt](2024-TP2-Kotlin/app/src/main/java/com/example/androidtp2/HomeSettingActivity.kt) | The whole house's devices, or one by its ID |

## Building

Open `2024-TP2-Kotlin` in Android Studio and run the `app` configuration on a device or an emulator with Android 7.0 (API 24) or later. The project uses Gradle 8.9 through its wrapper, the Android Gradle plugin 8.6.0, Kotlin 1.9.22 and SDK 34. Using the app needs an account on the PolyHome server, which the app can create.

## Authors

Mambo Motsou Junior Deogracias and Fonkoua Charle Luce Soriane.
