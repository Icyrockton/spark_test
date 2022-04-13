plugins {
    kotlin("jvm") version "1.6.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlinx.spark:kotlin-spark-api-3.2:1.0.3")
    implementation("org.apache.spark:spark-sql_2.12:3.2.0")
    implementation("org.apache.spark:spark-streaming_2.12:3.2.0")
    implementation("org.apache.spark:spark-streaming-kafka-0-10_2.12:2.4.8")
    implementation("org.apache.spark:spark-mllib_2.12:3.2.0")
}

