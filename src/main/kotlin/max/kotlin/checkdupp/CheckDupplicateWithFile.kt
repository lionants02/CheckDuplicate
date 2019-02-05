package max.kotlin.checkdupp

import java.io.File
import java.io.RandomAccessFile
import java.nio.channels.FileChannel
import java.nio.channels.FileLock

class CheckDupplicateWithFile : CheckDupplicate {

    private lateinit var channel: FileChannel

    override fun register() {
        val f = File("1")
        if (f.exists()) // if exist try to delete it
            f.delete()

        channel = RandomAccessFile(f, "rw").channel

        try {
            val lock: FileLock? = channel.tryLock()
            if (lock == null) {
                channel.close()
                throw DupplicateProcessException(f)
            }
        } catch (ex: java.nio.channels.OverlappingFileLockException) {
            throw DupplicateProcessException(f)
        }
    }
}
