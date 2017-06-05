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
 *      单例范围:
 *          ClassLoader
 *      命名:
 *          一般建议单例模式的方法命名为getInstance()
 *
 *
 * */
package com.jy.designpattern.demo.singletonpattern;