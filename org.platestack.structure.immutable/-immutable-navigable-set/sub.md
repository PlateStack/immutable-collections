[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableSet](index.md) / [sub](.)

# sub

`abstract fun sub(fromElement: E, fromInclusive: Boolean, toElement: E, toInclusive: Boolean): `[`ImmutableNavigableSet`](index.md)`<E>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableSet.kt#L193)

Returns a view of the portion of this set whose elements range from
`fromElement` to `toElement`.  If `fromElement` and
`toElement` are equal, the returned set is empty unless `fromInclusive` and `toInclusive` are both true.  The returned set
is backed by this set, so changes in the returned set are reflected in
this set, and vice-versa.  The returned set supports all optional set
operations that this set supports.

The returned set will throw an `IllegalArgumentException`
on an attempt to insert an element outside its range.

### Parameters

`fromElement` - low endpoint of the returned set

`fromInclusive` - `true` if the low endpoint
    is to be included in the returned view

`toElement` - high endpoint of the returned set

`toInclusive` - `true` if the high endpoint
    is to be included in the returned view

### Exceptions

`ClassCastException` - if `fromElement` and
    `toElement` cannot be compared to one another using this
    set's comparator (or, if the set has no comparator, using
    natural ordering).  Implementations may, but are not required
    to, throw this exception if `fromElement` or
    `toElement` cannot be compared to elements currently in
    the set.

`NullPointerException` - if `fromElement` or
    `toElement` is null and this set does
    not permit null elements

`IllegalArgumentException` - if `fromElement` is
    greater than `toElement`; or if this set itself
    has a restricted range, and `fromElement` or
    `toElement` lies outside the bounds of the range.

**Return**
a view of the portion of this set whose elements range from
    `fromElement`, inclusive, to `toElement`, exclusive

`abstract fun sub(fromElement: E, toElement: E): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>` [(source)](https://github.com/PlateStack/immutable-collections/blob/v0.1.0-alpha/src/main/kotlin/org/platestack/structure/immutable/ImmutableNavigableSet.kt#L273)

See [ImmutableSortedSet.sub](../-immutable-sorted-set/sub.md)

Equivalent to `subSet(fromElement, true, toElement, false)`.

