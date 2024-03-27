plugins {
    kotlin("multiplatform")
}

kotlin {
    jvmToolchain(8)

    jvm()
    linuxX64()
}
