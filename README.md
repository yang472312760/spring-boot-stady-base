# spring-boot-stady-base

1、项目说明

	spring-boot-stady架构基础包

		1、基础model

		2、基础注解

		3、基础配置

		4、基础静态变量

		5、基础日志切面



2、包目录说明

	com.yang.springboot.stady：spring-boot-stady跟目录

		|----base：基础包

			|----annotation	：基础注解

				|----SystemLog：日志注解

			|----aop：基础切面

				|-----I18nAspect：国际化切面

				|-----SystemLogAspect：系统日志切面

			|----conf：基础配置

				|-----mvc：

					|----CustomMvcConfig：国际化配置

				|----mybatis：mybatis基础配置

					|----MybatisConfig：mybatis plus基础配置（包括乐观锁和格式化SQL）

			|----constant：基础静态变量

				|----BaseConstants：基础静态变量

				|----DateFormartConstants：日期格式化静态变量

				|----MessageConstans：消息静态变量

				|----ReturnConstants：返回值静态变量

			|----enums：枚举类

				|----system：系统级枚举类型

					|----LogType：日志类型

					|----OperateType：操作类型

				|----IBaseEnum：基础枚举类

			|----exception：基础异常类

			|----handler：基础处理器

			|----mapper：基础mapper

				|----system：系统级mapper文件

					|-----IUserLogMapper：用户日志mapper

				|----IBaseMapper：基础mapper类

			|----model：基础model

				|----system：系统级model实体

					|----CommonResult：基础返回结果

					|----Page：分页信息（传入数据库）

					|----PageParam：分页信息（前端传入）

					|----UserLog：用户操作日志

			|----service：基础service

					|---i18n：国际化服务

						|----InternationalizationService：国际化

					|----impl:

						|----BaseServiceImpl：基础service实现类

					|----userlog：用户日志

						|----impl：

							|-----UserLogServiceImpl：

						|----IUserLogService：

					|----IBaseService：基础service服务

			|----util：基础工具包（之涉及base用到的）

				|----JsonMapper：格式化json工具类

				|----StringUtil：下划线、驼峰相互转换



3、以后要做的

		1、mybatis plus高级查询封装

		2、静态变量完善

		3、异常处理完善

		4、自定义异常类

		5、枚举序列化

		。。。。。				

