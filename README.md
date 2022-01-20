#1. 创造两个bean
person_01和 person_02
在创建01 后并更改他的属性
参见输出作为例子

00:35:00.953 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'person_01'
无参数构造函数
00:35:01.039 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'person_02'
无参数构造函数
名字是：person_01
Person{name='Jack一号 新名字', age=18}
名字是：person_02
Person{name='Jack二号', age=28}


#2. 创造两个bean
person_01和 person_02
注册person_01 和 person_02， 覆盖person_01的定义
参见输出作为例子

00:36:48.735 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'person_01'
无参数构造函数
00:36:48.809 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'person_02'
无参数构造函数
名字是：person_01
Person{name='Jack一号 新名字', age=28}
名字是：person_02
Person{name='Jack一号 新名字', age=28}
