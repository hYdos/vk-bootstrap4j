plugins {
    id("java")
    id("maven-publish")
}

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots/")
}

dependencies {
    implementation(platform("org.lwjgl:lwjgl-bom:3.3.4"))

    implementation("org.lwjgl", "lwjgl")
    implementation("org.lwjgl", "lwjgl-vulkan")
}



publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "me.hydos"
            artifactId = "vk-bootstrap4j"
            version = "1.0"

            from(components["java"])
        }
    }
}

