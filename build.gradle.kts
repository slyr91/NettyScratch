plugins {
    id("java")
}

group = "com.datechnologies"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/io.netty/netty-all
    implementation("io.netty:netty-all:4.1.114.Final")
}

tasks.test {
    useJUnitPlatform()
}