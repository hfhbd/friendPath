plugins {
    kotlin("jvm")
    id("app.softwork.serviceloader-compiler")
    id("friendPath")
}

kotlin {
    jvmToolchain(8)
}

dependencies {
    implementation(projects.lib)
    friendPath(projects.lib)

    implementation(projects.lib2)
    friendPath(projects.lib2)
}
