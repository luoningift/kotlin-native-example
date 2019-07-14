//Gradle 5.1
plugins {
    kotlin("multiplatform") version "1.3.41"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64("exampleApp")  {
        binaries {
            executable {
                entryPoint = "sample.kotlinNative.main"
            }
        }

        //dependencies
        val main by compilations.getting
        val libcurl by main.cinterops.creating
    }
}

