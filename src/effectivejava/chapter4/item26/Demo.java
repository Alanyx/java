package effectivejava.chapter4.item26;

/**
 * @author yinxing
 * @date 2019/8/27
 */

public class Demo {

    /**
     * 总之，使用原始类型可能导致运行时异常，所以不要使用它们。
     * <p>
     * 它们仅用于与泛型引入之前的传统代码的兼容性和互操作性。
     * a. Set<Object> 是一个参数化类型，表示一个可以包含任何类型对象的集合;
     * b. Set<?> 是一个通配符类型，表示一个只能包含某些未知类型对象的集合;
     * c. Set 是一个原始类型，它不在泛型类型系统之列。
     * </p>
     * 前两个类型是安全的，最后一个不是。
     */
}
