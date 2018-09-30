
# 总结

- 数组一旦确定后，能更改大小
- List能自动扩容
- 容器可以通过自动拆箱、装箱添加基本数据类型
- 查询多用ArrayList，中间插入删除多用LinkedList
- queue和stack由LinkedList提供支持
- HashMap查询快；TreeMap总是按key升序排列；LinkedHashMap保持插入时顺序，查询比较快；
- HashSet查询快；TreeSet按key升序；LinkedHashSet保持插入时顺序；
- 过时的Vector、HashTable、Stack
- Collection 常用 List有序的，Set无序不重复的，queue排队确定顺序
- 迭代器Iterator只能向前移动，ListIterator可以双向移动

##ps:
- Iterator和Iterable区别
	因为Iterator接口的核心方法next()或者hasNext() 是依赖于迭代器的当前迭代位置的。 
	  如果Collection直接实现Iterator接口，势必导致集合对象中包含当前迭代位置的数据(指针)。 
	  当集合在不同方法间被传递时，由于当前迭代位置不可预置，那么next()方法的结果会变成不可预知。 
	  除非再为Iterator接口添加一个reset()方法，用来重置当前迭代位置。 
	  但即时这样，Collection也只能同时存在一个当前迭代位置。 
	  而Iterable则不然，每次调用都会返回一个从头开始计数的迭代器。 
	  多个迭代器是互不干扰的。 
 	参考 https://www.cnblogs.com/nbedk/p/6557341.html
 	
 	
 	
 	