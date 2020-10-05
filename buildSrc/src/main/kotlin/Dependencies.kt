object AndroidSdk {
    const val min = 21
    const val compile = 29
}

object AndroidLibraries {
    object Versions {
        const val core = "1.3.1"
        const val appCompat = "1.2.0"
        const val material = "1.2.1"
        const val lifecycleViewModel = "2.3.0-beta01"
    }

    const val core = "androidx.core:core-ktx:${Versions.core}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    const val material = "com.google.android.material:material:${Versions.material}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleViewModel}"
}

object ComposeLibraries {
    object Versions {
        const val compose = "1.0.0-alpha04"
    }

    const val ui = "androidx.compose.ui:ui:${Versions.compose}"
    const val material = "androidx.compose.material:material:${Versions.compose}"
    const val liveData = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
}

object KotlinLibraries {
    object Versions {
        const val kotlin = "1.4.0"
        const val coroutines = "1.3.9"
    }

    const val kotlinStdLibrary = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
}

object ArrowLibraries {
    object Versions {
        const val arrow = "0.10.5"
    }

    const val core = "io.arrow-kt:arrow-core:${Versions.arrow}"
    const val syntax = "io.arrow-kt:arrow-syntax:${Versions.arrow}"
    const val kapt = "io.arrow-kt:arrow-meta:${Versions.arrow}"
}

object CoilLibrary {
    object Version {
        const val coil = "0.3.0"
    }

    const val coilCompose = "dev.chrisbanes.accompanist:accompanist-coil:${Version.coil}"
}

object NetworkLibraries {
    object Versions {
        const val gson = "2.8.6"
        const val retrofit = "2.9.0"
        const val okHttpInterceptor = "4.5.0"
    }

    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val converterGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val adapterRx = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttpInterceptor}"
}

object MultiThreadingLibraries {
    object Versions {
        const val rxJava = "2.2.19"
        const val rxAndroid = "2.1.1"
    }

    const val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
}

object TestLibraries {
    object Versions {
        const val jUnit = "4.13"
        const val androidJUnit = "1.1.1"
        const val androidEspresso = "3.2.0"
        const val mockk = "1.10.0"
        const val coroutines = "1.3.9"
    }

    const val jUnit = "junit:junit:${Versions.jUnit}"
    const val androidJUnit = "androidx.test.ext:junit:${Versions.androidJUnit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.androidEspresso}"
    const val mockk = "io.mockk:mockk:${Versions.mockk}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
}

object TestAndroidLibraries {
    object Versions {
        const val androidJUnit = "1.1.1"
        const val androidEspresso = "3.2.0"
        const val coroutines = "1.3.9"
    }

    const val androidJUnit = "androidx.test.ext:junit:${Versions.androidJUnit}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.androidEspresso}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
}