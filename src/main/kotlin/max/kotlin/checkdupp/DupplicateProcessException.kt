package max.kotlin.checkdupp

import java.io.File

class DupplicateProcessException(f: File) : Exception("Dupplicate Process Exception File ${f.absoluteFile} is lock.")
