[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.sequences.Sequence](index.md) / [toImmutableSortedSet](.)

# toImmutableSortedSet

`fun <E> Sequence<E>.toImmutableSortedSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`

Returns an immutable sorted set of all elements. The returned set is serializable.

The elements will be sorted by the given comparator.

This operation is *terminal*

