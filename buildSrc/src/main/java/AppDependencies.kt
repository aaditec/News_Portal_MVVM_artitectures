object Deps {
    object Versions {
        const val compile_sdk = 30
        const val min_sdk = 21
        const val target_sdk = 30
        const val app_version_code = 1
        const val app_version_name = "1.0"
        const val gradle_plugin = "7.0.0"
        const val constraint_layout = "2.0.4"
        const val lifecycle = "2.2.0"
        const val junit = "4.12"
        const val material = "1.2.1"
        const val kotlinVersion = "1.5.31"
        const val coroutinesVersion = "1.4.2"
        const val ktx_core = "1.3.2"
        const val ktx_activity = "1.1.0"
        const val roomVersion = "2.3.0-alpha04"
        const val hiltVersion = "2.38.1"
        const val retrofit = "2.9.0"
        const val okhttp = "4.9.0"
        const val glide = "4.11.0"
        const val navigationVersion = "2.4.0-alpha02"
        const val appCompatVersion = "1.2.0"
        const val swipeRefreshVersion = "1.1.0"
    }

    const val gradle_plugin = "com.android.tools.build:gradle:${Versions.gradle_plugin}"
    const val junit = "junit:junit:${Versions.junit}"

    object Google {
        const val material = "com.google.android.material:material:${Versions.material}"
    }

    object Kotlin {
        const val gradle_plugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    }

    object Coroutines {
        const val core =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
        const val android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
        const val test =
            "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutinesVersion}"
    }

    object AndroidX {

        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"



        const val constraint_layout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraint_layout}"

        const val ktx_core = "androidx.core:core-ktx:${Versions.ktx_core}"
        const val ktx_activity = "androidx.activity:activity-ktx:${Versions.ktx_activity}"
    }

    object Lifecycle {
        const val extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
        const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val compiler = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
        const val lifeCycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val lifeCycleRunTime =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
    }

    object Room {
        const val runtime = "androidx.room:room-runtime:${Versions.roomVersion}"
        const val compiler = "androidx.room:room-compiler:${Versions.roomVersion}"
        const val ktx = "androidx.room:room-ktx:${Versions.roomVersion}"
    }

    object Navigation {
        const val safeArgs_gradle =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
        const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
        const val navigationKtx =
            "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"
    }

    object Hilt {
        const val viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltVersion}"
        const val compiler = "androidx.hilt:hilt-compiler:${Versions.hiltVersion}"
        const val android = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
        const val android_compiler =
            "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"
        const val gradlePlugin =
            "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    }

    object Retrofit {
        const val main = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val converterGSON = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    }

    object OkHttp {
        const val main = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val logging_interceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp}"
    }

    object Glide {
        const val runtime = "com.github.bumptech.glide:glide:${Versions.glide}"
        const val compiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    const val SwipeRefreshLayout =
        "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshVersion}"
}
