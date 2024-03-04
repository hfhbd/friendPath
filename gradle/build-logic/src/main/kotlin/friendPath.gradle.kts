plugins {
    kotlin("jvm")
}

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

val friendPathArgs: Provider<List<String>> = friendPathJars.flatMap {
    it.elements.map { elements: Set<FileSystemLocation> ->
        elements.map {
            val path = it.asFile.absolutePath
            "-Xfriend-paths=$path"
        }
    }
}

kotlin.compilerOptions.freeCompilerArgs.addAll(friendPathArgs)
