
# 总结 RTTI=运行期类型信息

## 创建Class对象引用
- Class a = Class.forName();
- Class a = ClassName.class; // 不会初始化
- Class a = classObj.getClass();

## 类型转换
1. 泛型通配符
- Class<?>			所有类型
- Class<? extends T> 包含T在内所有的子类型
- Class<? super T>	包含T在内所有的父类型

ClassObj.cast();
Class.asSubClass();