[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [immutableMapOf](.)

# immutableMapOf

`fun <K, V> immutableMapOf(): `[`ImmutableMap`](-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L31)

Returns an empty shared map. The returned map is serializable.

`fun <K, V> immutableMapOf(pair: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L36)

Returns a singleton map. The returned map is serializable.

`fun <K, V> immutableMapOf(vararg pairs: Pair<K, V>): `[`ImmutableMap`](-immutable-map.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableMaps.kt#L43)

Returns a map with the specified contents, given as a list of pairs where the first value is the key and the second is the value. If multiple pairs have the same key, the resulting map will contain the value from the last of those pairs.

Entries of the map are iterated in the order they were specified. The returned map is serializable

