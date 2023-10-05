pluginManagement {
    includeBuild("../build-logic")
}

plugins {
    id("multimodule")
}

fun includeSubs(base: String, path: String = base, vararg subs: String) {
    subs.forEach {
        include(":$base-$it")
        project(":$base-$it").projectDir = File("$path/$it")
    }
}

listOf(
    "kash-api", "geo-api", "krono-core", "neat", "koncurrent",
    "kollections", "kommander", "epsilon-api", "hormone",
).forEach {
    includeBuild("../$it")
}

rootProject.name = "identifier-api"

includeSubs("identifier", ".", "core", "comm")
includeSubs("identifier-legal", "legal", "dtos")
