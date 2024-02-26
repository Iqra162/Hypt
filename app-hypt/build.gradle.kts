plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hypt.app"
    compileSdk = Version.compileSdk

    defaultConfig {
        applicationId = "com.hypt.app"
        minSdk = Version.minSdk
        targetSdk = Version.compileSdk
        versionCode = Version.versionCode
        versionName = Version.versionName

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
        jvmTarget = Version.jvmTarget
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(project("path" to FeatureModules.authUI))
    implementation(project("path" to FeatureModules.navigation))
    implementation(project("path" to FeatureModules.mainUI))
    implementation(project("path" to FeatureModules.homeUI))
    implementation(project("path" to FeatureModules.TeamUI))
    implementation(project("path" to FeatureModules.ProfileUI))

    implementation(Deps.core)
    implementation(Deps.appCompat)
    implementation(Deps.androidMaterial)
    implementation(Deps.constraintLayout)
    testImplementation(TestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.junit)
    androidTestImplementation(AndroidTestImplementation.espresso)

    //Navigation Graph
    implementation(Navigation.navFragment)
    implementation(Navigation.navUi)
}