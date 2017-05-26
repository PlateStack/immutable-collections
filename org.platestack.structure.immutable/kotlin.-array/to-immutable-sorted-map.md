[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.Array](index.md) / [toImmutableSortedMap](.)

# toImmutableSortedMap

`fun <K, V> Array<Pair<K, V>>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>? = null): `[`ImmutableMap`](../-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L234)

Returns an immutable sorted map containing all key-value pairs from the original source.

The returned map will be sorted by the given comparator.
The natural ordering will be use if the given comparator is null.

The returned map is serializable

