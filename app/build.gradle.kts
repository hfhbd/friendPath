plugins {
    kotlin("jvm")
    id("friendPath")
}

dependencies {
    implementation(projects.lib)
    friendPath(projects.lib)

    implementation(projects.lib2)
    friendPath(projects.lib2)

    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(8)
}
