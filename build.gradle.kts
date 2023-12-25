plugins {
    id("java")
    id("maven-publish")
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation(platform("org.lwjgl:lwjgl-bom:3.3.4-SNAPSHOT"))

    implementation("org.lwjgl", "lwjgl")
    implementation("org.lwjgl", "lwjgl-vulkan")
}