## README ##


>  本项目是基于运行时机制开发的注解绑定框架

## 使用方式 ##

在你的build中引入本项目

#### 第一步. 在build 中添加jitpack引用 ####

在你的根目录下的build.gradle中添加下面代码

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

#### 第二步. 在module目录下的gradle中添加依赖 ####

	dependencies {
	        compile 'com.github.jianyuyouhun:ViewInjector:1.0'
	}