[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [java.util.SortedMap](index.md) / [toImmutableSortedMap](.)

# toImmutableSortedMap

`fun <K, V> `[`SortedMap`](http://docs.oracle.com/javase/6/docs/api/java/util/SortedMap.html)`<K, V>.toImmutableSortedMap(): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L202)

Returns an immutable sorted map containing all key-value pairs from the original map.

The returned map will have the same comparator as the original map.

The returned map is serializable

