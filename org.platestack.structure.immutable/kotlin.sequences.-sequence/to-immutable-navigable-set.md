[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.sequences.Sequence](index.md) / [toImmutableNavigableSet](.)

# toImmutableNavigableSet

`fun <E> Sequence<E>.toImmutableNavigableSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableNavigableSet`](../-immutable-navigable-set/index.md)`<E>`

Returns an immutable navigable set of all elements. The returned set is serializable.

The elements will be sorted by the given comparator.

This operation is *terminal*

