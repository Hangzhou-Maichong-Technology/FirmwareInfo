# FirmwareInfo
杭州迈冲科技 Firmware 信息实例。

## 一、创建 AndroidStudio 项目，导入库文件

将 mcFirmware.aar 文件拷贝到 libs 目录下。

在```app```目录中的```build.gradle```文件中添加如下依赖：

```groovy
    implementation files('libs/mcFirmware.aar')
```

## 二、使用接口
```FirmwareInfo.getFactoryInfo()```  
获取产品供应商信息

```FirmwareInfo.getProductInfo()```
获取产品型号信息

```FirmwareInfo.getSpecialInfo()```   
获取特别定制信息

```FirmwareInfo.getCpuTypeInfo()```   
获取 CPU 型号信息

```FirmwareInfo.getAndroidVersionInfo()```  
获取 Android 版本信息    

```FirmwareInfo.getFirmwareVersion()```    
获取固件的版本名称    

```FirmwareInfo.getFirmwareVersionCode()```  
获取固件的版本号      

**所有接口方法返回值类型为 String, 当属性不存在时，返回空字符串。**

## 三、下载体验
[FirmwareInfo 实例 apk 下载](https://github.com/Hangzhou-Maichong-Technology/FirmwareInfo/raw/master/apk/FirmwareInfo.apk)