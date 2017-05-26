[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [immutableSortedMapOf](.)

# immutableSortedMapOf

`fun <K : Comparable<K>, V> immutableSortedMapOf(vararg pairs: Pair<K, V>): `[`ImmutableSortedMap`](-immutable-sorted-map/index.md)`<K, V>`

Returns a sorted map with the specified contents, given as a list of pairs where the first value is the key and the second is the value.

The returned map is serializable

`fun <K, V> immutableSortedMapOf(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?, vararg pairs: Pair<K, V>): `[`ImmutableSortedMap`](-immutable-sorted-map/index.md)`<K, V>`

Returns a sorted map with the specified contents, given as a list of pairs where the first value is the key and the second is the value.

The elements are sorted by the given comparator

The returned map is serializable

