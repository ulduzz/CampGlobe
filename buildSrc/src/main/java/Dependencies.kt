object Versions {
    const val  androidApplication = "8.2.1"
    const val  jetbrainsKotlinAndroid = "1.9.22"
    const val library = "8.2.2"
    const val googleService = "4.4.1"
    const val mapsPlatforms = "2.0.1"
    const val safeArgs = "2.7.3"
    const val  materialComponents = "1.11.0"
    const val core = "1.12.0"
    const val combat = "1.6.1"
    const val hilt = "2.47"
    const val navigation = "2.7.6"
    const val constraintlayout = "2.1.4"

    const val firebaseBom = "32.7.0"
    const val playService = "20.7.0"

    const val glide = "4.16.0"

}

object Libs {
    object UI {
        const val material = "com.google.android.material:material:${Versions.materialComponents}"
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val combat = "androidx.appcompat:appcompat:${Versions.combat}"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    }
    object HILT {
        const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
        const val hiltKapt = "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }
    object NAV {
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    }
    object GoogleService {
        const val firebaseAuth = "com.google.firebase:firebase-auth"
        const val firebaseStore = "com.google.firebase:firebase-firestore"
        const val firebaseStorage = "com.google.firebase:firebase-storage"
        const val firebaseBom = "com.google.firebase:firebase-bom:${Versions.firebaseBom}"
        const val playService = "com.google.android.gms:play-services-auth:${Versions.playService}"
    }
    object GLIDE {
        const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    }


}
object Plugins {
    const val androidApplication = "com.android.application"
    const val jetBrainsKotlin = "org.jetbrains.kotlin.android"
    const val hilt = "dagger.hilt.android.plugin"
    const val googleFirebase = "com.google.gms.google-services"
    const val mapsPlatforms = "com.google.android.libraries.mapsplatform.secrets-gradle-plugin"
    const val library = "com.android.library"
    const val safeArgs = "androidx.navigation.safeargs"
    const val kotlinKapt = "kotlin-kapt"
    const val parcelize = "kotlin-parcelize"
}
object Classpath {
    const val hilt = "com.google.dagger.hilt.android"
}