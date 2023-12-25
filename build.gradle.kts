plugins {
    id("java")
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation(platform("org.lwjgl:lwjgl-bom:3.3.4-SNAPSHOT"))

    implementation("org.lwjgl", "lwjgl")
    implementation("org.lwjgl", "lwjgl-vulkan")
    runtimeOnly("org.lwjgl", "lwjgl", classifier = "natives-windows")
}