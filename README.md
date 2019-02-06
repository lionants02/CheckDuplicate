"# CheckDuplicate"  
[![Build Status](https://travis-ci.org/lionants02/CheckDuplicate.svg?branch=master)](https://travis-ci.org/lionants02/CheckDuplicate.ini) [![Release](https://jitpack.io/v/lionants02/CheckDuplicate.svg)](https://jitpack.io/#lionants02/CheckDuplicate)  
[![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)

เพิ่ม JitPack repository ที่ build script
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

เพิ่ม dependency
```
dependencies {
    implementation "com.github.lionants02:CheckDuplicate:$latestVersion"
}
```

ใช้
```$xslt
    val checkProcDuplicate = CheckDupplicateWithRest("myname")
    checkProcDuplicate.register()
```

Throw DupplicateProcessException
