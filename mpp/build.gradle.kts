plugins {
    kotlin("multiplatform")
    id("friendPath")
}

kotlin {
    jvmToolchain(8)

    jvm()
    linuxX64()

    sourceSets {
        commonMain {
            dependencies {
                implementation(projects.lib2)
            }
        }
    }
}

dependencies {
    friendPath(projects.lib2)
}
