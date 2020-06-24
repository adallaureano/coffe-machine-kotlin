data class OperatingSystem(var name: String = "Linux")

class DualBoot {
    var primaryOs = OperatingSystem(name = "Ubuntu")
    var secondaryOs = OperatingSystem(name = "CentOS")
}