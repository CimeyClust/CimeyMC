rootProject.name = "pandaspigot"

this.setupSubproject("cimeymc-server", "CimeyMC-Server")
this.setupSubproject("cimeymc-api", "CimeyMC-API")

fun setupSubproject(name: String, dir: String) {
    include(":$name")
    project(":$name").projectDir = file(dir)
}
