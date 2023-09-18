plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.plugins.kotlin.jvm.toDep())
}

fun Provider<PluginDependency>.toDep() = map {
    "${it.pluginId}:${it.pluginId}.gradle.plugin:${it.version}"
}
