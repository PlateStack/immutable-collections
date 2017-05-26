[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableSortedMap](index.md) / [sub](.)

# sub

`abstract fun sub(fromKey: K, toKey: K): `[`ImmutableSortedMap`](index.md)`<K, V>`

Returns a view of the portion of this map whose keys range from
`fromKey`, inclusive, to `toKey`, exclusive.  (If
`fromKey` and `toKey` are equal, the returned map
is empty.)  The returned map is backed by this map, so changes
in the returned map are reflected in this map, and vice-versa.
The returned map supports all optional map operations that this
map supports.

The returned map will throw an `IllegalArgumentException`
on an attempt to insert a key outside its range.

### Parameters

`fromKey` - low endpoint (inclusive) of the keys in the returned map

`toKey` - high endpoint (exclusive) of the keys in the returned map

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
    `fromKey`, inclusive, to `toKey`, exclusive

