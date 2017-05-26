[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableMap](index.md) / [sub](.)

# sub

`abstract fun sub(fromKey: K, fromInclusive: Boolean, toKey: K, toInclusive: Boolean): `[`ImmutableNavigableMap`](index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableMap.kt#L307)

Returns a view of the portion of this map whose keys range from
`fromKey` to `toKey`.  If `fromKey` and
`toKey` are equal, the returned map is empty unless
`fromInclusive` and `toInclusive` are both true.  The
returned map is backed by this map, so changes in the returned map are
reflected in this map, and vice-versa.  The returned map supports all
optional map operations that this map supports.

The returned map will throw an `IllegalArgumentException`
on an attempt to insert a key outside of its range, or to construct a
submap either of whose endpoints lie outside its range.

### Parameters

`fromKey` - low endpoint of the keys in the returned map

`fromInclusive` - `true` if the low endpoint
    is to be included in the returned view

`toKey` - high endpoint of the keys in the returned map

`toInclusive` - `true` if the high endpoint
    is to be included in the returned view

### Exceptions

`ClassCastException` - if `fromKey` and `toKey`
    cannot be compared to one another using this map's comparator
    (or, if the map has no comparator, using natural ordering).
    Implementations may, but are not required to, throw this
    exception if `fromKey` or `toKey`
    cannot be compared to keys currently in the map.

`NullPointerException` - if `fromKey` or `toKey`
    is null and this map does not permit null keys

`IllegalArgumentException` - if `fromKey` is greater than
    `toKey`; or if this map itself has a restricted
    range, and `fromKey` or `toKey` lies
    outside the bounds of the range

**Return**
a view of the portion of this map whose keys range from
    `fromKey` to `toKey`

`abstract fun sub(fromKey: K, toKey: K): `[`ImmutableSortedMap`](../-immutable-sorted-map/index.md)`<K, V>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableMap.kt#L388)

See [ImmutableSortedMap.sub](../-immutable-sorted-map/sub.md)

Equivalent to `subMap(fromKey, true, toKey, false)`.

