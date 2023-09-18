plugins {
    kotlin("jvm")
}

val friendPath by configurations.registering {
    isTransitive = false
    attributes.attribute(
        LibraryElements.LIBRARY_ELEMENTS_ATTRIBUTE, objects.named<LibraryElements>("jar")
    )
}

val friendPathArgs: Provider<List<String>> = friendPath.flatMap {
    it.elements.map { elements: Set<FileSystemLocation> ->
        elements.map {
            val path = it.asFile.absolutePath
            "-Xfriend-paths=$path"
        }
    }
}

kotlin.compilerOptions.freeCompilerArgs.addAll(friendPathArgs)
