import org.gradle.api.JavaVersion

plugins {
    kotlin("jvm") version "2.2.21"
    id("application")
    id("io.ktor.plugin") version "3.2.0"
}

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_24
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    compilerOptions {
        jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_24)
    }
}

application {
    mainClass.set("AppKt")
}

dependencies {
    implementation("io.ktor:ktor-server-core")
    implementation("io.ktor:ktor-server-netty")
    implementation("ch.qos.logback:logback-classic:1.5.13")
    testImplementation("io.ktor:ktor-server-tests")
    testImplementation(kotlin("test"))
}
