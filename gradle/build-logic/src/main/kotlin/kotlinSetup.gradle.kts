plugins {
    kotlin("jvm")
    id("friendPath")
}

kotlin {
    jvmToolchain(8)

    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
        progressiveMode.set(true)
    }
}
