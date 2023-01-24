package com.dl.one;

/*
A sequence of elements supporting sequential and parallel aggregateoperations

To perform a computation, stream operations are composed into a stream pipeline. A stream pipeline consists of a source (which might be an array, a collection, a generator function, an I/O channel,etc), zero or more intermediate operations (which transform a stream into another stream, such as Stream.filter(Predicate)), and a terminal operation (which produces a result or side-effect, such as Stream.count() or Stream.forEach(Consumer)).Streams are lazy; computation on the source data is only performed when the terminal operation is initiated, and source elements are consumed only as needed. 

Collections and streams, while bearing some superficial similarities,have different goals. Collections are primarily concerned with the efficient management of, and access to, their elements. By contrast, streams do not provide a means to directly access or manipulate their elements, and are instead concerned with declaratively describing their source and the computational operations which will be performed in aggregate on that source.However, if the provided stream operations do not offer the desired functionality, the iterator() and spliterator() operations can be used to perform a controlled traversal. 

Most stream operations accept parameters that describe user-specified behavior, such as the lambda expression w -> w.getWeight() passed to mapToInt in the example above. To preserve correct behavior,these behavioral parameters: 
•must be non-interfering(they do not modify the stream source); and
•in most cases must be stateless(their result should not depend on any state that might change during execution of the stream pipeline).

Such parameters are always instances of a functional interface such as java.util.function.Function, and are often lambda expressions or method references. Unless otherwise specified these parameters must be non-null. 

A stream should be operated on (invoking an intermediate or terminal stream operation) only once. This rules out, for example, "forked" streams, where the same source feeds two or more pipelines, or multiple traversals of the same stream. A stream implementation may throw IllegalStateExceptionif it detects that the stream is being reused. However, since some stream operations may return their receiver rather than a new stream object, it may not be possible to detect reuse in all cases.


*/

import java.util.stream.Stream;

public class Eg15 {

	public static void main(String[] args) {
		
		Stream<Integer> s = Stream.of(1,2,3,4,5,6);
		System.out.println(s.count());

	}

}
