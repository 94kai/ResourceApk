# 资源文件瘦身、国际化、换肤

> 一种实现瘦身、国际化、换肤的思路

- 创建一个无launcher的app，名为ResourceApk，用于存放资源（图片、字符串、颜色、尺寸等）
- 无launcher的app安装到手机之后用户无感知
- 另一个app通过Utils类的方法即可访问ResourceApk的资源
- 可在另一个app中适当的时候下载ResourceApk并引导用户安装。
- 资源文件的名称和实际内容可根据ResourceApk的版本来动态下发对应表，实现只更新ResourceApk即可更新国际化、换肤等需求