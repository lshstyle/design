状态模式:
  定义: 对有状态的对象，把复杂的"判断逻辑"提取到不同的状态对象中，允许状态对象在其内部状态发生改变时，改变其行为
 优点：有利于扩展，很容易添加一个新的状态和转换
 
 
 将状态抽象到一个新的类中，在上下文类中可以根据不同的场景，实例化不同的状态。