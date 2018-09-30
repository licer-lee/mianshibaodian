
# 总结

- String类是final，不能被继承，值不能被修改；如修改，其实是创建了一个拷贝；带来性能问题；
- StringBuilder 
- StringBuffer 线程安全的，开销稍大
- javap分析工具

## String格式化
1. 说明符
```
 `%[argument_index$][flags][width][.precision]conversion`
```
2. 类型
  %d 十进制整数
  %f 十进制浮点数
  %s 字符串
  %c Unicode
  %b boolean值
  %e 浮点数（科学计数）
  %x 整数（十六进制）
  %h 散列码（十六进制）
  
## 正则表达式

TODO