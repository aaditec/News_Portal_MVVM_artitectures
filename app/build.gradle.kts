plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("androidx.navigation.safeargs")
}

android {
    compileSdk = Deps.Versions.compile_sdk

    buildFeatures {
        viewBinding = true
        dataBinding = true
        buildConfig = true
    }

    defaultConfig {
        applicationId = "com.nitv.newsapp"
        minSdk = Deps.Versions.min_sdk
        targetSdk = Deps.Versions.target_sdk
        versionCode = Deps.Versions.app_version_code
        versionName = Deps.Versions.app_version_name
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        javaCompileOptions {
            annotationProcessorOptions {
                arguments(
                    mapOf(
                        "room.schemaLocation" to "$projectDir/schemas",
                        "room.incremental" to "true",
                        "room.expandProjection" to "true"
                    )
                )
            }
        }
    }
    flavorDimensions("default")
    productFlavors {
        create("prod") {
            applicationId = "com.nitv.newsapp"
        }
        create("dev") {
            applicationId = "com.nitv.newsapp.dev"
        }
    }
    buildTypes {
        getByName("debug") {
            applicationIdSuffix = ".debug"
        }
        getByName("release") {
            isMinifyEnabled = false
            isShrinkResources = false
            isDebuggable = false
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

    testOptions {
        unitTests.isIncludeAndroidResources = true
        animationsDisabled = true
    }

    testBuildType = "debug"

    packagingOptions {
        resources.excludes.add("META-INF/*")
        resources.excludes.add(".readme")
    }

    sourceSets {
        val test by getting
        val androidTest by getting
        test.java.srcDirs("$projectDir/src/testShared")
        androidTest.java.srcDirs("$projectDir/src/testShared")

    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    //App Compat, layout, Core
    implementation(Deps.AndroidX.appCompat)
    implementation(Deps.AndroidX.constraint_layout)
    implementation(Deps.AndroidX.ktx_core)

    //Material
    implementation(Deps.Google.material)

    //Room
    implementation(Deps.Room.runtime)
    implementation(Deps.Room.ktx)
    testImplementation("junit:junit:4.12")
    androidTestImplementation("junit:junit:4.12")
    kapt(Deps.Room.compiler)

    // Activity KTX
    implementation(Deps.AndroidX.ktx_activity)

    // Lifecycle
    implementation(Deps.Lifecycle.extensions)
    implementation(Deps.Lifecycle.lifeCycleLiveData)
    implementation(Deps.Lifecycle.viewmodel)
    implementation(Deps.Lifecycle.lifeCycleRunTime)

    // Retrofit
    implementation(Deps.Retrofit.main)
    implementation(Deps.Retrofit.converterGSON)

    // OkHTTP
    implementation(Deps.OkHttp.main)
    implementation(Deps.OkHttp.logging_interceptor)

    // Coroutines
    implementation(Deps.Coroutines.core)
    implementation(Deps.Coroutines.android)

    //Dagger - Hilt
    implementation(Deps.Hilt.android)
    kapt(Deps.Hilt.android_compiler)

    //Navigation
    implementation(Deps.Navigation.navigationFragment)
    implementation(Deps.Navigation.navigationKtx)

    // Glide
    implementation(Deps.Glide.runtime)
    kapt(Deps.Glide.compiler)

    //Swipe Refresh Layout
    implementation(Deps.SwipeRefreshLayout)


}