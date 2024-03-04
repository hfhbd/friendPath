plugins {
    kotlin("jvm")
}

kotlin {
    jvmToolchain(8)

    compilerOptions {
        freeCompilerArgs.add("-Xcontext-receivers")
        progressiveMode.set(true)
    }
}
