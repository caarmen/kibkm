plugins {
    kotlin("multiplatform") version "1.5.31"
    id("com.android.library")
    id("kotlin-android-extensions")
}

group = "com.example"
version = "1.0.1"

repositories {
    google()
    mavenCentral()
}

kotlin {
    android {
        publishLibraryVariants("release", "debug")
    }
    val iosMain = sourceSets.create("iosMain")
    sourceSets {
        val commonMain by getting
        val commonTest by getting
        val androidMain by getting {
            dependencies {
                implementation("com.google.android.material:material:1.2.1")
            }
        }
        val androidTest by getting {
            dependencies {
                implementation("junit:junit:4.13")
            }
        }
        //val iosMain by getting
        //val iosTest by getting
    }
    iosArm64 {
        compilations.getByName("main").source(iosMain)
        binaries {
            framework {
                baseName = "libkm"
            }
        }
    }
    iosX64 {
        compilations.getByName("main").source(iosMain)
        binaries {
            framework {
                baseName = "libkm"
            }
        }
    }
}

android {
    compileSdkVersion(31)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(23)
        targetSdkVersion(31)
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

apply(from = "publish.gradle.kts")