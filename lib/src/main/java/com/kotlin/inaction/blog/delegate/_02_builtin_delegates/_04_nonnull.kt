import kotlin.properties.Delegates
/**
 *  notNull() is similar to lateinit. In most cases, lateinit is preferred since notNull() creates an extra object for each property.
 *  However, you can use notNull() with primitive types, which lateinit doesn’t support.
 *
 * @author wangzhichao
 * @since 2021/3/7
 */
class Person3 {
    val fullName: String by Delegates.notNull()
}