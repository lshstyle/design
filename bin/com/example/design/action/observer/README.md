观察者模式：
   定义： 多个对象之间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖它的对象都得到通知并自动更新，这种模式又称为发布订阅模式。
 优点： 降低了目标与观察者之间的耦合度
            目标与观察者之间建立了一触即发机制
 缺点：观察者很多时，效率很低。
 结构：抽象主题
            具体主题
            抽象观察者
            具体观察者
            
     抽象主题关联抽象观察者聚合类，提供一个抽象观察者的注册和退订方法，以及对所有观察者的一个消息提醒方法。任何具体的信息变更，都可以通过提醒方法，通知到所有订阅消息的观察者
     