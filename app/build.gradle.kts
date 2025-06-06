plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.salageh.fproj"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.salageh.fproj"
        minSdk = 26 //26 ou superior
        targetSdk = 35 // Api 35
        versionCode = 1 //versão codigo
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes { //Configuração de compilação do projecto
        release { //Publica uma aplicação
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21 //Alterar sempre pra versão atual
        targetCompatibility = JavaVersion.VERSION_21//Alterar sempre pra versão atual
    }
    kotlinOptions {
        jvmTarget = "21"//Alterar sempre pra versão atual
    }
}

dependencies {
    //Bibliotecas e Funcionalidades
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}