import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

val ktor_version = "1.3.0"

plugins {
    application
    kotlin("jvm") version "1.3.61"
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks.withType<KotlinCompile>().all {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClassName = "AppKt"
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("io.ktor:ktor-server-netty:${ktor_version}")
}