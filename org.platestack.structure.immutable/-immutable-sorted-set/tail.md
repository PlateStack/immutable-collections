[immutable-collections](../../index.md) / [org.platestack.structure.immutable](../index.md) / [ImmutableSortedSet](index.md) / [tail](.)

# tail

`abstract fun tail(fromElement: E): `[`ImmutableSortedSet`](index.md)`<E>`

Returns a view of the portion of this set whose elements are
greater than or equal to fromElement.  The returned
set is backed by this set, so changes in the returned set are
reflected in this set, and vice-versa.  The returned set
supports all optional set operations that this set supports.

The returned set will throw an IllegalArgumentException
on an attempt to insert an element outside its range.

### Parameters

`fromElement` - low endpoint (inclusive) of the returned set

### Exceptions

`ClassCastException` - if fromElement is not compatible
    with this set's comparator (or, if the set has no comparator,
    if fromElement does not implement [Comparable](#)).
    Implementations may, but are not required to, throw this
    exception if fromElement cannot be compared to elements
    currently in the set.

`NullPointerException` - if fromElement is null
    and this set does not permit null elements

`IllegalArgumentException` - if this set itself has a
    restricted range, and fromElement lies outside the
    bounds of the range

**Return**
a view of the portion of this set whose elements are greater
    than or equal to fromElement

