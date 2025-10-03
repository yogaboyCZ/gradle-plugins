plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    `maven-publish`
}

group = "cz.yogaboy"
version = "1.0.0"

repositories {
    google()
    mavenCentral()
}

dependencies {
    implementation("com.android.tools.build:gradle:8.6.0")
    implementation(kotlin("gradle-plugin", "2.0.20"))
}

gradlePlugin {
    plugins {
        create("androidLibrary") {
            id = "cz.yogaboy.android-library"
            implementationClass = "cz.yogaboy.build.AndroidLibraryConventionPlugin"
        }
    }
}