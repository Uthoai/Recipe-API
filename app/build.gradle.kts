plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.free.master.chef.recipe.meal.cook.recipeapi"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.free.master.chef.recipe.meal.cook.recipeapi"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding {
        enable = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // retrofit
    implementation(libs.retrofit)
    implementation(libs.retrofit.converter.gson)

    // coroutines
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)

    // view model
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.livedata)

    // navigation
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)

    //coil
    implementation(libs.io.coil)

    //exo player
    implementation(libs.media3.exoplayer)
    implementation(libs.media3.exoplayer.dash)
    implementation(libs.media3.ui)

}