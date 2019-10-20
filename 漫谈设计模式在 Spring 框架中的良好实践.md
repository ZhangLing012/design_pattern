> 本文由 [简悦 SimpRead](http://ksria.com/simpread/) 转码， 原文地址 https://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103446&idx=1&sn=0d0c0cb83235675963be01cb7b8ddb7b&chksm=87c8c4f8b0bf4dee91ab4a8041363afc0839df2dbc219e2c0938ed2e53d13af4a966121314f4&mpshare=1&scene=23&srcid=&sharer_sharetime=1571471623095&sharer_shareid=07754c1336c3524bfffedc4dc59111b6#rd

点击上方 “服务端思维”，选择 “设为星标”

回复”669“获取独家整理的精选资料集

回复” 加群 “加入全国服务端高端社群「后端圈」

![](https://mmbiz.qpic.cn/mmbiz_jpg/hUzEz6BmcaqWiboJc4SAiagicCsGyTn5XSe2drgG3ZL5HRZfrFXsamrJmSKtWNN0cNib2by72Q40yhvLxyE71uICog/640?wx_fmt=jpeg)

作者 | 梁桂钊  

出品 | 服务端思维（云原生后端）

在开始正文之前，请你先思考几个问题：

*   你项目中有使用哪些 GOF 设计模式
    
*   说一说 GOF 23 种设计模式的设计理念
    
*   说说 Spring 框架中如何实现设计模式
    

假设我是面试官问起了你这些面试题，你该如何回答呢，请先思考一分钟。

![](https://mmbiz.qpic.cn/mmbiz_png/hUzEz6BmcaqAduhuUuDeCjU2ttSBZzyPGnahOV3QLz3EwMboX29gH2PJ0whIdv3aibbnh1QkqaB2Xo0Robt28ibw/640?wx_fmt=png)

好的，我们开始进入正题。设计模式实践里面提供了许多经久不衰的解决方案和最佳方案。这里，GOF 设计模式主要分为三大类：创建模式、结构模式和行为模式。创建模式对于创建对象实例非常有用。结构模式通过处理类或对象的组合来作用于企业级应用的设计结构，从而降低了应用的复杂性，提高了应用的可重用性和性能。行为模式的意图是一组对象之间的交互作用，以执行单个对象无法自己执行的任务。它描述了类或对象交互以及职责的分配。

那么，本文的核心话题是 Spring 如何通过使用大量设计模式和良好实践来构建应用程序。

工厂方法模式
------

Spring 框架使用工厂模式来实现 Spring 容器的 BeanFactory 和 ApplicationContext 接口。Spring 容器基于工厂模式为 Spring 应用程序创建 bean，并管理着每一个 bean 的生命周期。BeanFactory 和 ApplicationContext 是工厂接口，并且在 Spring 中存在有很多实现类。getBean() 方法是相对应的 bean 的工厂方法。

抽象工厂模式
------

在 Spring 框架中，FactoryBean 接口是基于抽象工厂模式设计的。Spring 提供了很多这个接口的实现，比如 ProxyFactoryBean、JndiFactoryBean、LocalSessionFactoryBean、LocalContainerEntityManagerFactoryBean 等。FactoryBean 帮助 Spring 构建它自己无法轻松构建的对象。通常这是用来构造具有许多依赖关系的复杂对象。它也可以根据配置构造高易变的逻辑。例如，在 Spring 框架中，LocalSessionFactoryBean 是 FactoryBean 的一个实现，它用于获取 Hibernate 配置的关联的 bean 的引用。这是一个数据源的特定配置，它在得到 SessionFactory 的对象之前被使用。对此，在一致的情况下可以用 LocalSessionFactoryBean 获取特定的数据源配置。读者可以将 FactoryBean 的 getObject() 方法的返回结果注入到任何其他属性中。

单例模式
----

Spring 框架提供了一个单例的 bean 来实现单例模式。它类似于单例模式，但它与 Java 中的单例模式不完全相同。

建造者模式
-----

Spring 框架中有一些功能实现了建造者模式。以下是 Spring 框架中基于建造者模式的类:

*   EmbeddedDatabaseBuilder
    
*   AuthenticationManagerBuilder
    
*   UriComponentsBuilder
    
*   BeanDefinitionBuilder
    
*   MockMvcWebClientBuilder
    

适配器模式
-----

Spring 框架使用适配器模式来实现很多功能。以下列出的一些在 Spring 框架中使用到适配器模式的类:

*   JpaVendorAdapter
    
*   HibernateJpaVendorAdapter
    
*   HandlerInterceptorAdapter
    
*   MessageListenerAdapter
    
*   SpringContextResourceAdapter
    
*   ClassPreProcessorAgentAdapter
    
*   RequestMappingHandlerAdapter
    
*   AnnotationMethodHandlerAdapter
    
*   WebMvcConfigurerAdapter
    

桥接模式
----

以下是 Spring 模块中基于桥接模式的实现:

*   ViewRendererServlet: 它是一个 servlet 桥接 ，主要是对 Portlet MVC 的支持
    
*   桥接模式: Spring 日志处理使用到桥梁模式
    

装饰器模式
-----

Spring 框架使用装饰器模式构建重要功能，如事务、缓存同步和与安全相关的任务。让我们看看一些 Spring 实现此模式的功能:

*   织入通知到 Spring 应用程序中。它使用装饰者模式的 CGLib 代理，其通过在运行时生成目标类的子类来工作。
    
*   BeanDefinitionDecorator: 它通过使用自定义属性来增强 bean 的定义。
    
*   WebSocketHandlerDecorator: 它用来增强一个 WebSocketHandler 附加行为。
    

外观模式
----

在企业级应用中，如果使用到 Spring 框架，那么外观模式是常用于应用程序的业务服务层，它用于整合所有服务。读者也可以在 DAO 的持久层上应用这种模式。

代理模式
----

Spring 框架使用 Spring AOP 模块中的代理模式。在 Spring AOP 中，笔者可以创建对象的代理来实现横切关注点。在 Spring 中，其他模块也实现了代理模式，如 RMI、 Spring 的 HTTP 调用、Hessian 和 Burlap。

责任链模式
-----

Spring Security 项目实现了责任链模式。Spring Security 允许通过使用安全过滤器链在应用程序中实现身份验证和授权功能。这是一个高度可配置的框架。由于使用了责任链设计模式，我们可以在过滤器链上添加自定义过滤器以自定义功能。

命令模式
----

Spring MVC 实现了命令模式。在企业级应用中使用到 Spring 框架，读者经常会看到通过使用命令对象来实现命令模式。

解释器模式
-----

在 Spring 框架中，解释器模式在 Spring 表达式语言 (SpEL) 中使用。Spring 从 Spring 3.0 中增加了这个新功能，读者可以在企业级应用程序中通过 Spring 框架使用它。

迭代器模式
-----

Spring 框架还通过 CompositeIterator 类扩展迭代器模式。该模式主要用于 Java 语言的集合框架中，用于按顺序迭代访问元素。

观察者模式
-----

在 Spring 框架中，观察者模式用于实现 ApplicationContext 的事件处理功能。Spring 为我们提供了 ApplicationEvent 类和 ApplicationListener 接口来启用事件处理。Spring 应用程序中的任何 bean 实现 ApplicationListener 接口，都会接收到 ApplicationEvent 作为事件发布者推送的消息。在这里，事件发布者是主题 (Subject) 和实现 ApplicationListener 的 bean 的观察者 (Observer)。

**文末思考**

你已经知道 GOF 设计模式在 Spring 框架中的常见实现，那么可以说一下 Spring 框架是如何实现单例模式的呢？

欢迎在留言区与我分享你的想法，也欢迎你在留言区记录你的思考过程。感谢阅读，如果你觉得这篇文章对你有帮助的话，也欢迎把它分享给更多的朋友。

相关推荐：

*   《[颠覆微服务认知：深入思考微服务的七个主流观点](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103280&idx=1&sn=f3bd921a2f88a9a3440c0ff1e03d1bd9&chksm=87c8c31eb0bf4a0820a572626141cfb1fc87ea1c7072a16f61992d67d21d9b61b556de2d6cd7&scene=21#wechat_redirect)》
    
*   《[MySQL 单表数据不要超过 500 万行：](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103244&idx=1&sn=53beb31b3d9b86fa6bea8002d79402e2&chksm=87c8c322b0bf4a34823736d27fc35dbd726923ed5b532306d6d830030bcd6a11d70df61f4770&scene=21#wechat_redirect)[是经验数值，还是黄金铁律？](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103244&idx=1&sn=53beb31b3d9b86fa6bea8002d79402e2&chksm=87c8c322b0bf4a34823736d27fc35dbd726923ed5b532306d6d830030bcd6a11d70df61f4770&scene=21#wechat_redirect)》
    
*   《[人人都是 API 设计者：](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103129&idx=1&sn=3e0386d5f6f3b706e6bd72195648e34e&chksm=87c8c3b7b0bf4aa1530354a3b1507b33c5033db70e4c61328e9ed68118e24212a36d763671d8&scene=21#wechat_redirect)[我对 RESTful API、GraphQL、RPC API 的思考](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103129&idx=1&sn=3e0386d5f6f3b706e6bd72195648e34e&chksm=87c8c3b7b0bf4aa1530354a3b1507b33c5033db70e4c61328e9ed68118e24212a36d763671d8&scene=21#wechat_redirect)》
    

****— 新书出版 —****

新书出版  

→

![](https://mmbiz.qpic.cn/mmbiz_jpg/hUzEz6BmcaqWiboJc4SAiagicCsGyTn5XSegHibaDqnEYuppOqHP5caOPict4UqSANlGMPzPcT0EScC2uibg99wlQ9vw/640?wx_fmt=jpeg)

![](https://mmbiz.qpic.cn/mmbiz_jpg/hUzEz6BmcaqWiboJc4SAiagicCsGyTn5XSefSq03kxBS8ibzuBPCmt5SMxKbzdymyKLStNRj0wqYobeEria4amvnHPQ/640?wx_fmt=jpeg)

****— 本文结束 —****

**觉得对「服务端思维」有期待，请在文末点个在看**

**喜欢这篇文章，欢迎转发、分享朋友圈**

「服务端思维」是一个汇聚全国服务端技术人员的高端社群。我们希望让所有孤军奋战的研发人员都找到属于自己的圈子，一起交流、探讨。在这里，我们可以认知升级，连接顶级的技术大牛，连接优秀的思维方式，连接解决问题的最短路径，打破认知的局限。

  

[****1. 技术社群「后端圈」邀请中，********>>> (点击加入)<<< ****](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103326&idx=2&sn=11d647deb78ac888e767f4c9ce558296&chksm=87c8c370b0bf4a662f0c36af5d68ab62b0713cb6f651a0ec4df2755b88b331df125eb769ebd4&scene=21#wechat_redirect)

[****2. 免费星球「服务端思维」限免中，********>>> (点击加入)<<< ****](http://mp.weixin.qq.com/s?__biz=MzA5NDg3MjAwMQ==&mid=2457103129&idx=2&sn=c1a656b3da37a2119b2cc58194ad9b6a&chksm=87c8c3b7b0bf4aa1b675962ac1cd10c42dc653764baaac9d71a79ceafb41fc547255151e21d9&scene=21#wechat_redirect)

![](https://mmbiz.qpic.cn/mmbiz_png/hUzEz6BmcarCebKicutSwUtJEeoMoYNYwr8DCI4SBDtYFsuIw2URnqUas1W7mGFwL5PoUcJSAgyJd9z6Qf0eyeg/640?wx_fmt=png)

![](https://mmbiz.qpic.cn/mmbiz_png/7QRTvkK2qC6BGNLOQxwBmMTOGmO0dSd31LlXL5HoZWBH6fKtSSeKQ2DOeTfVR7nHVXl0U7RSAchUVoia2bErYfg/640?wx_fmt=png)

**在看点这里**

**![](https://mmbiz.qpic.cn/mmbiz_gif/7QRTvkK2qC6BGNLOQxwBmMTOGmO0dSd3NmOWsZBMWg3BC1msdwtyvBkNLYh1xGLQibm4QsHibClwxWfzuibicbJcIA/640?wx_fmt=gif)**