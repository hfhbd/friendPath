plugins {
    id("kotlinSetup")
    id("com.google.devtools.ksp")
    id("friendPath")
}

dependencies {
    implementation(projects.lib)
    friendPath(projects.lib)

    implementation(projects.lib2)
    friendPath(projects.lib2)

    ksp("app.softwork.serviceloader:ksp-plugin:0.0.8")

    testImplementation(kotlin("test"))
}
