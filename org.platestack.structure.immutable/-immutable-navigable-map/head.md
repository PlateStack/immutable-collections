[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [head](.)

# head

`abstract fun head(toKey: K, inclusive: Boolean): `[`ImmutableNavigableMap`](index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableMap.kt#L344)

Returns a view of the portion of this map whose keys are less than (or
equal to, if `inclusive` is true) `toKey`.  The returned
map is backed by this map, so changes in the returned map are reflected
in this map, and vice-versa.  The returned map supports all optional
map operations that this map supports.

The returned map will throw an `IllegalArgumentException`
on an attempt to insert a key outside its range.

### Parameters

`toKey` - high endpoint of the keys in the returned map

`inclusive` - `true` if the high endpoint
    is to be included in the returned view

### Exceptions

`ClassCastException` - if `toKey` is not compatible
    with this map's comparator (or, if the map has no comparator,
    if `toKey` does not implement [Comparable](#)).
    Implementations may, but are not required to, throw this
    exception if `toKey` cannot be compared to keys
    currently in the map.

`NullPointerException` - if `toKey` is null
    and this map does not permit null keys

`IllegalArgumentException` - if this map itself has a
    restricted range, and `toKey` lies outside the
    bounds of the range

**Return**
a view of the portion of this map whose keys are less than
    (or equal to, if `inclusive` is true) `toKey`

`abstract fun head(toKey: K): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableMap.kt#L396)

See [ImmutableSortedMap.head](../-immutable-sorted-map/head.md)

Equivalent to `headMap(toKey, false)`.

