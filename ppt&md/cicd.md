# CI/CD环境搭建
## CI:它绑定 Github 上面的项目，只要有新的代码，就会自动抓取。然后，提供一个运行环境，执行测试，完成构建。
## CD：持续交付，自动将修改部署到服务器。
## CI环境搭建：
### 1.准备：
- 拥有 GitHub 帐号
- 该帐号下面有一个项目
- 该项目里面有可运行的代码
- 该项目还包含构建或测试脚本
### 2.绑定：
#### 首先，访问官方网站 travis-ci.org，点击右上角的个人头像，使用 Github 账户登入 Travis CI。
#### Travis 会列出 Github 上面你的所有仓库，以及你所属于的组织。此时，选择你需要 Travis 帮你构建的仓库，打开仓库旁边的开关。一旦激活了一个仓库，Travis 会监听这个仓库的所有变化。
### 3.travis.yml
#### Travis 要求项目的根目录下面，必须有一个.travis.yml文件。这是配置文件，指定了 Travis 的行为。该文件必须保存在 Github 仓库里面，一旦代码仓库有新的 Commit，Travis 就会去找这个文件，执行里面的命令。
#### 主要字段：language、jdk、sudo、before_install

	language: java  
	jdk: oraclejdk8  
	sudo: true  
	before_install: chomed +x mvnw  

#### 最后的 chmod 给 mvnw权限，否则在Travis CI跑的时候会报 permission denied
## CD环境搭建：
### 1. 首先搭建了一个服务器
#### 选择了heroku，把服务部署到了heroku上，在这个过程比较复杂，但不属于CICD的内容，参考heroku的官网：https://devcenter.heroku.com/articles/getting-started-with-java
### 2. 在项目中添加了一个新的文件 名为 Procfile （大小写敏感）是给heroku用的，
#### 内容是 web: java -Dserver.port=$PORT $JAVA_OPTS -jar target/*.jar
### 3. travis.yml中加入

	deploy:  
		provider: heroku  
		api-key：xxxxxxxxxxxxxxxxxxx  
		app: desolate-ravine-33082  

#### api_key 是在heroku的网站上获取的
#### app 是指该程序的名字，在部署heroku时自动生成，也可以修改
#### 可以在heroku的命令行工具中用命令 heroku apps 获取
### 4. 这样完成之后，在每次有新的push时，Travis CI 的操作就会多出一个自动部署功能，我们只需要修改代码，push到github， Travis CI 就会帮我们build并deploy到服务器