plugins {
    kotlin("jvm")
    id("friendPath")
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(8)
}
