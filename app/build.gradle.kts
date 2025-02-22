plugins {
    alias(libs.plugins.android.application)
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.javachat"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.javachat"
        minSdk = 29
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        multiDexEnabled = true

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.messaging)
    implementation(libs.firebase.firestore)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // Firebase
    implementation(libs.firebase.bom)
    implementation (libs.firebase.messaging)
    implementation (libs.firebase.firestore)
    implementation ("com.google.firebase:firebase-admin:9.4.3")

    // Scalable size unit
    implementation(libs.sdp.android)
    implementation(libs.ssp.android)

    // Rounded ImageView
    implementation(libs.roundedimageview)

    // MultiDex
    implementation(libs.multidex)

    //Retrofit
    implementation(libs.retrofit)
    implementation(libs.converter.scalars)
}