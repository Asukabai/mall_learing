# mall_learing
对开源项目mall的学习记录和笔记整理

# 项目日志
1、项目框架初始化，创建聚合项目：先创建一个父项目，普通的 maven 项目，packaging 类型为 pom， 然后再在这个项目下面创建子模块；
子模块可以是 SpringBoot 项目，也可以是 maven 项目，子模块需要继承父项目。
2、使用 MyBatis Generator（简称MBG，是MyBatis官方提供的代码生成工具），通过数据库表直接生成实体类、单表CRUD代码、mapper.xml文件。
3、增加对应的配置类和通用返回类，引入 Swagger 文档