## README ##

　　关于注解绑定，butterKnife已经是最好的框架了，但是如果我只想注解view和点击事件，其他的都不想用，这时候butterKnife的包就有点大了。所以自己写了一个注解绑定，实现了view，onClick和onLongClick的注入。一个轻量级injector就这样诞生了。

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

#### 代码中使用 ####


为控件添加注解：

	@FindViewById(R.id.hello_world)
	private TextView mTextView;

为控件绑定点击事件：

	@OnClick(R.id.hello_world)
	private void onHelloClick(View view) {}

为控件绑定长按事件：

	@OnLongClick(R.id.hello_world)
	private boolean onHelloLongClick(View view) {}

开始注解绑定：

	ViewInjector.inject(activity)

	ViewInjector.inject(dialog)

	ViewInjector.inject(viewHolder, view)