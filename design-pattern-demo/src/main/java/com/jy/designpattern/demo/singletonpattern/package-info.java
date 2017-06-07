/**
 * 单例模式
 *      主要作用的: 控制控制某个类型的实例数量是一个
 *      实现方式:
 *          1.外部方式
 *          客户端使用某些全局对象, 如果没有就自己创建一个, 如果有则直接拿一个现成的来用
 *          2.内部方式
 *          类型自己控制生成实例的数量,只提供一个实例
 *          试图通过经典单例实现分布式环境下的单例并不现实,因此项目中的单例是有上下文和语义范围的
 *      特点:
 *          1.该类只有一个实例
 *          2.该类在内部自行创建该实例对象
 *          3.向整个系统公开该实例接口
 *      模式:
 *          1.饿汉式
 *          2.懒汉式
 *          3.登记式
 *          4. 枚举(更简洁,无偿提供了序列化的机制,由jvm从根本上保障绝对防止多次实例化,简洁高效安全的实现)
 *      单例范围:
 *          ClassLoader
 *      命名:
 *          一般建议单例模式的方法命名为getInstance()
 *
 *  优点和缺点
 *      优点:
 *      1.由于在内存中只有一个实例,减少了内存消耗
 *      2.由于在内存中只有一个实例,减少了系统性能消耗
 *      3.避免对资源的多重占用
 *      4.优化共享资源访问
 *      缺点:
 *      1.单例模式没有接口,扩展比较困难
 *      2.单例模式多测试不利
 *      3.单例模式与单一职责原则有冲突
 *
 *
 * */
package com.jy.designpattern.demo.singletonpattern;