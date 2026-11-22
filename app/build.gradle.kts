plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.goldxhunter.currencycalculator"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.goldxhunter.currencycalculator"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "2.0"
    }
}
