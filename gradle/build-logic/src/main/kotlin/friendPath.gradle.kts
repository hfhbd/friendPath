import org.jetbrains.kotlin.gradle.tasks.*

val friendPath = configurations.dependencyScope("friendPath") {
    isTransitive = false
}

val friendPathJars = configurations.resolvable("friendPathJars") {
    extendsFrom(friendPath.get())
    isTransitive = false
    attributes.attribute(
        LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named<LibraryElements>("jar")
    )
}

tasks.withType(KotlinCompile::class).configureEach {
    friendPaths.from(friendPathJars)
}
