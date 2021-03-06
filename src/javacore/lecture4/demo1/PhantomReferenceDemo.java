package javacore.lecture4.demo1;

/**
 * @author Alan Yin
 * @date 2020/4/14
 */

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 1.不影响对象的生命周期。如果一个对象与虚引用关联，则跟没有引用与之关联一样，随时都可能被 GC 回收。
 * <p>
 * 2.注意：虚引用必须和引用队列关联使用，当 GC 准备回收一个对象时，如果发现它还有虚引用，就会把这个虚引用加到与之关联的引用队列中。
 * <p>
 * 3.可通过判断引用队列中是否已加入虚引用，来了解被引用的对象是否将要被垃圾回收。
 * 如果某个虚引用已被加入到引用队列，就可以在所引用的对象的内存被回收之前采取必要的行动。
 * <p>
 * 虚引用主要被用来 跟踪对象被垃圾回收的状态，通过查看引用队列中是否包含对象所对应的虚引用来判断它是否即将被垃圾回收，从而采取行动。
 * 它并不被期待用来取得目标对象的引用，而目标对象被回收前，它的引用会被放入一个 ReferenceQueue 对象中，从而达到跟踪对象垃圾回收的作用。
 */
public class PhantomReferenceDemo {

    public static void main(String[] args) {
        Object obj = new Object();
        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference reference = new PhantomReference(obj, queue);
        // 强引用对象滞空，保留虚引用
        obj = null;
    }
}
