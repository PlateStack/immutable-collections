[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [java.util.NavigableMap](index.md) / [toImmutableNavigableMap](.)

# toImmutableNavigableMap

`fun <K, V> `[`NavigableMap`](http://docs.oracle.com/javase/6/docs/api/java/util/NavigableMap.html)`<K, V>.toImmutableNavigableMap(): `[`ImmutableNavigableMap`](../-immutable-navigable-map/index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L257)

Returns an immutable sorted map containing all key-value pairs from the original map.

The returned map will have the same comparator as the original map.

The returned map is serializable

