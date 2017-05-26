[immutable-collections](../index.md) / [org.platestack.structure.immutable](index.md) / [ImmutableMap](.)

# ImmutableMap

`interface ImmutableMap<K, out V> : Map<K, V>`

A [map](#) which strict that strictly prohibits modifications after its creation.

### Parameters

`K` - the type of map keys. The map is invariant on its key type, as it
    can accept key as a parameter (of [containsKey](#) for example) and return it in [keys](#) set.

`V` - the type of map values. The map is covariant on its value type.

### Extension Functions

| Name | Summary |
|---|---|
| [toImmutableHashMap](kotlin.collections.-map/to-immutable-hash-map.md) | `fun <K, V> Map<K, V>.toImmutableHashMap(): ImmutableMap<K, V>`<br>Returns an immutable hash map containing all key-value pairs from the original map. |
| [toImmutableMap](kotlin.collections.-map/to-immutable-map.md) | `fun <K, V> Map<K, V>.toImmutableMap(): ImmutableMap<K, V>`<br>Returns an immutable map containing all key-value pairs from the original map. |
| [toImmutableNavigableMap](kotlin.collections.-map/to-immutable-navigable-map.md) | `fun <K, V> Map<K, V>.toImmutableNavigableMap(): `[`ImmutableNavigableMap`](-immutable-navigable-map/index.md)`<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original map. |
| [toImmutableSortedMap](kotlin.collections.-map/to-immutable-sorted-map.md) | `fun <K, V> Map<K, V>.toImmutableSortedMap(comparator: `[`Comparator`](http://docs.oracle.com/javase/6/docs/api/java/util/Comparator.html)`<in K>?): `[`ImmutableSortedMap`](-immutable-sorted-map/index.md)`<K, V>`<br>Returns an immutable sorted map containing all key-value pairs from the original map. |

### Inheritors

| Name | Summary |
|---|---|
| [ImmutableSortedMap](-immutable-sorted-map/index.md) | `interface ImmutableSortedMap<K, out V> : ImmutableMap<K, V>`<br>An interface that mimics the original [SortedMap](http://docs.oracle.com/javase/6/docs/api/java/util/SortedMap.html) but without exposing modification functions to Kotlin source codes. |
