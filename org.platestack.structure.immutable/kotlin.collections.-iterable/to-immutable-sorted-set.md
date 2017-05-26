[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.collections.Iterable](index.md) / [toImmutableSortedSet](.)

# toImmutableSortedSet

`fun <E> Iterable<E>.toImmutableSortedSet(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in E>? = null): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableCollections.kt#L240)

Returns an immutable sorted set of all elements. The returned set is serializable.

The elements will be sorted by the given comparator.

