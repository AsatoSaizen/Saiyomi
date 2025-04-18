package ani.saiyomi.app.plugins

import android.content.Context
import java.io.File

object CloudstreamPluginManager {
    private const val EXT_DIR = "cloudstream_extensions"

    fun loadPlugins(context: Context): List<File> {
        val dir = File(context.filesDir, EXT_DIR)
        if (!dir.exists()) dir.mkdirs()
        return dir.listFiles { f -> f.extension == "csx" }?.toList().orEmpty()
    }

    fun installFromRepo(repoUrl: String, context: Context) {
        // TODO: Download and parse repo JSON, save .csx files under EXT_DIR
    }
}
