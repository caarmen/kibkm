plugins {
    kotlin("multiplatform") version "1.5.31"
    id("maven-publish")
}

group = "com.example"
version = "1.0.1"

repositories {
    google()
    mavenCentral()
}

kotlin {
    js {
        browser {
        }
    }
    jvm {
        compilations.all {
            kotlinOptions.jvmTarget = "1.8"
        }
    }
    val iosMain = sourceSets.create("iosMain")
    sourceSets {
        val commonMain by getting
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