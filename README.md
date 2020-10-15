# ToasterNetsetLib
A simple library for toast a message.
<br>[![GitHub Package Registry version](https://img.shields.io/badge/Version-v1.1-blue?label=Version&logo=github)](https://github.com/Mprogrammer2020/ToasterNetsetLib/releases/tag/v1.1)

### Installation

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.Mprogrammer2020:ToasterNetsetLib:v1.1'
	}

### Usage 

```
ToasterMessage.toastShort(this,"Hello From Netset!!")
```

