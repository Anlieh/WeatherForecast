### 架构

MVVM架构可以将程序结构主要分成3部分：Model是数据模型部分；View是界面展示部分；而ViewModel比较特殊，可以将它理解成一个连接数据模型和界面展示的桥梁，从而实现让业务逻辑和界面展示分离的程序结构设计。

<img src="C:\Users\chaowen\AppData\Roaming\Typora\typora-user-images\image-20220520103311474.png" alt="image-20220520103311474"  />

- **UI控制层**：包含Activity、Fragment、布局文件等与界面相关的东西。

- **ViewModel层**：用于持有和UI元素相关的数据，以保证这些数据在屏幕旋转时不会丢失，并且还要提供接口给UI控制层调用以及和仓库层进行通信。

- **仓库层**：主要工作是判断调用方请求的数据应该是从本地数据源中获取还是从网络数据源中获取，并将获取到的数据返回给调用方。
  - 本地数据源可以使用数据库、SharedPreferences等持久化技术来实现
  - 网络数据源则通常使用Retrofit访问服务器提供的Webservice接口来实现。

包结构com.example.weatherforecast

- **logic**：存放业务逻辑
  - **dao**：数据访问对象
  - **model**：对象模型
  - **network**：网络

- **ui**：界面展示
  - **place**：对应地区页面
  - **weather**：主页面

### 功能

- [x] 搜索全球大多数国家的各个城市数据
- [x] 查看全球绝大多数城市的天气信息
- [x] 切换城市，查看其他城市的天气
- [x] 手动刷新实时的天气

### 技术支持

**[彩云天气](https://dashboard.caiyunapp.com/)**

