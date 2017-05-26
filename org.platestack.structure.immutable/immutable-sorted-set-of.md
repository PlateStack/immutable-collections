[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [immutableSortedSetOf](.)

# immutableSortedSetOf

`fun <E> immutableSortedSetOf(vararg elements: E): `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>`

Returns an immutable sorted set of given elements. All elements inserted into a sorted set must implement the Comparable interface.

The returned set is serializable.

`fun <E> immutableSortedSetOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>?, vararg elements: E): `[`ImmutableSortedSet`](-immutable-sorted-set/index.md)`<E>`

Returns an immutable sorted set of given elements. All elements are will be sorted by the given comparator.

The returned set is serializable.

