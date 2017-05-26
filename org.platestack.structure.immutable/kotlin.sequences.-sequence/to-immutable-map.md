[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [kotlin.sequences.Sequence](index.md) / [toImmutableMap](.)

# toImmutableMap

`fun <K, V> Sequence<Pair<K, V>>.toImmutableMap(): `[`ImmutableMap`](../-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L152)

Returns an immutable map containing all key-value pairs from the original sequence.

The returned map preserves the entry sequence order.

The returned map is serializable

This operation is *terminal*

