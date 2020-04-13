学习记录
====

## Java 核心技术

时间|章节|
:----:|:----:|
20191110|01
20191115|第8讲 对比Vector、ArrayList、LinkedList有何区别?
20200331|00/番外篇
20200401|01
20200402|02
20200409|03



### 20200409 - 03

- 如果确实需要额外处理，Java提供的 Cleaner 机制怎么使用？

- 写 demo 测试 finalize 什么时候会执行【done】

    > java finalize方法的使用: https://blog.csdn.net/walkerJong/article/details/6950091
    > Java 对象释放与 finalize 方法: https://mazhuang.org/2015/12/15/java-object-finalize/#%E7%BB%93%E8%AE%BA-2-%E8%AF%81%E6%98%8E
  
- 怎么实现深度拷贝和浅拷贝？

- 什么是幻象引用(PhantomReference)，这是一种常见的所谓post-mortem清理机制？

### 20200413 - 04

- 实验 -XX:+PrintGCDetails -XX:+PrintGCTimeStamps -XX:+PrintReferenceGC 参数对于应用的作用

### 20200413 - 05

- 字符串 JVM 对象缓存机制的理解以及如何良好地使用?

- 阅读小结 String 源码

- jdk 9 后的 string 实现对比之前

- 阅读小结 StringBuffer、StringBuilder 源码

- InvokeDynamic 相关内容温习，已经遗忘 