[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [immutableHashMapOf](.)

# immutableHashMapOf

`fun <K, V> immutableHashMapOf(): `[`ImmutableMap`](-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L50)

Returns an empty shared map. The returned map is serializable.

`fun <K, V> immutableHashMapOf(pair: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L55)

Returns a singleton map. The returned map is serializable.

`fun <K, V> immutableHashMapOf(vararg pairs: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L60)

Returns a hash map with the specified contents, given as a list of pairs where the first component is the key and the second is the value. The returned map is serializable.

