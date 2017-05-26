[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.collections.Map](index.md) / [toImmutableSortedMap](.)

# toImmutableSortedMap

`fun <K, V> Map<K, V>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>`

Returns an immutable sorted map containing all key-value pairs from the original map.

The returned map will be sorted by the given comparator.
The natural ordering will be use if the given comparator is null.

The returned map is serializable

