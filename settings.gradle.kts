rootProject.name = "chunkstories-all"

//include(":chunkstories-api", ":chunkstories-core", ":chunkstories")
includeBuild("chunkstories-api")
includeBuild("chunkstories-core")
includeBuild("chunkstories")
