[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.sequences.Sequence](index.md) / [toImmutableNavigableMap](.)

# toImmutableNavigableMap

`fun <K, V> Sequence<Pair<K, V>>.toImmutableNavigableMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>? = null): `[`ImmutableNavigableMap`](../-immutable-navigable-map/index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L308)

Returns an immutable sorted map containing all key-value pairs from the original source.

The returned map will be sorted by the given comparator.
The natural ordering will be use if the given comparator is null.

The returned map is serializable

