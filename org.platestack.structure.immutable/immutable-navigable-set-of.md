[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [immutableNavigableSetOf](.)

# immutableNavigableSetOf

`fun <E> immutableNavigableSetOf(vararg elements: E): `[`ImmutableNavigableSet`](-immutable-navigable-set/index.md)`<E>`

Returns an immutable navigable set of given elements. All elements inserted into a sorted set must implement the Comparable interface.

The returned set is serializable.

`fun <E> immutableNavigableSetOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>?, vararg elements: E): `[`ImmutableNavigableSet`](-immutable-navigable-set/index.md)`<E>`

Returns an immutable navigable set of given elements. All elements are will be sorted by the given comparator.

The returned set is serializable.
