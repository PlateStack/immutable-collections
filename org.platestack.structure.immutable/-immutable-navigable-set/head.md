[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableNavigableSet](index.md) / [head](.)

# head

`abstract fun head(toElement: E, inclusive: Boolean): `[`ImmutableNavigableSet`](index.md)`<E>`

Returns a view of the portion of this set whose elements are less than
(or equal to, if `inclusive` is true) `toElement`.  The
returned set is backed by this set, so changes in the returned set are
reflected in this set, and vice-versa.  The returned set supports all
optional set operations that this set supports.

The returned set will throw an `IllegalArgumentException`
on an attempt to insert an element outside its range.

### Parameters

`toElement` - high endpoint of the returned set

`inclusive` - `true` if the high endpoint
    is to be included in the returned view

### Exceptions

`ClassCastException` - if `toElement` is not compatible
    with this set's comparator (or, if the set has no comparator,
    if `toElement` does not implement [Comparable](#)).
    Implementations may, but are not required to, throw this
    exception if `toElement` cannot be compared to elements
    currently in the set.

`NullPointerException` - if `toElement` is null and
    this set does not permit null elements

`IllegalArgumentException` - if this set itself has a
    restricted range, and `toElement` lies outside the
    bounds of the range

**Return**
a view of the portion of this set whose elements are less than
    (or equal to, if `inclusive` is true) `toElement`

`abstract fun head(toElement: E): `[`ImmutableSortedSet`](../-immutable-sorted-set/index.md)`<E>`

See [ImmutableSortedSet.head](../-immutable-sorted-set/head.md)

Equivalent to `headSet(toElement, false)`.

