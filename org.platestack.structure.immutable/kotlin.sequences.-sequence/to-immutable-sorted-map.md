[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.sequences.Sequence](index.md) / [toImmutableSortedMap](.)

# toImmutableSortedMap

`fun <K, V> Sequence<Pair<K, V>>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>? = null): `[`ImmutableMap`](../-immutable-map.md)`<K, V>`

Returns an immutable sorted map containing all key-value pairs from the original source.

The returned map will be sorted by the given comparator.
The natural ordering will be use if the given comparator is null.

The returned map is serializable

